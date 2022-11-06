package io.lalahtalks.secrets.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record SecretCreationRequestDto(
        @JsonProperty("encoded") SecretEncodedDto encoded) {

}
