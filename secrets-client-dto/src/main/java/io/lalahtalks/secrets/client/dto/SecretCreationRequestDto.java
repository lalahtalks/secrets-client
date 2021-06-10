package io.lalahtalks.secrets.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SecretCreationRequestDto {

    @JsonProperty("name")
    private String name;

    @JsonProperty("encoded")
    private String encoded;

}
