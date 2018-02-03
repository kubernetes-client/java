package io.kubernetes.client.util.credentials;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.util.KubeConfig;
import java.io.IOException;

public class KubeconfigCredentialProvider implements CredentialProvider {

  private final String username;
  private final String password;
  private final String token;
  private final byte[] clientCert;
  private final byte[] clientKey;

  public KubeconfigCredentialProvider(final KubeConfig config) throws IOException {
    this.clientCert = KubeConfig.getDataOrFile(config.getClientCertificateData(), config.getClientCertificateFile());
    this.clientKey = KubeConfig.getDataOrFile(config.getClientKeyData(), config.getClientKeyFile());
    this.username = config.getUsername();
    this.password = config.getPassword();
    this.token = config.getAccessToken();
  }

  @Override public void provide(ApiClient client) {
    if(clientCert != null && clientKey != null) {
      new ClientCertificateCredentialProvider(clientCert, clientKey);
    }

    if(username != null && password != null) {
      new UsernamePasswordCredentialProvider(username, password).provide(client);
    }

    if(token != null) {
      new AccessTokenCredentialProvider(token).provide(client);
    }
  }
}
