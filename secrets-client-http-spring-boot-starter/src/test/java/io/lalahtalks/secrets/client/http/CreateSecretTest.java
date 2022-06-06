package io.lalahtalks.secrets.client.http;

import io.lalahtalks.secrets.client.http.test.SpringContextAware;
import org.junit.jupiter.api.Test;

import static io.lalahtalks.secrets.client.http.test.DataAccount.ACCOUNT_1_ID_VALUE;
import static io.lalahtalks.secrets.client.http.test.DataSecret.SECRET_CREATED_DTO;
import static io.lalahtalks.secrets.client.http.test.DataSecret.SECRET_CREATION_REQUEST_1_DTO;
import static org.assertj.core.api.Assertions.assertThat;

class CreateSecretTest extends SpringContextAware {

    @Test
    void it_works() {
        var actual = secretsHttpClient.create(ACCOUNT_1_ID_VALUE, SECRET_CREATION_REQUEST_1_DTO);
        assertThat(actual).isEqualTo(SECRET_CREATED_DTO);
    }

}
