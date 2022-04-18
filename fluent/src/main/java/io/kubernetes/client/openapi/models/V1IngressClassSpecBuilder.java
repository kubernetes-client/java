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

public class V1IngressClassSpecBuilder
    extends V1IngressClassSpecFluentImpl<V1IngressClassSpecBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1IngressClassSpec,
        io.kubernetes.client.openapi.models.V1IngressClassSpecBuilder> {
  public V1IngressClassSpecBuilder() {
    this(false);
  }

  public V1IngressClassSpecBuilder(Boolean validationEnabled) {
    this(new V1IngressClassSpec(), validationEnabled);
  }

  public V1IngressClassSpecBuilder(V1IngressClassSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1IngressClassSpecBuilder(
      io.kubernetes.client.openapi.models.V1IngressClassSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1IngressClassSpec(), validationEnabled);
  }

  public V1IngressClassSpecBuilder(
      io.kubernetes.client.openapi.models.V1IngressClassSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1IngressClassSpec instance) {
    this(fluent, instance, false);
  }

  public V1IngressClassSpecBuilder(
      io.kubernetes.client.openapi.models.V1IngressClassSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1IngressClassSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withController(instance.getController());

    fluent.withParameters(instance.getParameters());

    this.validationEnabled = validationEnabled;
  }

  public V1IngressClassSpecBuilder(
      io.kubernetes.client.openapi.models.V1IngressClassSpec instance) {
    this(instance, false);
  }

  public V1IngressClassSpecBuilder(
      io.kubernetes.client.openapi.models.V1IngressClassSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withController(instance.getController());

    this.withParameters(instance.getParameters());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1IngressClassSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1IngressClassSpec build() {
    V1IngressClassSpec buildable = new V1IngressClassSpec();
    buildable.setController(fluent.getController());
    buildable.setParameters(fluent.getParameters());
    return buildable;
  }
}
