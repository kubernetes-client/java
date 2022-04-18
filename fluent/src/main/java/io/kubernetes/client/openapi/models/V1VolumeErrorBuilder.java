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

public class V1VolumeErrorBuilder extends V1VolumeErrorFluentImpl<V1VolumeErrorBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1VolumeError, V1VolumeErrorBuilder> {
  public V1VolumeErrorBuilder() {
    this(false);
  }

  public V1VolumeErrorBuilder(Boolean validationEnabled) {
    this(new V1VolumeError(), validationEnabled);
  }

  public V1VolumeErrorBuilder(io.kubernetes.client.openapi.models.V1VolumeErrorFluent<?> fluent) {
    this(fluent, false);
  }

  public V1VolumeErrorBuilder(
      io.kubernetes.client.openapi.models.V1VolumeErrorFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1VolumeError(), validationEnabled);
  }

  public V1VolumeErrorBuilder(
      io.kubernetes.client.openapi.models.V1VolumeErrorFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1VolumeError instance) {
    this(fluent, instance, false);
  }

  public V1VolumeErrorBuilder(
      io.kubernetes.client.openapi.models.V1VolumeErrorFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1VolumeError instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMessage(instance.getMessage());

    fluent.withTime(instance.getTime());

    this.validationEnabled = validationEnabled;
  }

  public V1VolumeErrorBuilder(io.kubernetes.client.openapi.models.V1VolumeError instance) {
    this(instance, false);
  }

  public V1VolumeErrorBuilder(
      io.kubernetes.client.openapi.models.V1VolumeError instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withMessage(instance.getMessage());

    this.withTime(instance.getTime());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1VolumeErrorFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1VolumeError build() {
    V1VolumeError buildable = new V1VolumeError();
    buildable.setMessage(fluent.getMessage());
    buildable.setTime(fluent.getTime());
    return buildable;
  }
}
