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

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.matching;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.kubernetes.client.Resources;
import io.kubernetes.client.util.TestUtils;
import io.kubernetes.client.util.authenticators.OpenIDConnectAuthenticator;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.codec.binary.Base64;
import org.jose4j.json.internal.json_simple.JSONObject;
import org.junit.Rule;
import org.junit.Test;

/** OpenIDConnectAuthenticationTest */
public class OpenIDConnectAuthenticationTest {

  private static final String OIDC_KS_PATH = Resources.getResource("oidc-signing.p12").getPath();
  private static final String OIDC_SERVER_KS_PATH =
      Resources.getResource("oidc-server.jks").getPath();
  private static final char[] OIDC_KS_PASSWORD = "changeme".toCharArray();
  private static final int PORT = 8043;

  @Rule
  public WireMockRule wireMockRule =
      new WireMockRule(
          WireMockConfiguration.options()
              .httpsPort(PORT)
              .keystoreType("JKS")
              .keystorePath(OIDC_SERVER_KS_PATH)
              .keyManagerPassword("changeme")
              .keystorePassword("changeme"));

  @Test
  public void testTokenExpiredNotExpired()
      throws InvalidKeySpecException, NoSuchAlgorithmException, Exception {
    OpenIDConnectAuthenticator oidcAuth = new OpenIDConnectAuthenticator();
    Map<String, Object> config = new HashMap<String, Object>();

    KeyStore ks = KeyStore.getInstance("PKCS12");
    ks.load(new FileInputStream(OIDC_KS_PATH), OIDC_KS_PASSWORD);

    String jwt =
        TestUtils.generateJWT(
            "someuser",
            "https://some.domain.nowhere",
            (PrivateKey) ks.getKey("oidc-sig", OIDC_KS_PASSWORD),
            TestUtils.DateOptions.Now);

    config.put(OpenIDConnectAuthenticator.OIDC_ID_TOKEN, jwt);

    assertFalse(oidcAuth.isExpired(config));
  }

  @Test
  public void testTokenExpiredHasExpired()
      throws InvalidKeySpecException, NoSuchAlgorithmException, Exception {
    OpenIDConnectAuthenticator oidcAuth = new OpenIDConnectAuthenticator();
    Map<String, Object> config = new HashMap<String, Object>();

    KeyStore ks = KeyStore.getInstance("PKCS12");
    ks.load(new FileInputStream(OIDC_KS_PATH), OIDC_KS_PASSWORD);

    String jwt =
        TestUtils.generateJWT(
            "someuser",
            "https://some.domain.nowhere",
            (PrivateKey) ks.getKey("oidc-sig", OIDC_KS_PASSWORD),
            TestUtils.DateOptions.Past);

    config.put(OpenIDConnectAuthenticator.OIDC_ID_TOKEN, jwt);

    assertTrue(oidcAuth.isExpired(config));
  }

  public void testTokenExpiredNull()
      throws InvalidKeySpecException, NoSuchAlgorithmException, Exception {
    OpenIDConnectAuthenticator oidcAuth = new OpenIDConnectAuthenticator();
    Map<String, Object> config = new HashMap<String, Object>();

    // no id_token

    assertTrue(oidcAuth.isExpired(config));
  }

  @Test
  public void testLoadToken() throws InvalidKeySpecException, NoSuchAlgorithmException, Exception {
    OpenIDConnectAuthenticator oidcAuth = new OpenIDConnectAuthenticator();
    Map<String, Object> config = new HashMap<String, Object>();

    KeyStore ks = KeyStore.getInstance("PKCS12");
    ks.load(new FileInputStream(OIDC_KS_PATH), OIDC_KS_PASSWORD);

    String jwt =
        TestUtils.generateJWT(
            "someuser",
            "https://some.domain.nowhere",
            (PrivateKey) ks.getKey("oidc-sig", OIDC_KS_PASSWORD),
            TestUtils.DateOptions.Now);

    config.put(OpenIDConnectAuthenticator.OIDC_ID_TOKEN, jwt);

    assertEquals(oidcAuth.getToken(config), jwt);
  }

