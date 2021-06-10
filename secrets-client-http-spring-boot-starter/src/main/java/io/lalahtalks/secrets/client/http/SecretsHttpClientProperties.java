package io.lalahtalks.secrets.client.http;

import io.lalahtalks.spring.http.client.HttpApiClientProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "lalahtalks.secrets-http-api")
@Data
public class SecretsHttpClientProperties implements HttpApiClientProperties {

    private String url;

}
