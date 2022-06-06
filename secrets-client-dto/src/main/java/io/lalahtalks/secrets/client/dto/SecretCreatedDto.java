package io.lalahtalks.secrets.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;

public record SecretCreatedDto(
        @JsonProperty("secretId") String secretId,
        @JsonProperty("createdAt") Instant createdAt) {

}
