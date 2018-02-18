package io.kubernetes.client.util.credentials;

import io.kubernetes.client.ApiClient;
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
        KubeConfig.getDataOrFile(
            config.getClientCertificateData(), config.getClientCertificateFile());
    this.clientKey = KubeConfig.getDataOrFile(config.getClientKeyData(), config.getClientKeyFile());
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
