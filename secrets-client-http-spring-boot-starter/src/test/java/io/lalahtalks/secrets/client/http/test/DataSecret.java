package io.lalahtalks.secrets.client.http.test;

import io.lalahtalks.paging.dto.PagingDto;
import io.lalahtalks.secrets.client.dto.*;

import java.util.List;

import static io.lalahtalks.secrets.client.http.test.DataInstant.NOW;

public class DataSecret {

    public static final String SECRET_1_ID_VALUE = "secret_1";

    public static final String ENCODED_NAME_VALUE = "encoded_name";
    public static final String ENCODED_URL_VALUE = "encoded_url";
    public static final String ENCODED_USERNAME_VALUE = "encoded_username";
    public static final String ENCODED_PASSWORD_VALUE = "encoded_password";

    public static final SecretEncodedDto SECRET_ENCODED_1_DTO = new SecretEncodedDto(
            ENCODED_NAME_VALUE,
            ENCODED_URL_VALUE,
            ENCODED_USERNAME_VALUE,
            ENCODED_PASSWORD_VALUE
    );

    public static final SecretDto SECRET_1_DTO = new SecretDto(
            SECRET_1_ID_VALUE,
            SECRET_ENCODED_1_DTO,
            NOW
    );

    public static final SecretCreationRequestDto SECRET_CREATION_REQUEST_1_DTO = new SecretCreationRequestDto(
            SECRET_ENCODED_1_DTO
    );

    public static final SecretCreatedDto SECRET_CREATED_DTO = new SecretCreatedDto(SECRET_1_ID_VALUE, NOW);

    public static final SecretPageDto SECRET_PAGE_DTO = new SecretPageDto(
            new PagingDto(0, 25, 1L, 1),
            List.of(SECRET_1_DTO));

    private DataSecret() {

    }

}
