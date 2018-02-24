/*
Copyright 2018 The Kubernetes Authors.
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
import java.util.Date;
import java.util.Map;

/**
 * The Authenticator interface represents a plugin that can handle a specific type of authentication
 * information (e.g. 'azure')
 */
public class AzureActiveDirectoryAuthenticator implements Authenticator {
  static {
    KubeConfig.registerAuthenticator(new AzureActiveDirectoryAuthenticator());
  }

  private static final String ACCESS_TOKEN = "access-token";
  private static final String EXPIRES_ON = "expires-on";

  @Override
  public String getName() {
    return "azure";
  }

  @Override
  public String getToken(Map<String, Object> config) {
    return (String) config.get(ACCESS_TOKEN);
  }

  @Override
  public boolean isExpired(Map<String, Object> config) {
    String expiresOn = (String) config.get(EXPIRES_ON);
    Date expiry = new Date(Long.parseLong(expiresOn) * 1000);
    if (expiry != null && expiry.compareTo(new Date()) <= 0) {
      return true;
    }
    return false;
  }

  @Override
  public Map<String, Object> refresh(Map<String, Object> config) {
    throw new RuntimeException("Unimplemented");
  }
}
