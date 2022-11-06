package io.lalahtalks.secrets.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record SecretEncodedDto(
        @JsonProperty("name") String name,
        @JsonProperty("url") String url,
        @JsonProperty("username") String username,
        @JsonProperty("password") String password) {

}
