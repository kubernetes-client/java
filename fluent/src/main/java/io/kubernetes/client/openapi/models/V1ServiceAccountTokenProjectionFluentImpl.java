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
public class V1ServiceAccountTokenProjectionFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjectionFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjectionFluent<A> {
  public V1ServiceAccountTokenProjectionFluentImpl() {}

  public V1ServiceAccountTokenProjectionFluentImpl(
      io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection instance) {
    this.withAudience(instance.getAudience());

    this.withExpirationSeconds(instance.getExpirationSeconds());

    this.withPath(instance.getPath());
  }

  private java.lang.String audience;
  private java.lang.Long expirationSeconds;
  private java.lang.String path;

  public java.lang.String getAudience() {
    return this.audience;
  }

  public A withAudience(java.lang.String audience) {
    this.audience = audience;
    return (A) this;
  }

  public java.lang.Boolean hasAudience() {
    return this.audience != null;
  }

  /** Method is deprecated. use withAudience instead. */
  @java.lang.Deprecated
  public A withNewAudience(java.lang.String original) {
    return (A) withAudience(new String(original));
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

  public java.lang.String getPath() {
    return this.path;
  }

  public A withPath(java.lang.String path) {
    this.path = path;
    return (A) this;
  }

  public java.lang.Boolean hasPath() {
    return this.path != null;
  }

  /** Method is deprecated. use withPath instead. */
  @java.lang.Deprecated
  public A withNewPath(java.lang.String original) {
    return (A) withPath(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ServiceAccountTokenProjectionFluentImpl that = (V1ServiceAccountTokenProjectionFluentImpl) o;
    if (audience != null ? !audience.equals(that.audience) : that.audience != null) return false;
    if (expirationSeconds != null
        ? !expirationSeconds.equals(that.expirationSeconds)
        : that.expirationSeconds != null) return false;
    if (path != null ? !path.equals(that.path) : that.path != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(audience, expirationSeconds, path, super.hashCode());
  }
}