  @Test
  public void testLoadNullToken()
      throws InvalidKeySpecException, NoSuchAlgorithmException, Exception {
    OpenIDConnectAuthenticator oidcAuth = new OpenIDConnectAuthenticator();
    Map<String, Object> config = new HashMap<String, Object>();

    assertNull(oidcAuth.getToken(config));
  }

  @Test
  public void testRefreshSuccess() throws Exception {
    KeyStore ks = KeyStore.getInstance("PKCS12");
    ks.load(new FileInputStream(OIDC_KS_PATH), OIDC_KS_PASSWORD);

    String refreshedJWT =
        TestUtils.generateJWT(
            "someuser",
            "https://localhost:" + PORT,
            (PrivateKey) ks.getKey("oidc-sig", OIDC_KS_PASSWORD),
            TestUtils.DateOptions.Now);

    stubFor(
        get("/.well-known/openid-configuration")
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        "{\"issuer\":\"https://localhost:8043\",\"authorization_endpoint\":\"https://localhost:8043/auth\",\"token_endpoint\":\"https://localhost:8043/token\",\"userinfo_endpoint\":\"https://localhost:8043/userinfo\",\"revocation_endpoint\":\"https://localhost:8043/revoke\",\"jwks_uri\":\"https://localhost:8043/certs\",\"response_types_supported\":[\"code\",\"token\",\"id_token\",\"code token\",\"code id_token\",\"token id_token\",\"code token id_token\",\"none\"],\"subject_types_supported\":[\"public\"],\"id_token_signing_alg_values_supported\":[\"RS256\"],\"scopes_supported\":[\"openid\",\"email\",\"profile\"],\"token_endpoint_auth_methods_supported\":[\"client_secret_post\"],\"claims_supported\":[\"sub\",\"aud\",\"iss\",\"exp\",\"sub\",\"name\",\"groups\",\"preferred_username\",\"email\"],\"code_challenge_methods_supported\":[\"plain\",\"S256\"]}")));

    JSONObject respToken = new JSONObject();
    respToken.put("id_token", refreshedJWT);
    respToken.put("refresh_token", "new_refresh_token");

    stubFor(
        post("/token")
            .withBasicAuth("kubernetes", "")
            .withRequestBody(matching("refresh_token=refresh-me-please&grant_type=refresh_token"))
            .willReturn(aResponse().withStatus(200).withBody(respToken.toString())));

    OpenIDConnectAuthenticator oidcAuth = new OpenIDConnectAuthenticator();
    Map<String, Object> config = new HashMap<String, Object>();

    KeyStore serverKs = KeyStore.getInstance("JKS");
    serverKs.load(new FileInputStream(OIDC_SERVER_KS_PATH), OIDC_KS_PASSWORD);

    String jwt =
        TestUtils.generateJWT(
            "someuser",
            "https://localhost:" + PORT,
            (PrivateKey) ks.getKey("oidc-sig", OIDC_KS_PASSWORD),
            TestUtils.DateOptions.Past);

    config.put(OpenIDConnectAuthenticator.OIDC_ID_TOKEN, jwt);
    config.put(OpenIDConnectAuthenticator.OIDC_ISSUER, "https://localhost:" + PORT);
    config.put(OpenIDConnectAuthenticator.OIDC_CLIENT_ID, "kubernetes");
    config.put(OpenIDConnectAuthenticator.OIDC_REFRESH_TOKEN, "refresh-me-please");
    config.put(
        OpenIDConnectAuthenticator.OIDC_IDP_CERT_DATA,
        Base64.encodeBase64String(
            exportCert((X509Certificate) serverKs.getCertificate("mykey"))
                .getBytes(StandardCharsets.UTF_8)));

    Map<String, Object> respMap = oidcAuth.refresh(config);

    assertEquals(refreshedJWT, respMap.get(OpenIDConnectAuthenticator.OIDC_ID_TOKEN));
    assertEquals("new_refresh_token", respMap.get(OpenIDConnectAuthenticator.OIDC_REFRESH_TOKEN));
  }

  @Test(expected = RuntimeException.class)
  public void testRefreshUnauthorized() throws Exception {
    KeyStore ks = KeyStore.getInstance("PKCS12");
    ks.load(new FileInputStream(OIDC_KS_PATH), OIDC_KS_PASSWORD);

    String refreshedJWT =
        TestUtils.generateJWT(
            "someuser",
            "https://localhost:" + PORT,
            (PrivateKey) ks.getKey("oidc-sig", OIDC_KS_PASSWORD),
            TestUtils.DateOptions.Now);

    stubFor(
        get("/.well-known/openid-configuration")
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        "{\"issuer\":\"https://localhost:8043\",\"authorization_endpoint\":\"https://localhost:8043/auth\",\"token_endpoint\":\"https://localhost:8043/token\",\"userinfo_endpoint\":\"https://localhost:8043/userinfo\",\"revocation_endpoint\":\"https://localhost:8043/revoke\",\"jwks_uri\":\"https://localhost:8043/certs\",\"response_types_supported\":[\"code\",\"token\",\"id_token\",\"code token\",\"code id_token\",\"token id_token\",\"code token id_token\",\"none\"],\"subject_types_supported\":[\"public\"],\"id_token_signing_alg_values_supported\":[\"RS256\"],\"scopes_supported\":[\"openid\",\"email\",\"profile\"],\"token_endpoint_auth_methods_supported\":[\"client_secret_post\"],\"claims_supported\":[\"sub\",\"aud\",\"iss\",\"exp\",\"sub\",\"name\",\"groups\",\"preferred_username\",\"email\"],\"code_challenge_methods_supported\":[\"plain\",\"S256\"]}")));

    JSONObject respToken = new JSONObject();
    respToken.put("id_token", refreshedJWT);
    respToken.put("refresh_token", "new_refresh_token");

    stubFor(post("/token").willReturn(aResponse().withStatus(401)));

    OpenIDConnectAuthenticator oidcAuth = new OpenIDConnectAuthenticator();
    Map<String, Object> config = new HashMap<String, Object>();

    KeyStore serverKs = KeyStore.getInstance("JKS");
    serverKs.load(new FileInputStream(OIDC_SERVER_KS_PATH), OIDC_KS_PASSWORD);

    String jwt =
        TestUtils.generateJWT(
            "someuser",
            "https://localhost:" + PORT,
            (PrivateKey) ks.getKey("oidc-sig", OIDC_KS_PASSWORD),
            TestUtils.DateOptions.Past);

    config.put(OpenIDConnectAuthenticator.OIDC_ID_TOKEN, jwt);
    config.put(OpenIDConnectAuthenticator.OIDC_ISSUER, "https://localhost:" + PORT);
    config.put(OpenIDConnectAuthenticator.OIDC_CLIENT_ID, "kubernetes");
    config.put(OpenIDConnectAuthenticator.OIDC_REFRESH_TOKEN, "refresh-me-please");
    config.put(
        OpenIDConnectAuthenticator.OIDC_IDP_CERT_DATA,
        Base64.encodeBase64String(
            exportCert((X509Certificate) serverKs.getCertificate("mykey"))
                .getBytes(StandardCharsets.UTF_8)));

    Map<String, Object> respMap = oidcAuth.refresh(config);
  }

  private static String exportCert(X509Certificate cert) throws Exception {

    Base64 encoder = new Base64(64);

    String b64 = encoder.encodeToString(cert.getEncoded());

    b64 = "-----BEGIN CERTIFICATE-----\n" + b64 + "-----END CERTIFICATE-----\n";

    return b64;
  }
}
