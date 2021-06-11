package io.lalahtalks.secrets.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SecretCreationRequestDto {

    @JsonProperty("name")
    String name;

    @JsonProperty("encoded")
    String encoded;

}
