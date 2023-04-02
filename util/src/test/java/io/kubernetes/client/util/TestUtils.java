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

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.auth.ApiKeyAuth;
import java.security.PrivateKey;
import java.util.ArrayList;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.NumericDate;

public class TestUtils {

  public enum DateOptions {
    Now,
    Future,
    Past
  }

  public static ApiKeyAuth getApiKeyAuthFromClient(ApiClient client) {
    return (ApiKeyAuth) client.getAuthentications().get("BearerToken");
  }

  /**
   * Utility for generating JWTs
   *
   * @param uid Maps to the sub claim
   * @param issuer URL of the issuer
   * @param signing Private key to sign the JWT
   * @param dos Determines at what time point the JWT should be generated
   * @return
   * @throws Exception
   */
  public static String generateJWT(String uid, String issuer, PrivateKey signing, DateOptions dos)
      throws Exception {
    JwtClaims claims = new JwtClaims();
    claims.setIssuer(issuer);
    ArrayList<String> audiences = new ArrayList<String>();

    claims.setSubject(uid);

    claims.setGeneratedJwtId();

    claims.setGeneratedJwtId(); // a unique identifier for the token

    if (dos == DateOptions.Now) {
      claims.setIssuedAtToNow(); // when the token was issued/created (now)
      claims.setNotBeforeMinutesInThePast(
          60000 / 1000 / 60); // time before which the token is not yet valid (2 minutes ago)
      claims.setExpirationTimeMinutesInTheFuture(
          60000 / 1000 / 60); // time before which the token is not yet valid (2 minutes ago)
    }

    if (dos == DateOptions.Past) {
      claims.setIssuedAt(NumericDate.fromMilliseconds(System.currentTimeMillis() - 120000L));
      claims.setNotBeforeMinutesInThePast(
          4); // time before which the token is not yet valid (2 minutes ago)
      claims.setExpirationTimeMinutesInTheFuture(
          -1); // time before which the token is not yet valid (2 minutes ago)
    }

    if (dos == DateOptions.Future) {
      claims.setIssuedAt(NumericDate.fromMilliseconds(System.currentTimeMillis() + 120000L));
      claims.setNotBeforeMinutesInThePast(
          -1); // time before which the token is not yet valid (2 minutes ago)
      claims.setExpirationTimeMinutesInTheFuture(
          4); // time before which the token is not yet valid (2 minutes ago)
    }

    JsonWebSignature jws = new JsonWebSignature();
    jws.setPayload(claims.toJson());
    jws.setKey(signing);

    jws.setAlgorithmHeaderValue(AlgorithmIdentifiers.RSA_USING_SHA256);
    return jws.getCompactSerialization();
  }
}
