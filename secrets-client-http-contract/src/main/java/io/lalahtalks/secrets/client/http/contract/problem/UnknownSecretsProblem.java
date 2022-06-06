package io.lalahtalks.secrets.client.http.contract.problem;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.zalando.problem.Status;

public final class UnknownSecretsProblem extends SecretsProblem {

    @JsonCreator
    public UnknownSecretsProblem(
            @JsonProperty("type") String type,
            @JsonProperty("title") String title,
            @JsonProperty("status") Integer status,
            @JsonProperty("detail") String detail) {
        super(type, title, Status.valueOf(status), detail);
    }

}
