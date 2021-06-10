package io.lalahtalks.secrets.client.http;

import io.lalahtalks.secrets.client.dto.SecretCreatedDto;
import io.lalahtalks.secrets.client.dto.SecretCreationRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import static io.lalahtalks.secrets.client.http.contract.SecretsHttpPaths.ACCOUNT_SECRETS_PATH;

@RequiredArgsConstructor
public class SecretsHttpClient {

    private final SecretsHttpErrorHandler errorHandler;
    private final WebClient webClient;

    public SecretCreatedDto create(String accountId, SecretCreationRequestDto request) {
        return webClient.post()
                .uri(ACCOUNT_SECRETS_PATH, accountId)
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(request)
                .retrieve()
                .onStatus(errorHandler::canBeHandled, errorHandler::handleError)
                .bodyToMono(SecretCreatedDto.class)
                .block();
    }

}
