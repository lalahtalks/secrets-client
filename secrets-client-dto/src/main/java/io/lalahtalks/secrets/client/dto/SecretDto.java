package io.lalahtalks.secrets.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;

public record SecretDto(
        @JsonProperty("id") String id,
        @JsonProperty("name") String name,
        @JsonProperty("encoded") String encoded,
        @JsonProperty("createdAt") Instant createdAt) {

}
