package io.lalahtalks.secrets.client.http;

import io.lalahtalks.secrets.client.dto.SecretCreatedDto;
import io.lalahtalks.secrets.client.dto.SecretCreationRequestDto;
import io.lalahtalks.secrets.client.dto.SecretPageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import static io.lalahtalks.secrets.client.http.contract.SecretsHttpPaths.ACCOUNT_SECRETS_PATH;

@RequiredArgsConstructor
public class SecretsHttpClient {

    private final SecretsHttpErrorHandler errorHandler;
    private final WebClient webClient;

    public SecretPageDto getPage(String accountId, int pageNumber, int pageSize) {
        var uri = ACCOUNT_SECRETS_PATH + "?page={page}&size={size}";
        return webClient.get()
                .uri(uri, accountId, pageNumber, pageSize)
                .retrieve()
                .onStatus(errorHandler::canBeHandled, errorHandler::handleError)
                .bodyToMono(SecretPageDto.class)
                .block();
    }

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
