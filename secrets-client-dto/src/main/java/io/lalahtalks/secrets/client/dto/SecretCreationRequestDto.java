package io.lalahtalks.secrets.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record SecretCreationRequestDto(
        @JsonProperty("name") String name,
        @JsonProperty("encoded") String encoded) {

}
