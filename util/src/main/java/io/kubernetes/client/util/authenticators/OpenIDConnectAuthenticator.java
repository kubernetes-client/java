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
package io.kubernetes.client.util.authenticators;

import io.kubernetes.client.util.KubeConfig;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Base64;
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import org.jose4j.json.internal.json_simple.JSONObject;
import org.jose4j.json.internal.json_simple.parser.JSONParser;
import org.jose4j.json.internal.json_simple.parser.ParseException;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.MalformedClaimException;
import org.jose4j.jwt.NumericDate;
import org.jose4j.jwt.consumer.InvalidJwtException;
import org.jose4j.lang.JoseException;

/** OpenIDConnectAuthenticator */
public class OpenIDConnectAuthenticator implements Authenticator {

  /** The id_token */
  public static final String OIDC_ID_TOKEN = "id-token";
  /** The issuer */
  public static final String OIDC_ISSUER = "idp-issuer-url";
  /** The refresh_token */
  public static final String OIDC_REFRESH_TOKEN = "refresh-token";
  /** The client_id */
  public static final String OIDC_CLIENT_ID = "client-id";
  /** Optional client secret */
  public static final String OIDC_CLIENT_SECRET = "client-secret";
  /** Optional IdP TLS Certificate */
  public static final String OIDC_IDP_CERT_DATA = "idp-certificate-authority-data";

  static {
    KubeConfig.registerAuthenticator(new OpenIDConnectAuthenticator());
  }

  @Override
  public String getName() {
    return "oidc";
  }

  @Override
  public String getToken(Map<String, Object> config) {
    return (String) config.get(OIDC_ID_TOKEN);
  }

  @Override
  public boolean isExpired(Map<String, Object> config) {
    String idToken = (String) config.get(OIDC_ID_TOKEN);

    if (idToken == null) {
      return true;
    } else {
      JsonWebSignature jws = new JsonWebSignature();
      try {
        jws.setCompactSerialization(idToken);
        // we don't care if its valid or not cryptographicly as the only way to verify is to
        // query
        // the remote identity provider's configuration url which is the same chanel as the
        // token
        // request.  If there is a malicious proxy there's no way for the client to know.
        // Also,
        // the client doesn't need to trust the, token, only bear it to the server which
        // will verify
        // it.

        String jwt = jws.getUnverifiedPayload();
        JwtClaims claims = JwtClaims.parse(jwt);

        // expired now is >= expiration AND exp is present
        return claims.getExpirationTime() == null
            || NumericDate.now().isOnOrAfter(claims.getExpirationTime());
      } catch (JoseException | InvalidJwtException | MalformedClaimException e) {
        throw new RuntimeException(e);
      }
    }
  }

  @Override
  public Map<String, Object> refresh(Map<String, Object> config) {
    String issuer = (String) config.get(OIDC_ISSUER);
    String clientId = (String) config.get(OIDC_CLIENT_ID);
    String refreshToken = (String) config.get(OIDC_REFRESH_TOKEN);
    String clientSecret = (String) config.getOrDefault(OIDC_CLIENT_SECRET, "");
    String idpCert = (String) config.get(OIDC_IDP_CERT_DATA);

    SSLContext sslContext = null;

    if (idpCert != null) {
      // fist, lets get the pem
      String pemCert = new String(Base64.getDecoder().decode(idpCert));

      // next lets get a cert object
      // need an alias name to store the certificate in a keystore.  Also
      // java keystores need passwords. this value is as good as any as
      // there isn't anything actually secret being stored.
      String alias = "doenotmatter";
      KeyStore ks;

      try {
        ks = java.security.KeyStore.getInstance("PKCS12");
        ks.load(null, alias.toCharArray());
        ByteArrayInputStream bais =
            new ByteArrayInputStream(pemCert.getBytes(StandardCharsets.UTF_8));
        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        Collection<? extends java.security.cert.Certificate> c = cf.generateCertificates(bais);

        int j = 0;
        for (java.security.cert.Certificate certificate : c) {
          ks.setCertificateEntry(alias + "-" + j, certificate);
          j++;
        }

        TrustManagerFactory tmf = TrustManagerFactory.getInstance("PKIX");
        tmf.init(ks);

        // TODO would be good to make this more dyanamic.  Doesn't seem like
        // a good way to do this.
        sslContext = SSLContext.getInstance("TLSv1.2");
        sslContext.init(null, tmf.getTrustManagers(), new SecureRandom());

      } catch (KeyStoreException
          | NoSuchAlgorithmException
          | CertificateException
          | IOException
          | KeyManagementException e) {
        throw new RuntimeException("Could not import idp certificate", e);
      }
    }

    // check the identity provider's configuration url for a token endpoint
    String tokenURL = loadTokenURL(issuer, sslContext);

    // get the refreshed tokens
    JSONObject response =
        refreshOidcToken(clientId, refreshToken, clientSecret, sslContext, tokenURL);

    // reload the config
    config.put(OIDC_ID_TOKEN, response.get("id_token"));
    config.put(OIDC_REFRESH_TOKEN, response.get("refresh_token"));

    return config;
  }

