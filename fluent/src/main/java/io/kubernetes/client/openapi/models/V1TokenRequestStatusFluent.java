/*
Copyright 2022 The Kubernetes Authors.
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
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.time.OffsetDateTime;

/** Generated */
public interface V1TokenRequestStatusFluent<A extends V1TokenRequestStatusFluent<A>>
    extends Fluent<A> {
  public OffsetDateTime getExpirationTimestamp();

  public A withExpirationTimestamp(java.time.OffsetDateTime expirationTimestamp);

  public Boolean hasExpirationTimestamp();

  public String getToken();

  public A withToken(java.lang.String token);

  public java.lang.Boolean hasToken();
}
