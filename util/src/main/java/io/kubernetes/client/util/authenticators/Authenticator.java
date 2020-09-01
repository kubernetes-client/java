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

import java.util.Map;

/**
 * The Authenticator interface represents a plugin that can handle a specific type of authentication
 * information (e.g. 'gcp')
 */
public interface Authenticator {
  /**
   * Return the name of this authenticator, this should be the value that is also in a kubeconfig
   * file.
   */
  String getName();

  /**
   * Get a token from this authenticator.
   *
   * @param config The configuration information for this authenticator
   * @return The new token, null of no such token can be found/generated
   */
  String getToken(Map<String, Object> config);

  /** Determine if this config is expired */
  boolean isExpired(Map<String, Object> config);

  /** Refresh an expired token with a new fresh one. */
  Map<String, Object> refresh(Map<String, Object> config);
}
