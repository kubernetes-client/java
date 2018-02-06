package io.kubernetes.client.util.credentials;

import com.google.common.io.Resources;
import io.kubernetes.client.ApiClient;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.Test;

public class ClientCertificateAuthenticationTest {
  private static final String CLIENT_CERT_PATH = Resources.getResource("clientauth.cert").getPath();
  private static final String CLIENT_KEY_PATH = Resources.getResource("clientauth.key").getPath();

  @Test
  public void testValidCertificates() throws Exception {
    final ApiClient client = new ApiClient();
    final byte[] certificate = Files.readAllBytes(Paths.get(CLIENT_CERT_PATH));
    final byte[] key = Files.readAllBytes(Paths.get(CLIENT_KEY_PATH));
    new ClientCertificateAuthentication(certificate, key).provide(client);
  }

  @Test(expected = RuntimeException.class)
  public void testInvalidCertificates()  {
    final ApiClient client = new ApiClient();
    new ClientCertificateAuthentication(new byte[]{}, new byte[]{}).provide(client);
  }
}