package io.lalahtalks.secrets.client.http.test;

import io.lalahtalks.paging.dto.PagingDto;
import io.lalahtalks.secrets.client.dto.SecretCreatedDto;
import io.lalahtalks.secrets.client.dto.SecretCreationRequestDto;
import io.lalahtalks.secrets.client.dto.SecretDto;
import io.lalahtalks.secrets.client.dto.SecretPageDto;
import lombok.NoArgsConstructor;

import static io.lalahtalks.secrets.client.http.test.DataInstant.NOW;
import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class DataSecret {

    public static final String SECRET_1_ID_VALUE = "secret_1";
    public static final String SECRET_1_NAME_VALUE = "Secret 1";
    public static final String SECRET_1_ENCODED_VALUE = "some_encoded_value";

    public static final SecretDto SECRET_1_DTO = SecretDto.builder()
            .id(SECRET_1_ID_VALUE)
            .name(SECRET_1_NAME_VALUE)
            .encoded(SECRET_1_ENCODED_VALUE)
            .createdAt(NOW)
            .build();

    public static final SecretCreationRequestDto SECRET_CREATION_REQUEST_1_DTO = SecretCreationRequestDto.builder()
            .name(SECRET_1_NAME_VALUE)
            .encoded(SECRET_1_ENCODED_VALUE)
            .build();

    public static final SecretCreatedDto SECRET_CREATED_DTO = SecretCreatedDto.builder()
            .secretId(SECRET_1_ID_VALUE)
            .createdAt(NOW)
            .build();

    public static final SecretPageDto SECRET_PAGE_DTO = SecretPageDto.builder()
            .paging(PagingDto.builder()
                    .number(0)
                    .size(25)
                    .totalElements(1L)
                    .totalPages(1)
                    .build())
            .element(SECRET_1_DTO)
            .build();

}
