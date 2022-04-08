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

public class V1SeccompProfileBuilder extends V1SeccompProfileFluentImpl<V1SeccompProfileBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1SeccompProfile,
        io.kubernetes.client.openapi.models.V1SeccompProfileBuilder> {
  public V1SeccompProfileBuilder() {
    this(false);
  }

  public V1SeccompProfileBuilder(Boolean validationEnabled) {
    this(new V1SeccompProfile(), validationEnabled);
  }

  public V1SeccompProfileBuilder(V1SeccompProfileFluent<?> fluent) {
    this(fluent, false);
  }

  public V1SeccompProfileBuilder(
      io.kubernetes.client.openapi.models.V1SeccompProfileFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1SeccompProfile(), validationEnabled);
  }

  public V1SeccompProfileBuilder(
      io.kubernetes.client.openapi.models.V1SeccompProfileFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1SeccompProfile instance) {
    this(fluent, instance, false);
  }

  public V1SeccompProfileBuilder(
      io.kubernetes.client.openapi.models.V1SeccompProfileFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1SeccompProfile instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withLocalhostProfile(instance.getLocalhostProfile());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1SeccompProfileBuilder(io.kubernetes.client.openapi.models.V1SeccompProfile instance) {
    this(instance, false);
  }

  public V1SeccompProfileBuilder(
      io.kubernetes.client.openapi.models.V1SeccompProfile instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withLocalhostProfile(instance.getLocalhostProfile());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1SeccompProfileFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1SeccompProfile build() {
    V1SeccompProfile buildable = new V1SeccompProfile();
    buildable.setLocalhostProfile(fluent.getLocalhostProfile());
    buildable.setType(fluent.getType());
    return buildable;
  }
}
