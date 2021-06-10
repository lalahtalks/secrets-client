package io.lalahtalks.secrets.client.http.test;

import io.lalahtalks.secrets.client.dto.SecretCreatedDto;
import io.lalahtalks.secrets.client.dto.SecretCreationRequestDto;
import lombok.NoArgsConstructor;

import static io.lalahtalks.secrets.client.http.test.DataInstant.NOW;
import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class DataSecret {

    public static final String SECRET_1_ID_VALUE = "secret_1";
    public static final String SECRET_1_NAME_VALUE = "Secret 1";
    public static final String SECRET_1_ENCODED = "some_encoded_value";

    public static final SecretCreationRequestDto SECRET_CREATION_REQUEST_1_DTO = SecretCreationRequestDto.builder()
            .name(SECRET_1_NAME_VALUE)
            .encoded(SECRET_1_ENCODED)
            .build();

    public static final SecretCreatedDto SECRET_CREATED_DTO = SecretCreatedDto.builder()
            .secretId(SECRET_1_ID_VALUE)
            .createdAt(NOW)
            .build();

}
