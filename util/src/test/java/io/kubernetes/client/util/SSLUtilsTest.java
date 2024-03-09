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
package io.kubernetes.client.util;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.kubernetes.client.Resources;
import java.io.IOException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

class SSLUtilsTest {

  private static final String CLIENT_CERT = "clientauth.cert";

  private static final String CLIENT_KEY_RSA_PKCS8 = "clientauth.key";

  private static final String CLIENT_KEY_RSA_PKCS1 = "clientauth-rsa.key";

  private static final String CLIENT_KEY_ECDSA_PKCS7 = "clientauth-ec.key";

  private static final String CLIENT_KEY_ECDSA_PKCS8 = "clientauth-ec-fixed.key";

  private static final String RSA_ALGORITHM = "RSA";

  private static final String ECDSA_ALGORITHM = "ECDSA";

  @Test
  void loadKeyRsaPkcs8() throws IOException, GeneralSecurityException {
    final PrivateKey privateKey = assertLoadDumpReloadKeyEquals(CLIENT_KEY_RSA_PKCS8);
    assertThat(privateKey.getAlgorithm()).isEqualTo(RSA_ALGORITHM);
  }

  @Test
  void loadKeyRsaPkcs1() throws IOException, GeneralSecurityException {
    final PrivateKey privateKey = assertLoadDumpReloadKeyEquals(CLIENT_KEY_RSA_PKCS1);
    assertThat(privateKey.getAlgorithm()).isEqualTo(RSA_ALGORITHM);
  }

  @Test
  void loadKeyEcdsaPkcs7() throws IOException, GeneralSecurityException {
    final PrivateKey privateKey = assertLoadDumpReloadKeyEquals(CLIENT_KEY_ECDSA_PKCS7);
    assertThat(privateKey.getAlgorithm()).isEqualTo(ECDSA_ALGORITHM);
  }

  @Test
  void loadKeyEcdsaPkcs8() throws IOException, GeneralSecurityException {
    final PrivateKey privateKey = assertLoadDumpReloadKeyEquals(CLIENT_KEY_ECDSA_PKCS8);
    assertThat(privateKey.getAlgorithm()).isEqualTo(ECDSA_ALGORITHM);
  }

  @Test
  void loadKeyCertificateNotSupported() throws Exception {
    final byte[] resourceBytes = getResourceBytes(CLIENT_CERT);

    assertThatThrownBy(() -> SSLUtils.loadKey(resourceBytes))
        .isInstanceOf(InvalidKeySpecException.class);
  }

  private PrivateKey assertLoadDumpReloadKeyEquals(final String filePath)
      throws IOException, GeneralSecurityException {
    final byte[] resourceBytes = getResourceBytes(filePath);
    final PrivateKey privateKey = SSLUtils.loadKey(resourceBytes);

    byte[] dumpedKey = SSLUtils.dumpKey(privateKey);
    final PrivateKey reloadedPrivateKey = SSLUtils.loadKey(dumpedKey);

    assertThat(reloadedPrivateKey).isEqualTo(privateKey);

    return privateKey;
  }

  private byte[] getResourceBytes(final String filePath) throws IOException {
    final URL resourceUrl = Resources.getResource(filePath);
    return IOUtils.toByteArray(resourceUrl);
  }
}
