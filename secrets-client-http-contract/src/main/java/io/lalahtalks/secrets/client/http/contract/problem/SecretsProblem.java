package io.lalahtalks.secrets.client.http.contract.problem;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

import java.net.URI;

import static com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = PROPERTY, property = "type", visible = true, defaultImpl = UnknownSecretsProblem.class)
public abstract class SecretsProblem extends AbstractThrowableProblem {

    static final String TYPE_PREFIX = "urn:lalahtalks:problem:secrets:";

    public SecretsProblem(String type, String title, Status status, String detail) {
        super(URI.create(type), title, status, detail);
    }

}
