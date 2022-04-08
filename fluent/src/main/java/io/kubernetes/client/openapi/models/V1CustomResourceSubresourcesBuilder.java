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

public class V1CustomResourceSubresourcesBuilder
    extends V1CustomResourceSubresourcesFluentImpl<V1CustomResourceSubresourcesBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1CustomResourceSubresources,
        V1CustomResourceSubresourcesBuilder> {
  public V1CustomResourceSubresourcesBuilder() {
    this(false);
  }

  public V1CustomResourceSubresourcesBuilder(Boolean validationEnabled) {
    this(new V1CustomResourceSubresources(), validationEnabled);
  }

  public V1CustomResourceSubresourcesBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CustomResourceSubresourcesBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1CustomResourceSubresources(), validationEnabled);
  }

  public V1CustomResourceSubresourcesBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CustomResourceSubresources instance) {
    this(fluent, instance, false);
  }

  public V1CustomResourceSubresourcesBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CustomResourceSubresources instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withScale(instance.getScale());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled;
  }

  public V1CustomResourceSubresourcesBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceSubresources instance) {
    this(instance, false);
  }

  public V1CustomResourceSubresourcesBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceSubresources instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withScale(instance.getScale());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1CustomResourceSubresources build() {
    V1CustomResourceSubresources buildable = new V1CustomResourceSubresources();
    buildable.setScale(fluent.getScale());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
}
