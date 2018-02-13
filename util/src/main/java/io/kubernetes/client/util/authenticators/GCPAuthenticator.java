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
import java.util.Date;
import java.util.Map;

/**
 * The Authenticator interface represents a plugin that can handle a specific type of authentication
 * information (e.g. 'gcp')
 */
public class GCPAuthenticator implements Authenticator {
  static {
    KubeConfig.registerAuthenticator(new GCPAuthenticator());
  }

  @Override
  public String getName() {
    return "gcp";
  }

  @Override
  public String getToken(Map<String, Object> config) {
    return (String) config.get("access-token");
  }

  @Override
  public boolean isExpired(Map<String, Object> config) {
    Date expiry = (Date) config.get("expiry");
    if (expiry != null && expiry.compareTo(new Date()) <= 0) {
      return true;
    }
    return false;
  }

  @Override
  public Map<String, Object> refresh(Map<String, Object> config) {
    throw new IllegalStateException("Unimplemented");
  }
}
