/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.util.credentials;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.util.KubeConfig;
import java.io.IOException;

/**
 * Uses a {@link KubeConfig} to configure {@link ApiClient} authentication to the Kubernetes API.
 *
 * <p>Tries to configure the following authentication mechanisms in this order.
 *
 * <ul>
 *   <li>{@link ClientCertificateAuthentication} (using client certificate files or data)
 *   <li>{@link UsernamePasswordAuthentication}
 *   <li>{@link AccessTokenAuthentication}
 * </ul>
 */
public class KubeconfigAuthentication implements Authentication {

  private final String username;
  private final String password;
  private final String token;
  private final byte[] clientCert;
  private final byte[] clientKey;

  public KubeconfigAuthentication(final KubeConfig config) throws IOException {
    this.clientCert =
        config.getDataOrFileRelative(
            config.getClientCertificateData(), config.getClientCertificateFile());
    this.clientKey =
        config.getDataOrFileRelative(config.getClientKeyData(), config.getClientKeyFile());
    this.username = config.getUsername();
    this.password = config.getPassword();
    this.token = config.getAccessToken();
  }

  @Override
  public void provide(ApiClient client) {
    if (clientCert != null && clientKey != null) {
      new ClientCertificateAuthentication(clientCert, clientKey).provide(client);
    }

    if (username != null && password != null) {
      new UsernamePasswordAuthentication(username, password).provide(client);
    }

    if (token != null) {
      new AccessTokenAuthentication(token).provide(client);
    }
  }
}
