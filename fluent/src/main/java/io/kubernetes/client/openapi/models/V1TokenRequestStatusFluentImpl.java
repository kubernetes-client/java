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

import io.kubernetes.client.fluent.BaseFluent;
import java.time.OffsetDateTime;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1TokenRequestStatusFluentImpl<A extends V1TokenRequestStatusFluent<A>>
    extends BaseFluent<A> implements V1TokenRequestStatusFluent<A> {
  public V1TokenRequestStatusFluentImpl() {}

  public V1TokenRequestStatusFluentImpl(
      io.kubernetes.client.openapi.models.V1TokenRequestStatus instance) {
    this.withExpirationTimestamp(instance.getExpirationTimestamp());

    this.withToken(instance.getToken());
  }

  private OffsetDateTime expirationTimestamp;
  private String token;

  public java.time.OffsetDateTime getExpirationTimestamp() {
    return this.expirationTimestamp;
  }

  public A withExpirationTimestamp(java.time.OffsetDateTime expirationTimestamp) {
    this.expirationTimestamp = expirationTimestamp;
    return (A) this;
  }

  public Boolean hasExpirationTimestamp() {
    return this.expirationTimestamp != null;
  }

  public java.lang.String getToken() {
    return this.token;
  }

  public A withToken(java.lang.String token) {
    this.token = token;
    return (A) this;
  }

  public java.lang.Boolean hasToken() {
    return this.token != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1TokenRequestStatusFluentImpl that = (V1TokenRequestStatusFluentImpl) o;
    if (expirationTimestamp != null
        ? !expirationTimestamp.equals(that.expirationTimestamp)
        : that.expirationTimestamp != null) return false;
    if (token != null ? !token.equals(that.token) : that.token != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(expirationTimestamp, token, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (expirationTimestamp != null) {
      sb.append("expirationTimestamp:");
      sb.append(expirationTimestamp + ",");
    }
    if (token != null) {
      sb.append("token:");
      sb.append(token);
    }
    sb.append("}");
    return sb.toString();
  }
}
