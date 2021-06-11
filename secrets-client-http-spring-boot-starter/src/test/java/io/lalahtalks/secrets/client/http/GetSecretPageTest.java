package io.lalahtalks.secrets.client.http;

import io.lalahtalks.secrets.client.http.test.TestApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;
import org.springframework.test.context.ActiveProfiles;

import static io.lalahtalks.secrets.client.http.test.DataAccount.ACCOUNT_1_ID_VALUE;
import static io.lalahtalks.secrets.client.http.test.DataSecret.SECRET_PAGE_DTO;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = TestApplication.class)
@AutoConfigureWireMock(port = 0)
@ActiveProfiles("test")
public class GetSecretPageTest {

    @Autowired
    private SecretsHttpClient secretsHttpClient;

    @Test
    void it_works() {
        var actual = secretsHttpClient.getPage(ACCOUNT_1_ID_VALUE, 0, 25);
        assertThat(actual).isEqualTo(SECRET_PAGE_DTO);
    }

}