  /**
   * Refreshes the OpenID Connect id_token
   *
   * @param clientId from client-id
   * @param refreshToken from refresh-token
   * @param clientSecret from client-secret
   * @param sslContext to support TLS with a self signed certificate in
   *     idp-certificate-authority-data
   * @param tokenURL the url for refreshing the token
   * @return
   */
  private JSONObject refreshOidcToken(
      String clientId,
      String refreshToken,
      String clientSecret,
      SSLContext sslContext,
      String tokenURL) {
    try {
      URL tokenEndpoint = new URL(tokenURL);
      HttpsURLConnection https = (HttpsURLConnection) tokenEndpoint.openConnection();
      https.setRequestMethod("POST");
      if (sslContext != null) {
        https.setSSLSocketFactory(sslContext.getSocketFactory());
      }

      // per https://tools.ietf.org/html/rfc6749#section-2.3 the secret should be a header,
      // not in
      // the body
      String credentials =
          Base64.getEncoder()
              .encodeToString(
                  new StringBuilder()
                      .append(clientId)
                      .append(':')
                      .append(clientSecret)
                      .toString()
                      .getBytes(StandardCharsets.UTF_8));
      https.setRequestProperty(
          "Authorization", new StringBuilder().append("Basic ").append(credentials).toString());
      https.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      https.setDoOutput(true);

      String urlData =
          new StringBuilder()
              .append("refresh_token=")
              .append(URLEncoder.encode(refreshToken, "UTF-8"))
              .append("&grant_type=refresh_token")
              .toString();
      OutputStream ou = https.getOutputStream();
      ou.write(urlData.getBytes(StandardCharsets.UTF_8));
      ou.flush();
      ou.close();

      int code = https.getResponseCode();

      if (code != HttpsURLConnection.HTTP_OK) {
        throw new RuntimeException(
            new StringBuilder()
                .append("Invalid response code for token retrieval - ")
                .append(code)
                .toString());
      }

      Scanner scanner = new Scanner(https.getInputStream(), StandardCharsets.UTF_8.name());
      String json = scanner.useDelimiter("\\A").next();

      return (JSONObject) new JSONParser().parse(json);

    } catch (Throwable t) {
      throw new RuntimeException("Could not refresh token", t);
    }
  }

  /**
   * Determines the token url
   *
   * @param issuer from the idp-issuer-url
   * @param sslContext to support TLS with a self signed certificate in
   *     idp-certificate-authority-data
   * @return
   */
  private String loadTokenURL(String issuer, SSLContext sslContext) {
    StringBuilder wellKnownUrl = new StringBuilder();
    wellKnownUrl.append(issuer);
    if (!issuer.endsWith("/")) {
      wellKnownUrl.append("/");
    }
    wellKnownUrl.append(".well-known/openid-configuration");

    try {
      URL wellKnown = new URL(wellKnownUrl.toString());
      HttpsURLConnection https = (HttpsURLConnection) wellKnown.openConnection();
      https.setRequestMethod("GET");
      if (sslContext != null) {
        https.setSSLSocketFactory(sslContext.getSocketFactory());
      }
      https.setUseCaches(false);
      int code = https.getResponseCode();

      if (code != HttpsURLConnection.HTTP_OK) {
        throw new RuntimeException(
            new StringBuilder()
                .append("Invalid response code for issuer - ")
                .append(code)
                .toString());
      }

      Scanner scanner = new Scanner(https.getInputStream(), StandardCharsets.UTF_8.name());
      String json = scanner.useDelimiter("\\A").next();

      JSONObject wellKnownJson = (JSONObject) new JSONParser().parse(json);

      return (String) wellKnownJson.get("token_endpoint");

    } catch (IOException | ParseException e) {
      throw new RuntimeException("Could not refresh", e);
    }
  }
}
