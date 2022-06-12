package io.lalahtalks.secrets.client.http;

import io.lalahtalks.secrets.client.dto.SecretCreatedDto;
import io.lalahtalks.secrets.client.dto.SecretCreationRequestDto;
import io.lalahtalks.secrets.client.dto.SecretPageDto;
import io.lalahtalks.secrets.client.http.contract.problem.SecretsProblem;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import static io.lalahtalks.secrets.client.http.contract.SecretsHttpPaths.ACCOUNT_SECRETS_PATH;

public class SecretsHttpClient {

    private final WebClient webClient;

    public SecretsHttpClient(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<SecretPageDto> getPage(String accountId, int pageNumber, int pageSize) {
        var uri = ACCOUNT_SECRETS_PATH + "?page={page}&size={size}";
        return webClient.get()
                .uri(uri, accountId, pageNumber, pageSize)
                .retrieve()
                .onStatus(HttpStatus::isError, this::handle)
                .bodyToMono(SecretPageDto.class);
    }

    public Mono<SecretCreatedDto> create(String accountId, SecretCreationRequestDto request) {
        return webClient.post()
                .uri(ACCOUNT_SECRETS_PATH, accountId)
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(request)
                .retrieve()
                .onStatus(HttpStatus::isError, this::handle)
                .bodyToMono(SecretCreatedDto.class);
    }

    private Mono<? extends Throwable> handle(ClientResponse clientResponse) {
        return clientResponse.bodyToMono(SecretsProblem.class);
    }

}
