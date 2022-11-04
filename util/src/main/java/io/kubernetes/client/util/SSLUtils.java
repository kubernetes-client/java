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

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Security;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.util.Collection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.openssl.PEMKeyPair;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaMiscPEMGenerator;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
import org.bouncycastle.util.io.pem.PemWriter;

public class SSLUtils {
  static {
    Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
  }

  public static boolean isNotNullOrEmpty(String val) {
    return val != null && val.length() > 0;
  }

  public static KeyManager[] keyManagers(
      byte[] certData,
      byte[] keyData,
      String algo,
      String passphrase,
      String keyStoreFile,
      String keyStorePassphrase)
      throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException,
          CertificateException, InvalidKeySpecException, IOException {
    KeyManager[] keyManagers = null;
    if (certData != null && keyData != null) {
      KeyStore keyStore =
          createKeyStore(certData, keyData, algo, passphrase, keyStoreFile, keyStorePassphrase);
      KeyManagerFactory kmf =
          KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
      kmf.init(keyStore, passphrase.toCharArray());
      keyManagers = kmf.getKeyManagers();
    }
    return keyManagers;
  }

  public static KeyStore createKeyStore(
      byte[] clientCertData,
      byte[] clientKeyData,
      String clientKeyAlgo,
      String clientKeyPassphrase,
      String keyStoreFile,
      String keyStorePassphrase)
      throws IOException, CertificateException, NoSuchAlgorithmException, InvalidKeySpecException,
          KeyStoreException {
    try (InputStream certInputStream = new ByteArrayInputStream(clientCertData);
        InputStream keyInputStream = new ByteArrayInputStream(clientKeyData)) {
      return createKeyStore(
          certInputStream,
          keyInputStream,
          clientKeyAlgo,
          clientKeyPassphrase != null ? clientKeyPassphrase.toCharArray() : null,
          keyStoreFile,
          getKeyStorePassphrase(keyStorePassphrase));
    }
  }

  public static byte[] dumpKey(PrivateKey privateKey) throws IOException {
    StringWriter writer = new StringWriter();
    PemWriter pemWriter = new PemWriter(writer);
    pemWriter.writeObject(new JcaMiscPEMGenerator(privateKey));
    pemWriter.flush();
    return writer.toString().getBytes();
  }

  public static String recognizePrivateKeyAlgo(byte[] privateKeyBytes) {
    String dataString = new String(privateKeyBytes);
    String algo = ""; // PKCS#8
    if (dataString.contains("BEGIN EC PRIVATE KEY")) {
      algo = "EC"; // PKCS#1 - EC
    }
    if (dataString.contains("BEGIN RSA PRIVATE KEY")) {
      algo = "RSA"; // PKCS#1 - RSA
    }
    return algo;
  }

  public static PrivateKey loadKey(byte[] privateKeyBytes)
      throws IOException, InvalidKeySpecException {
    return loadKey(
        new ByteArrayInputStream(privateKeyBytes), recognizePrivateKeyAlgo(privateKeyBytes));
  }

  public static PrivateKey loadKey(byte[] pemPrivateKeyBytes, String algo)
      throws IOException, InvalidKeySpecException {
    return loadKey(new ByteArrayInputStream(pemPrivateKeyBytes), algo);
  }

  public static PrivateKey loadKey(InputStream keyInputStream, String clientKeyAlgo)
      throws IOException, InvalidKeySpecException {
    final PrivateKey privateKey;
    try (final PEMParser pemParser = new PEMParser(new InputStreamReader(keyInputStream))) {
      final Object pemObject = pemParser.readObject();
      if (pemObject == null) {
        final String message =
            String.format("PEM Private Key Algorithm [%s] not parsed", clientKeyAlgo);
        throw new InvalidKeySpecException(message);
      }
      final JcaPEMKeyConverter converter = new JcaPEMKeyConverter();
      if (pemObject instanceof PEMKeyPair) {
        final PEMKeyPair pemKeyPair = (PEMKeyPair) pemObject;
        final KeyPair keyPair = converter.getKeyPair(pemKeyPair);
        privateKey = keyPair.getPrivate();
      } else if (pemObject instanceof PrivateKeyInfo) {
        final PrivateKeyInfo privateKeyInfo = (PrivateKeyInfo) pemObject;
        privateKey = converter.getPrivateKey(privateKeyInfo);
      } else {
        final String pemObjectType = pemObject.getClass().getSimpleName();
        final String message =
            String.format(
                "PEM Private Key Algorithm [%s] Type [%s] not supported",
                clientKeyAlgo, pemObjectType);
        throw new InvalidKeySpecException(message);
      }
    }
    return privateKey;
  }

  public static KeyStore createKeyStore(
      InputStream certInputStream,
      InputStream keyInputStream,
      String clientKeyAlgo,
      char[] clientKeyPassphrase,
      String keyStoreFile,
      char[] keyStorePassphrase)
      throws IOException, CertificateException, NoSuchAlgorithmException, InvalidKeySpecException,
          KeyStoreException {
    CertificateFactory certFactory = CertificateFactory.getInstance("X509");
    Collection<? extends Certificate> certs = certFactory.generateCertificates(certInputStream);

    PrivateKey privateKey = loadKey(keyInputStream, clientKeyAlgo);

    KeyStore keyStore;
    try {
      keyStore = KeyStore.getInstance("JKS");
    } catch (KeyStoreException e) {
      // Not having an instance of JKS happens on Android, for example.
      // Since we rely on BouncyCastle anyway, let's try BKS instead
      // (which is BouncyCastle's JKS compatible provider).
      keyStore = KeyStore.getInstance("BKS");
    }

    if (keyStoreFile != null && keyStoreFile.length() > 0) {
      keyStore.load(new FileInputStream(keyStoreFile), keyStorePassphrase);
    } else {
      loadDefaultKeyStoreFile(keyStore, keyStorePassphrase);
    }

    String alias =
        ((X509Certificate) certs.stream().findFirst().get()).getSubjectX500Principal().getName();
    keyStore.setKeyEntry(
        alias, privateKey, clientKeyPassphrase, certs.toArray(new X509Certificate[certs.size()]));

    return keyStore;
  }

  private static void loadDefaultKeyStoreFile(KeyStore keyStore, char[] keyStorePassphrase)
      throws CertificateException, NoSuchAlgorithmException, IOException {

    String keyStorePath = System.getProperty("javax.net.ssl.keyStore");
    if (keyStorePath != null && keyStorePath.length() > 0) {
      File keyStoreFile = new File(keyStorePath);
      if (loadDefaultStoreFile(keyStore, keyStoreFile, keyStorePassphrase)) {
        return;
      }
    }

    keyStore.load(null);
  }

  private static boolean loadDefaultStoreFile(KeyStore keyStore, File fileToLoad, char[] passphrase)
      throws CertificateException, NoSuchAlgorithmException, IOException {
    if (fileToLoad.exists() && fileToLoad.isFile() && fileToLoad.length() > 0) {
      try (FileInputStream inputStream = new FileInputStream(fileToLoad)) {
        keyStore.load(inputStream, passphrase);
      }
      return true;
    }
    return false;
  }

  private static char[] getKeyStorePassphrase(String keyStorePassphrase) {
    if (keyStorePassphrase == null || keyStorePassphrase.length() == 0) {
      return System.getProperty("javax.net.ssl.keyStorePassword", "changeit").toCharArray();
    }
    return keyStorePassphrase.toCharArray();
  }
}
