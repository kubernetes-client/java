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
import org.apache.commons.lang3.StringUtils;

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

  private final Authentication delegateAuthentication;

  public KubeconfigAuthentication(final KubeConfig config) throws IOException {
    byte[] clientCert =
        config.getDataOrFileRelative(
            config.getClientCertificateData(), config.getClientCertificateFile());
    byte[] clientKey =
        config.getDataOrFileRelative(config.getClientKeyData(), config.getClientKeyFile());

    // 1. honors x509 key-pairs
    if (clientCert != null && clientKey != null) {
      delegateAuthentication = new ClientCertificateAuthentication(clientCert, clientKey);
      return;
    }

    // 2. honors username/password
    String userName = config.getUsername();
    String userPassword = config.getPassword();
    if (StringUtils.isNotEmpty(userName) && StringUtils.isNotEmpty(userPassword)) {
      delegateAuthentication = new UsernamePasswordAuthentication(userName, userPassword);
      return;
    }

    // 3. honors bearer token
    String token = config.getAccessToken();
    if (StringUtils.isNotEmpty(token)) {
      delegateAuthentication = new AccessTokenAuthentication(token);
      return;
    }

    // 4. falling back to dummy authentication
    delegateAuthentication = new DummyAuthentication();
  }

  @Override
  public void provide(ApiClient client) {
    delegateAuthentication.provide(client);
  }

  public Authentication getDelegateAuthentication() {
    return delegateAuthentication;
  }
}
