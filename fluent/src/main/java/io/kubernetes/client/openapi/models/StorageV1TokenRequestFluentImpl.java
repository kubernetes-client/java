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

/** Generated */
@SuppressWarnings(value = "unchecked")
public class StorageV1TokenRequestFluentImpl<A extends StorageV1TokenRequestFluent<A>>
    extends BaseFluent<A> implements StorageV1TokenRequestFluent<A> {
  public StorageV1TokenRequestFluentImpl() {}

  public StorageV1TokenRequestFluentImpl(
      io.kubernetes.client.openapi.models.StorageV1TokenRequest instance) {
    this.withAudience(instance.getAudience());

    this.withExpirationSeconds(instance.getExpirationSeconds());
  }

  private String audience;
  private Long expirationSeconds;

  public java.lang.String getAudience() {
    return this.audience;
  }

  public A withAudience(java.lang.String audience) {
    this.audience = audience;
    return (A) this;
  }

  public Boolean hasAudience() {
    return this.audience != null;
  }

  public java.lang.Long getExpirationSeconds() {
    return this.expirationSeconds;
  }

  public A withExpirationSeconds(java.lang.Long expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
    return (A) this;
  }

  public java.lang.Boolean hasExpirationSeconds() {
    return this.expirationSeconds != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StorageV1TokenRequestFluentImpl that = (StorageV1TokenRequestFluentImpl) o;
    if (audience != null ? !audience.equals(that.audience) : that.audience != null) return false;
    if (expirationSeconds != null
        ? !expirationSeconds.equals(that.expirationSeconds)
        : that.expirationSeconds != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(audience, expirationSeconds, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (audience != null) {
      sb.append("audience:");
      sb.append(audience + ",");
    }
    if (expirationSeconds != null) {
      sb.append("expirationSeconds:");
      sb.append(expirationSeconds);
    }
    sb.append("}");
    return sb.toString();
  }
}
