package io.lalahtalks.secrets.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;

public record SecretDto(
        @JsonProperty("id") String id,
        @JsonProperty("encoded") SecretEncodedDto encoded,
        @JsonProperty("createdAt") Instant createdAt) {

}
