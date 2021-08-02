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

import com.google.gson.Gson;
import io.kubernetes.client.util.KubeConfig;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.*;
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
  private static final String ACCESS_TOKEN = "access-token";
  private static final String EXPIRY = "expiry";
  private static final String TOKEN_KEY = "token-key";
  private static final String EXPIRY_KEY = "expiry-key";
  private static final String CMD_ARGS = "cmd-args";
  private static final String CMD_PATH = "cmd-path";

  private static final Logger log = LoggerFactory.getLogger(GCPAuthenticator.class);

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
    if (!config.containsKey(CMD_ARGS) || !config.containsKey(CMD_PATH))
      throw new RuntimeException("Could not refresh token");
    String cmd_path= (String) config.get(CMD_PATH);
    String cmd_args = (String) config.get(CMD_ARGS);
    List<String> commandList = new ArrayList<>(Arrays.asList(cmd_args.split(" ")));
    commandList.add(0, cmd_path);
    try {
      Process process = new ProcessBuilder().command(commandList).start();
      process.waitFor(10, TimeUnit.SECONDS);
      String output = IOUtils.toString(process.getInputStream(), StandardCharsets.UTF_8);
      String credentialJson = output.substring(output.indexOf("{"), output.lastIndexOf("}")+1);
      Gson gson = new Gson();
      Map<String, String> jsonMap = gson.fromJson(credentialJson, Map.class);
      config.put(TOKEN_KEY, jsonMap.get(TOKEN_KEY));
      config.put(EXPIRY_KEY, jsonMap.get(EXPIRY_KEY));
    } catch (IOException | InterruptedException e) {
      throw new RuntimeException("Could not refresh token");
    }
    return config;
  }
}
