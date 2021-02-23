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
import io.kubernetes.client.util.SSLUtils;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.net.ssl.KeyManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Uses Client Certificates to configure {@link ApiClient} authentication to the Kubernetes API. */
public class ClientCertificateAuthentication implements Authentication {
  private static final Logger log = LoggerFactory.getLogger(ClientCertificateAuthentication.class);
  private final byte[] certificate;
  private final byte[] key;

  private String passphrase = "";

  public ClientCertificateAuthentication(final byte[] certificate, final byte[] key) {
    this.certificate = certificate;
    this.key = key;
    this.passphrase = "";
  }

  @Override
  public void provide(ApiClient client) {
    String algo = SSLUtils.recognizePrivateKeyAlgo(key);
    try {
      final KeyManager[] keyManagers =
          SSLUtils.keyManagers(certificate, key, algo, getPassphrase(), null, null);
      client.setKeyManagers(keyManagers);
    } catch (NoSuchAlgorithmException
        | UnrecoverableKeyException
        | CertificateException
        | KeyStoreException
        | InvalidKeySpecException
        | IOException e) {
      log.warn("Could not create key manager for Client Certificate authentication.", e);
      throw new RuntimeException(e);
    }
  }

  public String getPassphrase() {
    return passphrase;
  }

  public void setPassphrase(String passphrase) {
    this.passphrase = passphrase;
  }
}
