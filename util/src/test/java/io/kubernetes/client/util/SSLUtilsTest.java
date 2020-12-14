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

import io.kubernetes.client.Resources;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import junit.framework.TestCase;

public class SSLUtilsTest extends TestCase {

  private static final String CLIENT_KEY_PATH = Resources.getResource("clientauth.key").getPath();
  private static final String CLIENT_KEY_RSA_PATH =
      Resources.getResource("clientauth-rsa.key").getPath();
  private static final String CLIENT_KEY_EC_PATH =
      Resources.getResource("clientauth-ec.key").getPath();

  public void testPKCS8KeyLoadDump()
      throws IOException, InvalidKeySpecException, NoSuchAlgorithmException {
    byte[] loaded = Files.readAllBytes(Paths.get(CLIENT_KEY_PATH));
    PrivateKey privateKey = SSLUtils.loadKey(loaded);
    byte[] dumped = SSLUtils.dumpKey(privateKey);
    PrivateKey reloaded = SSLUtils.loadKey(dumped);
    assertEquals(privateKey, reloaded);
  }

  public void testPKCS1RSAKeyLoadDump()
      throws IOException, InvalidKeySpecException, NoSuchAlgorithmException {
    byte[] loaded = Files.readAllBytes(Paths.get(CLIENT_KEY_RSA_PATH));
    PrivateKey privateKey = SSLUtils.loadKey(loaded);
    byte[] dumped = SSLUtils.dumpKey(privateKey);
    PrivateKey reloaded = SSLUtils.loadKey(dumped);
    assertEquals(privateKey, reloaded);
  }

  public void testPKCS1ECKeyLoadDump()
      throws IOException, InvalidKeySpecException, NoSuchAlgorithmException {
    byte[] loaded = Files.readAllBytes(Paths.get(CLIENT_KEY_EC_PATH));
    PrivateKey privateKey = SSLUtils.loadKey(loaded);
    byte[] dumped = SSLUtils.dumpKey(privateKey);
    PrivateKey reloaded = SSLUtils.loadKey(dumped);
    assertEquals(privateKey, reloaded);
  }
}
