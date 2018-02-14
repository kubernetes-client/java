// The functions in this file are heavily derived/copied
// from
// https://github.com/fabric8io/kubernetes-client/tree/master/kubernetes-client/src/main/java/io/fabric8/kubernetes/client/internal

// The copyright header from those files is preserved here:

/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.kubernetes.client.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import org.apache.commons.codec.binary.Base64;

public class SSLUtils {
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
    X509Certificate cert = (X509Certificate) certFactory.generateCertificate(certInputStream);

    byte[] keyBytes = decodePem(keyInputStream);

    PrivateKey privateKey;

    KeyFactory keyFactory = KeyFactory.getInstance(clientKeyAlgo);
    try {
      // First let's try PKCS8
      privateKey = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(keyBytes));
    } catch (InvalidKeySpecException e) {
      // Otherwise try PKCS1
      RSAPrivateCrtKeySpec keySpec = decodePKCS1(keyBytes);
      privateKey = keyFactory.generatePrivate(keySpec);
    }

    KeyStore keyStore = KeyStore.getInstance("JKS");
    if (keyStoreFile != null && keyStoreFile.length() > 0) {
      keyStore.load(new FileInputStream(keyStoreFile), keyStorePassphrase);
    } else {
      loadDefaultKeyStoreFile(keyStore, keyStorePassphrase);
    }

    String alias = cert.getSubjectX500Principal().getName();
    keyStore.setKeyEntry(alias, privateKey, clientKeyPassphrase, new Certificate[] {cert});

    return keyStore;
  }

  // This method is inspired and partly taken over from
  // http://oauth.googlecode.com/svn/code/java/
  // All credits to belong to them.
  private static byte[] decodePem(InputStream keyInputStream) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(keyInputStream));
    try {
      String line;
      while ((line = reader.readLine()) != null) {
        if (line.contains("-----BEGIN ")) {
          return readBytes(reader, line.trim().replace("BEGIN", "END"));
        }
      }
      throw new IOException("PEM is invalid: no begin marker");
    } finally {
      reader.close();
    }
  }

  private static byte[] readBytes(BufferedReader reader, String endMarker) throws IOException {
    String line;
    StringBuffer buf = new StringBuffer();

    while ((line = reader.readLine()) != null) {
      if (line.indexOf(endMarker) != -1) {
        return Base64.decodeBase64(buf.toString());
      }
      buf.append(line.trim());
    }
    throw new IOException("PEM is invalid : No end marker");
  }

  public static RSAPrivateCrtKeySpec decodePKCS1(byte[] keyBytes) throws IOException {
    DerParser parser = new DerParser(keyBytes);
    Asn1Object sequence = parser.read();
    sequence.validateSequence();
    parser = new DerParser(sequence.getValue());
    parser.read();

    return new RSAPrivateCrtKeySpec(
        next(parser),
        next(parser),
        next(parser),
        next(parser),
        next(parser),
        next(parser),
        next(parser),
        next(parser));
  }

  private static BigInteger next(DerParser parser) throws IOException {
    return parser.read().getInteger();
  }

  static class DerParser {

    private InputStream in;

    DerParser(byte[] bytes) throws IOException {
      this.in = new ByteArrayInputStream(bytes);
    }

    Asn1Object read() throws IOException {
      int tag = in.read();

      if (tag == -1) {
        throw new IOException("Invalid DER: stream too short, missing tag");
      }

      int length = getLength();
      byte[] value = new byte[length];
      if (in.read(value) < length) {
        throw new IOException("Invalid DER: stream too short, missing value");
      }

      return new Asn1Object(tag, value);
    }

    private int getLength() throws IOException {
      int i = in.read();
      if (i == -1) {
        throw new IOException("Invalid DER: length missing");
      }

      if ((i & ~0x7F) == 0) {
        return i;
      }

      int num = i & 0x7F;
      if (i >= 0xFF || num > 4) {
        throw new IOException("Invalid DER: length field too big (" + i + ")");
      }

      byte[] bytes = new byte[num];
      if (in.read(bytes) < num) {
        throw new IOException("Invalid DER: length too short");
      }

      return new BigInteger(1, bytes).intValue();
    }
  }

  static class Asn1Object {

    private final int type;
    private final byte[] value;
    private final int tag;

    public Asn1Object(int tag, byte[] value) {
      this.tag = tag;
      this.type = tag & 0x1F;
      this.value = value;
    }

    public byte[] getValue() {
      return value;
    }

    BigInteger getInteger() throws IOException {
      if (type != 0x02) {
        throw new IOException("Invalid DER: object is not integer"); // $NON-NLS-1$
      }
      return new BigInteger(value);
    }

    void validateSequence() throws IOException {
      if (type != 0x10) {
        throw new IOException("Invalid DER: not a sequence");
      }
      if ((tag & 0x20) != 0x20) {
        throw new IOException("Invalid DER: can't parse primitive entity");
      }
    }
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
      keyStore.load(new FileInputStream(fileToLoad), passphrase);
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
