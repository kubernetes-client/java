package io.kubernetes.client.util.credentials;

import io.kubernetes.client.ApiClient;

public class AccessTokenCredentialProvider implements CredentialProvider {
  private String token;

  public AccessTokenCredentialProvider(final String token) {
    this.token = token;
  }

  @Override public void provide(ApiClient client) {
    client.setApiKeyPrefix("Bearer");
    client.setApiKey(token);
  }
}
