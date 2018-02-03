package io.kubernetes.client.util.credentials;

import io.kubernetes.client.ApiClient;

public interface CredentialProvider {

  void provide(ApiClient client);

}
