package io.kubernetes.client.util.credentials;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.util.SSLUtils;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.net.ssl.KeyManager;
import org.apache.log4j.Logger;

/** Uses Client Certificates to configure {@link ApiClient} authentication to the Kubernetes API. */
public class ClientCertificateAuthentication implements Authentication {
  private static final Logger log = Logger.getLogger(ClientCertificateAuthentication.class);
  private final byte[] certificate;
  private final byte[] key;

  public ClientCertificateAuthentication(final byte[] certificate, final byte[] key) {
    this.certificate = certificate;
    this.key = key;
  }

  @Override
  public void provide(ApiClient client) {
    try {
      final KeyManager[] keyManagers =
          SSLUtils.keyManagers(certificate, key, "RSA", "", null, null);
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
}
