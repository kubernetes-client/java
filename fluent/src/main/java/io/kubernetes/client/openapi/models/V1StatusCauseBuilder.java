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

public class V1StatusCauseBuilder extends V1StatusCauseFluentImpl<V1StatusCauseBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1StatusCause,
        io.kubernetes.client.openapi.models.V1StatusCauseBuilder> {
  public V1StatusCauseBuilder() {
    this(false);
  }

  public V1StatusCauseBuilder(Boolean validationEnabled) {
    this(new V1StatusCause(), validationEnabled);
  }

  public V1StatusCauseBuilder(V1StatusCauseFluent<?> fluent) {
    this(fluent, false);
  }

  public V1StatusCauseBuilder(
      io.kubernetes.client.openapi.models.V1StatusCauseFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1StatusCause(), validationEnabled);
  }

  public V1StatusCauseBuilder(
      io.kubernetes.client.openapi.models.V1StatusCauseFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1StatusCause instance) {
    this(fluent, instance, false);
  }

  public V1StatusCauseBuilder(
      io.kubernetes.client.openapi.models.V1StatusCauseFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1StatusCause instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withField(instance.getField());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    this.validationEnabled = validationEnabled;
  }

  public V1StatusCauseBuilder(io.kubernetes.client.openapi.models.V1StatusCause instance) {
    this(instance, false);
  }

  public V1StatusCauseBuilder(
      io.kubernetes.client.openapi.models.V1StatusCause instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withField(instance.getField());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1StatusCauseFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1StatusCause build() {
    V1StatusCause buildable = new V1StatusCause();
    buildable.setField(fluent.getField());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    return buildable;
  }
}
