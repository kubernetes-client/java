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
import java.time.Instant;
import java.util.Date;
import java.util.Map;
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

  private static final Logger log = LoggerFactory.getLogger(GCPAuthenticator.class);

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
    Object expiryObj = config.get("expiry");
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
    throw new IllegalStateException("Unimplemented");
  }
}
