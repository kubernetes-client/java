package io.kubernetes.client.util.credentials;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.util.ClientBuilder;

/**
 * Allows the implementation of different authentication mechanisms for the Kubernetes API.
 *
 * @see ClientBuilder#setAuthentication(Authentication)
 */
public interface Authentication {

  void provide(ApiClient client);

}
