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

import io.kubernetes.client.openapi.ApiClient;
import java.util.Objects;

/** Uses a Bearer Token to configure {@link ApiClient} authentication to the Kubernetes API. */
public class AccessTokenAuthentication implements Authentication {
  private String token;

  public AccessTokenAuthentication(final String token) {
    Objects.requireNonNull(token, "Access Token cannot be null");
    this.token = token;
  }

  @Override
  public void provide(ApiClient client) {
    client.setApiKeyPrefix("Bearer");
    client.setApiKey(token);
  }
}
