/*
Copyright 2017 The Kubernetes Authors.
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
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
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
  private static final String OIDC_ID_TOKEN = "id-token";
  /** The issuer */
  private static final String OIDC_ISSUER = "idp-issuer-url";
  /** The refresh_token */
  private static final String OIDC_REFRESH_TOKEN = "refresh-token";
  /** The client_id */
  private static final String OIDC_CLIENT_ID = "client-id";
  /** Optional client secret */
  private static final String OIDC_CLIENT_SECRET = "client-secret";
  /** Optional IdP TLS Certificate */
  private static final String OIDC_IDP_CERT_DATA = "idp-certificate-authority-data";

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
        // we don't care if its valid or not cryptographicly
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
    String clientSecret = (String) config.get(OIDC_CLIENT_SECRET);
    String idpCert = (String) config.get(OIDC_IDP_CERT_DATA);

    SSLContext sslContext = null;

    if (idpCert != null) {
      // fist, lets get the pem
      String pemCert = new String(Base64.getDecoder().decode(idpCert));

      // next lets get a cert object
      String alias = "doenotmatter";
      KeyStore ks;

      try {
        ks = java.security.KeyStore.getInstance("PKCS12");
        ks.load(null, "doesnotmatter".toCharArray());
        ByteArrayInputStream bais = new ByteArrayInputStream(pemCert.getBytes("UTF-8"));
        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        Collection<? extends java.security.cert.Certificate> c = cf.generateCertificates(bais);

        if (c.size() > 1) {
          int j = 0;
          Iterator<? extends java.security.cert.Certificate> i = c.iterator();
          while (i.hasNext()) {
            Certificate certificate = (Certificate) i.next();
            ks.setCertificateEntry(alias + "-" + j, certificate);
          }
        } else {
          ks.setCertificateEntry(alias, c.iterator().next());
        }

        TrustManagerFactory tmf = TrustManagerFactory.getInstance("PKIX");
        tmf.init(ks);

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

    if (clientSecret == null) {
      clientSecret = "";
    }

    StringBuilder sb = new StringBuilder();
    sb.append(issuer);
    if (!issuer.endsWith("/")) {
      sb.append("/");
    }
    sb.append(".well-known/openid-configuration");

    String wellKnownURL = sb.toString();

    try {
      URL wellKnown = new URL(wellKnownURL);
      HttpsURLConnection https = (HttpsURLConnection) wellKnown.openConnection();
      https.setRequestMethod("GET");
      if (sslContext != null) {
        https.setSSLSocketFactory(sslContext.getSocketFactory());
      }
      https.setUseCaches(false);
      int code = https.getResponseCode();
      if (code == 200) {
        Scanner scanner = new Scanner(https.getInputStream(), StandardCharsets.UTF_8.name());
        String json = scanner.useDelimiter("\\A").next();

        JSONObject wellKnownJson = (JSONObject) new JSONParser().parse(json);
        String tokenUrl = (String) wellKnownJson.get("token_endpoint");

        URL tokenEndpoint = new URL(tokenUrl);
        https = (HttpsURLConnection) tokenEndpoint.openConnection();
        https.setRequestMethod("POST");
        if (sslContext != null) {
          https.setSSLSocketFactory(sslContext.getSocketFactory());
        }

        String credentials =
            Base64.getEncoder()
                .encodeToString(
                    new StringBuilder()
                        .append(clientId)
                        .append(':')
                        .append(clientSecret)
                        .toString()
                        .getBytes("UTF-8"));
        https.setRequestProperty(
            "Authorization", new StringBuilder().append("Bearer ").append(credentials).toString());
        https.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        https.setDoOutput(true);

        String urlData =
            new StringBuilder()
                .append("refresh_token=")
                .append(URLEncoder.encode(refreshToken, "UTF-8"))
                .toString();
        OutputStream ou = https.getOutputStream();
        ou.write(urlData.getBytes("UTF-8"));
        ou.flush();
        ou.close();

        code = https.getResponseCode();

        if (code == 200) {
          scanner = new Scanner(https.getInputStream(), StandardCharsets.UTF_8.name());
          json = scanner.useDelimiter("\\A").next();

          JSONObject response = (JSONObject) new JSONParser().parse(json);

          config.put(OIDC_ID_TOKEN, response.get("id_token"));
          config.put(OIDC_REFRESH_TOKEN, response.get("refresh_token"));

          return config;

        } else {
          throw new RuntimeException(
              new StringBuilder()
                  .append("Invalid response code for token retrieval - ")
                  .append(code)
                  .toString());
        }

      } else {
        throw new RuntimeException(
            new StringBuilder()
                .append("Invalid response code for issuer - ")
                .append(code)
                .toString());
      }

    } catch (IOException | ParseException e) {
      throw new RuntimeException("Could not refresh", e);
    }
  }
}
