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

import io.kubernetes.client.Resources;
import io.kubernetes.client.openapi.ApiClient;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.Test;

public class ClientCertificateAuthenticationTest {
  private static final String CLIENT_CERT_PATH = Resources.getResource("clientauth.cert").getPath();
  private static final String CLIENT_EC_CERT_PATH =
      Resources.getResource("clientauth-ec.cert").getPath();

  // RSA key in PKCS8 format
  private static final String CLIENT_KEY_PATH = Resources.getResource("clientauth.key").getPath();
  // EC key in PKCS8 format
  private static final String CLIENT_EC_KEY_PATH =
      Resources.getResource("clientauth-ec-fixed.key").getPath();
  // RSA key in PKCS1 format
  private static final String CLIENT_KEY_OLD_PATH =
      Resources.getResource("clientauth-rsa.key").getPath();
  // EC key in PKCS7 format
  private static final String CLIENT_EC_KEY_OLD_PATH =
      Resources.getResource("clientauth-ec.key").getPath();

  private static final String CLIENT_CERT_CHAIN_PATH =
      Resources.getResource("clientauth-chain.cert").getPath();
  private static final String CLIENT_CERT_CHAIN_KEY_PATH =
      Resources.getResource("clientauth-chain.key").getPath();

  @Test
  public void testValidCertificates() throws Exception {
    final ApiClient client = new ApiClient();
    final byte[] certificate = Files.readAllBytes(Paths.get(CLIENT_CERT_PATH));
    final byte[] key = Files.readAllBytes(Paths.get(CLIENT_KEY_PATH));
    new ClientCertificateAuthentication(certificate, key).provide(client);
  }

  @Test(expected = RuntimeException.class)
  public void testInvalidCertificates() {
    final ApiClient client = new ApiClient();
    new ClientCertificateAuthentication(new byte[] {}, new byte[] {}).provide(client);
  }

  @Test
  public void testValidECCertificates() throws Exception {
    try {
      final ApiClient client = new ApiClient();
      final byte[] certificate = Files.readAllBytes(Paths.get(CLIENT_EC_CERT_PATH));
      final byte[] key = Files.readAllBytes(Paths.get(CLIENT_EC_KEY_PATH));
      new ClientCertificateAuthentication(certificate, key).provide(client);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testValidCertificatesChain() throws Exception {
    try {
      final ApiClient client = new ApiClient();
      final byte[] certificate = Files.readAllBytes(Paths.get(CLIENT_CERT_CHAIN_PATH));
      final byte[] key = Files.readAllBytes(Paths.get(CLIENT_CERT_CHAIN_KEY_PATH));
      new ClientCertificateAuthentication(certificate, key).provide(client);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  @Test
  public void testValidOldECCertificates() throws Exception {
    try {
      final ApiClient client = new ApiClient();
      final byte[] certificate = Files.readAllBytes(Paths.get(CLIENT_EC_CERT_PATH));
      final byte[] key = Files.readAllBytes(Paths.get(CLIENT_EC_KEY_OLD_PATH));
      new ClientCertificateAuthentication(certificate, key).provide(client);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
