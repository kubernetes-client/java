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

public class V1alpha1RuntimeClassSpecBuilder
    extends V1alpha1RuntimeClassSpecFluentImpl<V1alpha1RuntimeClassSpecBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpec,
        V1alpha1RuntimeClassSpecBuilder> {
  public V1alpha1RuntimeClassSpecBuilder() {
    this(false);
  }

  public V1alpha1RuntimeClassSpecBuilder(Boolean validationEnabled) {
    this(new V1alpha1RuntimeClassSpec(), validationEnabled);
  }

  public V1alpha1RuntimeClassSpecBuilder(
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1alpha1RuntimeClassSpecBuilder(
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1alpha1RuntimeClassSpec(), validationEnabled);
  }

  public V1alpha1RuntimeClassSpecBuilder(
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpec instance) {
    this(fluent, instance, false);
  }

  public V1alpha1RuntimeClassSpecBuilder(
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withOverhead(instance.getOverhead());

    fluent.withRuntimeHandler(instance.getRuntimeHandler());

    fluent.withScheduling(instance.getScheduling());

    this.validationEnabled = validationEnabled;
  }

  public V1alpha1RuntimeClassSpecBuilder(
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpec instance) {
    this(instance, false);
  }

  public V1alpha1RuntimeClassSpecBuilder(
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withOverhead(instance.getOverhead());

    this.withRuntimeHandler(instance.getRuntimeHandler());

    this.withScheduling(instance.getScheduling());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpec build() {
    V1alpha1RuntimeClassSpec buildable = new V1alpha1RuntimeClassSpec();
    buildable.setOverhead(fluent.getOverhead());
    buildable.setRuntimeHandler(fluent.getRuntimeHandler());
    buildable.setScheduling(fluent.getScheduling());
    return buildable;
  }
}
