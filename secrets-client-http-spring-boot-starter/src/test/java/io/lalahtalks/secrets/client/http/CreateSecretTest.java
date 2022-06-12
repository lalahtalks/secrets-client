package io.lalahtalks.secrets.client.http;

import io.lalahtalks.secrets.client.http.test.SpringContextAware;
import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

import static io.lalahtalks.secrets.client.http.test.DataAccount.ACCOUNT_1_ID_VALUE;
import static io.lalahtalks.secrets.client.http.test.DataSecret.SECRET_CREATED_DTO;
import static io.lalahtalks.secrets.client.http.test.DataSecret.SECRET_CREATION_REQUEST_1_DTO;

class CreateSecretTest extends SpringContextAware {

    @Test
    void it_works() {
        var actual = secretsHttpClient.create(ACCOUNT_1_ID_VALUE, SECRET_CREATION_REQUEST_1_DTO);
        StepVerifier.create(actual.log())
                .expectNext(SECRET_CREATED_DTO)
                .verifyComplete();
    }

}
