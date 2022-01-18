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

/** Generated */
public interface V1TokenRequestStatusFluent<
        A extends io.kubernetes.client.openapi.models.V1TokenRequestStatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.time.OffsetDateTime getExpirationTimestamp();

  public A withExpirationTimestamp(java.time.OffsetDateTime expirationTimestamp);

  public java.lang.Boolean hasExpirationTimestamp();

  public java.lang.String getToken();

  public A withToken(java.lang.String token);

  public java.lang.Boolean hasToken();

  /** Method is deprecated. use withToken instead. */
  @java.lang.Deprecated
  public A withNewToken(java.lang.String original);
}
