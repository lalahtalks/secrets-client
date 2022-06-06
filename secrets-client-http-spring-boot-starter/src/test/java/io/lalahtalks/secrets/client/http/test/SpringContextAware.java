package io.lalahtalks.secrets.client.http.test;

import io.lalahtalks.secrets.client.http.SecretsHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = TestApplication.class)
@AutoConfigureWireMock(port = 0)
@ActiveProfiles("test")
public abstract class SpringContextAware {

    @Autowired
    protected SecretsHttpClient secretsHttpClient;

}
