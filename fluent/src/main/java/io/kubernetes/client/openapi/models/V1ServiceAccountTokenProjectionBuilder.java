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

public class V1ServiceAccountTokenProjectionBuilder
    extends io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjectionFluentImpl<
        io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjectionBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection,
        io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjectionBuilder> {
  public V1ServiceAccountTokenProjectionBuilder() {
    this(false);
  }

  public V1ServiceAccountTokenProjectionBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ServiceAccountTokenProjection(), validationEnabled);
  }

  public V1ServiceAccountTokenProjectionBuilder(
      io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjectionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ServiceAccountTokenProjectionBuilder(
      io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjectionFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ServiceAccountTokenProjection(), validationEnabled);
  }

  public V1ServiceAccountTokenProjectionBuilder(
      io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjectionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection instance) {
    this(fluent, instance, false);
  }

  public V1ServiceAccountTokenProjectionBuilder(
      io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjectionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAudience(instance.getAudience());

    fluent.withExpirationSeconds(instance.getExpirationSeconds());

    fluent.withPath(instance.getPath());

    this.validationEnabled = validationEnabled;
  }

  public V1ServiceAccountTokenProjectionBuilder(
      io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection instance) {
    this(instance, false);
  }

  public V1ServiceAccountTokenProjectionBuilder(
      io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAudience(instance.getAudience());

    this.withExpirationSeconds(instance.getExpirationSeconds());

    this.withPath(instance.getPath());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjectionFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection build() {
    V1ServiceAccountTokenProjection buildable = new V1ServiceAccountTokenProjection();
    buildable.setAudience(fluent.getAudience());
    buildable.setExpirationSeconds(fluent.getExpirationSeconds());
    buildable.setPath(fluent.getPath());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ServiceAccountTokenProjectionBuilder that = (V1ServiceAccountTokenProjectionBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}
