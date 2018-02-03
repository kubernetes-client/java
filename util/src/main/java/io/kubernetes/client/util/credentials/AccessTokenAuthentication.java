package io.kubernetes.client.util.credentials;

import io.kubernetes.client.ApiClient;

/**
 * Uses a Bearer Token to configure {@link ApiClient} authentication to the Kubernetes API.
 */
public class AccessTokenAuthentication implements Authentication {
  private String token;

  public AccessTokenAuthentication(final String token) {
    this.token = token;
  }

  @Override public void provide(ApiClient client) {
    client.setApiKeyPrefix("Bearer");
    client.setApiKey(token);
  }
}
