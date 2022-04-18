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

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1ServiceAccountTokenProjectionBuilder
    extends V1ServiceAccountTokenProjectionFluentImpl<V1ServiceAccountTokenProjectionBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection,
        io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjectionBuilder> {
  public V1ServiceAccountTokenProjectionBuilder() {
    this(false);
  }

  public V1ServiceAccountTokenProjectionBuilder(Boolean validationEnabled) {
    this(new V1ServiceAccountTokenProjection(), validationEnabled);
  }

  public V1ServiceAccountTokenProjectionBuilder(V1ServiceAccountTokenProjectionFluent<?> fluent) {
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
}
