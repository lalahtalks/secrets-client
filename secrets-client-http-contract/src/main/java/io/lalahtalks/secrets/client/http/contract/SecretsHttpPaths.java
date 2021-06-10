package io.lalahtalks.secrets.client.http.contract;

import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class SecretsHttpPaths {

    public static final String ACCOUNTS_PATH = "/accounts";
    public static final String ACCOUNT_ID = "accountId";
    public static final String ACCOUNT_ID_PLACEHOLDER = '{' + ACCOUNT_ID + '}';
    public static final String ACCOUNT_ID_PATH = '/' + ACCOUNT_ID_PLACEHOLDER;
    public static final String ACCOUNT_PATH = ACCOUNTS_PATH + ACCOUNT_ID_PATH;

    public static final String SECRETS_PATH = "/secrets";
    public static final String SECRET_ID = "secretId";
    public static final String SECRET_ID_PLACEHOLDER = '{' + SECRET_ID + '}';
    public static final String SECRET_ID_PATH = '/' + SECRET_ID_PLACEHOLDER;
    public static final String SECRET_PATH = SECRETS_PATH + SECRET_ID_PATH;

    public static final String ACCOUNT_SECRETS_PATH = ACCOUNT_PATH + SECRETS_PATH;

}
