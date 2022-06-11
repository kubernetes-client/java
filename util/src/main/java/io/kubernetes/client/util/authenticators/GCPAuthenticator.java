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

import com.google.auth.oauth2.AccessToken;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.kubernetes.client.util.KubeConfig;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Authenticator interface represents a plugin that can handle a specific type of authentication
 * information (e.g. 'gcp')
 */
public class GCPAuthenticator implements Authenticator {
  static {
    KubeConfig.registerAuthenticator(new GCPAuthenticator());
  }

  static final String ACCESS_TOKEN = "access-token";
  static final String EXPIRY = "expiry";
  static final String CMD_ARGS = "cmd-args";
  static final String CMD_PATH = "cmd-path";
  static final String SCOPES = "scopes";
  static final String[] DEFAULT_SCOPES =
      new String[] {
        "https://www.googleapis.com/auth/cloud-platform",
        "https://www.googleapis.com/auth/userinfo.email"
      };

  private static final Logger log = LoggerFactory.getLogger(GCPAuthenticator.class);

  private final ProcessBuilder pb;
  private GoogleCredentials gc;

  public GCPAuthenticator() {
    this(new ProcessBuilder(), null);
  }

  public GCPAuthenticator(ProcessBuilder pb, GoogleCredentials gc) {
    this.pb = pb;
    this.gc = gc;
  }

  @Override
  public String getName() {
    return "gcp";
  }

  @Override
  public String getToken(Map<String, Object> config) {
    return (String) config.get(ACCESS_TOKEN);
  }

  @Override
  public boolean isExpired(Map<String, Object> config) {
    Object expiryObj = config.get(EXPIRY);
    Instant expiry = null;
    if (expiryObj instanceof Date) {
      expiry = ((Date) expiryObj).toInstant();
    } else if (expiryObj instanceof Instant) {
      expiry = (Instant) expiryObj;
    } else if (expiryObj instanceof String) {
      expiry = Instant.parse((String) expiryObj);
    } else {
      throw new RuntimeException("Unexpected object type: " + expiryObj.getClass());
    }
    return (expiry != null && expiry.compareTo(Instant.now()) <= 0);
  }

  @Override
  public Map<String, Object> refresh(Map<String, Object> config) {
    if (isCmd(config)) {
      return refreshCmd(config);
    }
    // Google Application Credentials-based refresh
    // https://cloud.google.com/kubernetes-engine/docs/how-to/api-server-authentication#environments-without-gcloud
    String[] scopes = parseScopes(config);
    try {
      if (this.gc == null) this.gc = GoogleCredentials.getApplicationDefault().createScoped(scopes);
      gc.refreshIfExpired();
      AccessToken accessToken = gc.getAccessToken();
      config.put(ACCESS_TOKEN, accessToken.getTokenValue());
      config.put(EXPIRY, accessToken.getExpirationTime());
      return config;
    } catch (IOException e) {
      throw new RuntimeException("The Application Default Credentials are not available.", e);
    }
  }

  public String[] parseScopes(Map<String, Object> config) {
    String scopes = (String) config.get(SCOPES);
    if (scopes == null) {
      return DEFAULT_SCOPES;
    }
    if (scopes.isEmpty()) {
      return new String[] {};
    }
    return scopes.split(",");
  }

  private boolean isCmd(Map<String, Object> config) {
    return config.containsKey(CMD_ARGS) && config.containsKey(CMD_PATH);
  }

  private Map<String, Object> refreshCmd(Map<String, Object> config) {
    String cmdPath = (String) config.get(CMD_PATH);
    String cmdArgs = (String) config.get(CMD_ARGS);
    List<String> fullCmd =
        Arrays.asList(String.join(" ", cmdPath.trim(), cmdArgs.trim()).split(" "));
    try {
      Process process = this.pb.command(fullCmd).start();
      process.waitFor(10, TimeUnit.SECONDS);
      if (process.exitValue() != 0) {
        String stdErr = IOUtils.toString(process.getErrorStream(), StandardCharsets.UTF_8);
        throw new IllegalStateException(
            "Failed to executing access token command "
                + fullCmd
                + ": exitValue: "
                + process.exitValue()
                + ", stdErr: "
                + stdErr);
      }
      String output = IOUtils.toString(process.getInputStream(), StandardCharsets.UTF_8);
      String credentialJson = output.substring(output.indexOf("{"), output.lastIndexOf("}") + 1);
      JsonObject root = JsonParser.parseString(credentialJson).getAsJsonObject();
      if (root.has("credential")) {
        JsonObject credJson = root.getAsJsonObject("credential");
        if (credJson.has("access_token") && credJson.has("token_expiry")) {
          config.put(ACCESS_TOKEN, credJson.get("access_token").getAsString());
          config.put(EXPIRY, credJson.get("token_expiry").getAsString());
          return config;
        }
      }
      throw new IllegalStateException("Failed to parsing access token output: " + output);
    } catch (IOException | InterruptedException e) {
      throw new RuntimeException("Could not refresh token", e);
    }
  }
}
