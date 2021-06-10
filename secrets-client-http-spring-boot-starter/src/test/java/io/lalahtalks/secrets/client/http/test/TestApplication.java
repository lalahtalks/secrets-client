package io.lalahtalks.secrets.client.http.test;

import io.lalahtalks.secrets.client.http.SecretsHttpClientAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SecretsHttpClientAutoConfiguration.class)
public class TestApplication {

}
