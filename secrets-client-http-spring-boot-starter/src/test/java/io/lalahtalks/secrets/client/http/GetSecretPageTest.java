package io.lalahtalks.secrets.client.http;

import io.lalahtalks.secrets.client.http.test.SpringContextAware;
import org.junit.jupiter.api.Test;

import static io.lalahtalks.secrets.client.http.test.DataAccount.ACCOUNT_1_ID_VALUE;
import static io.lalahtalks.secrets.client.http.test.DataSecret.SECRET_PAGE_DTO;
import static org.assertj.core.api.Assertions.assertThat;

class GetSecretPageTest extends SpringContextAware {

    @Test
    void it_works() {
        var actual = secretsHttpClient.getPage(ACCOUNT_1_ID_VALUE, 0, 25);
        assertThat(actual).usingRecursiveComparison().isEqualTo(SECRET_PAGE_DTO);
    }

}
