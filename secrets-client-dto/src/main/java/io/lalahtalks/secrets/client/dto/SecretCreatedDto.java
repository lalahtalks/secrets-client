package io.lalahtalks.secrets.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class SecretCreatedDto {

    @JsonProperty("secretId")
    private String secretId;

    @JsonProperty("createdAt")
    private Instant createdAt;

}
