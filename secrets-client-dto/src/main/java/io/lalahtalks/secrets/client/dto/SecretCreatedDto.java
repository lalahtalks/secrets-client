package io.lalahtalks.secrets.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

import java.time.Instant;

@Value
@Builder
public class SecretCreatedDto {

    @JsonProperty("secretId")
    String secretId;

    @JsonProperty("createdAt")
    Instant createdAt;

}
