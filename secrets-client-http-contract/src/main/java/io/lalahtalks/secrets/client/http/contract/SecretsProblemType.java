package io.lalahtalks.secrets.client.http.contract;

import io.lalahtalks.spring.problem.ProblemType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.zalando.problem.Status;

import java.net.URI;

@RequiredArgsConstructor
@Getter
public enum SecretsProblemType implements ProblemType {

    ;

    private final URI type;
    private final String title;
    private final Status httpStatus;

}
