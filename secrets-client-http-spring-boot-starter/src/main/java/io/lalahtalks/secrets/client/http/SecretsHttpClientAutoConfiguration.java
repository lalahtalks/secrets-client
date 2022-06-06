package io.lalahtalks.secrets.client.http;

import io.lalahtalks.spring.http.client.WebClientFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableConfigurationProperties(SecretsHttpClientProperties.class)
public class SecretsHttpClientAutoConfiguration {

    private final SecretsHttpClientProperties clientProperties;
    private final WebClientFactory webClientFactory;

    public SecretsHttpClientAutoConfiguration(SecretsHttpClientProperties clientProperties,
                                              WebClientFactory webClientFactory) {
        this.clientProperties = clientProperties;
        this.webClientFactory = webClientFactory;
    }

    @Bean
    public SecretsHttpClient secretsHttpClient() {
        var webClient = webClientFactory.create(clientProperties);
        return new SecretsHttpClient(webClient);
    }

}
