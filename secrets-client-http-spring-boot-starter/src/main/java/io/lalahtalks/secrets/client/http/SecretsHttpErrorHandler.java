package io.lalahtalks.secrets.client.http;

import io.lalahtalks.secrets.client.http.contract.SecretsProblemType;
import io.lalahtalks.secrets.client.http.exception.UnknownSecretsErrorException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.zalando.problem.Problem;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

@Component
public class SecretsHttpErrorHandler {

    private final Map<URI, Function<String, Exception>> errorMappings = new HashMap<>();

    public SecretsHttpErrorHandler() {

    }

    public boolean canBeHandled(HttpStatus status) {
        return Stream.of(SecretsProblemType.values())
                .anyMatch(errorType -> errorType.getHttpStatus().getStatusCode() == status.value());
    }

    public Mono<Throwable> handleError(ClientResponse response) {
        return response.bodyToMono(Problem.class)
                .map(this::toError);
    }

    private Exception toError(Problem problem) {
        return errorMappings.getOrDefault(problem.getType(), UnknownSecretsErrorException::new)
                .apply(problem.getDetail());
    }

}
