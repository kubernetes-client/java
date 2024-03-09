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
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ClientCertificateAuthenticationTest {
  private static final String CLIENT_CERT_PATH =
      new File(Resources.getResource("clientauth.cert").getPath()).toString();
  private static final String CLIENT_EC_CERT_PATH =
      new File(Resources.getResource("clientauth-ec.cert").getPath()).toString();

  // RSA key in PKCS8 format
  private static final String CLIENT_KEY_PATH =
      new File(Resources.getResource("clientauth.key").getPath()).toString();
  // EC key in PKCS8 format
  private static final String CLIENT_EC_KEY_PATH =
      new File(Resources.getResource("clientauth-ec-fixed.key").getPath()).toString();
  // RSA key in PKCS1 format
  private static final String CLIENT_KEY_OLD_PATH =
      new File(Resources.getResource("clientauth-rsa.key").getPath()).toString();
  // EC key in PKCS7 format
  private static final String CLIENT_EC_KEY_OLD_PATH =
      new File(Resources.getResource("clientauth-ec.key").getPath()).toString();

  private static final String CLIENT_CERT_CHAIN_PATH =
      new File(Resources.getResource("clientauth-chain.cert").getPath()).toString();
  private static final String CLIENT_CERT_CHAIN_KEY_PATH =
      new File(Resources.getResource("clientauth-chain.key").getPath()).toString();

  @Test
  void validCertificates() throws Exception {
    final ApiClient client = new ApiClient();
    final byte[] certificate = Files.readAllBytes(Paths.get(CLIENT_CERT_PATH));
    final byte[] key = Files.readAllBytes(Paths.get(CLIENT_KEY_PATH));
    new ClientCertificateAuthentication(certificate, key).provide(client);
  }

  @Test
  void invalidCertificates() {
    final ApiClient client = new ApiClient();
    assertThatThrownBy(
            () -> new ClientCertificateAuthentication(new byte[] {}, new byte[] {}).provide(client))
        .isInstanceOf(RuntimeException.class);
  }

  @Test
  void validECCertificates() throws Exception {
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
  void validCertificatesChain() throws Exception {
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
  void validOldECCertificates() throws Exception {
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
