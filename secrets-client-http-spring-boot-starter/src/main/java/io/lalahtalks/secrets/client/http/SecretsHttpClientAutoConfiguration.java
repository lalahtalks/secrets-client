package io.lalahtalks.secrets.client.http;

import io.lalahtalks.spring.http.client.WebClientFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableConfigurationProperties(SecretsHttpClientProperties.class)
@RequiredArgsConstructor
public class SecretsHttpClientAutoConfiguration {

    private final SecretsHttpClientProperties clientProperties;
    private final WebClientFactory webClientFactory;

    @Bean
    public SecretsHttpClient secretsHttpClient(SecretsHttpErrorHandler errorHandler) {
        var webClient = webClientFactory.create(clientProperties);
        return new SecretsHttpClient(errorHandler, webClient);
    }

}
