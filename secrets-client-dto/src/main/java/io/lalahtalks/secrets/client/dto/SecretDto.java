package io.lalahtalks.secrets.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

import java.time.Instant;

@Value
@Builder
public class SecretDto {

    @JsonProperty("id")
    String id;

    @JsonProperty("name")
    String name;

    @JsonProperty("encoded")
    String encoded;

    @JsonProperty("createdAt")
    Instant createdAt;

}
