package io.kubernetes.client.util.credentials;

import io.kubernetes.client.ApiClient;
import java.nio.charset.Charset;
import okio.ByteString;

public class UsernamePasswordCredentialProvider implements CredentialProvider {
  private final String username;
  private final String password;

  public UsernamePasswordCredentialProvider(final String username, final String password) {
    this.username = username;
    this.password = password;
  }

  @Override public void provide(ApiClient client) {
    final String usernameAndPassword = username + ":" + password;
    client.setApiKeyPrefix("Basic");
    client.setApiKey(ByteString.of(usernameAndPassword.getBytes(Charset.forName("ISO-8859-1"))).base64());
  }
}
