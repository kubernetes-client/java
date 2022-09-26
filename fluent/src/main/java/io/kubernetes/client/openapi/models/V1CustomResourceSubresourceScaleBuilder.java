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

public class V1CustomResourceSubresourceScaleBuilder
    extends V1CustomResourceSubresourceScaleFluentImpl<V1CustomResourceSubresourceScaleBuilder>
    implements VisitableBuilder<
        V1CustomResourceSubresourceScale, V1CustomResourceSubresourceScaleBuilder> {
  public V1CustomResourceSubresourceScaleBuilder() {
    this(false);
  }

  public V1CustomResourceSubresourceScaleBuilder(Boolean validationEnabled) {
    this(new V1CustomResourceSubresourceScale(), validationEnabled);
  }

  public V1CustomResourceSubresourceScaleBuilder(V1CustomResourceSubresourceScaleFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CustomResourceSubresourceScaleBuilder(
      V1CustomResourceSubresourceScaleFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1CustomResourceSubresourceScale(), validationEnabled);
  }

  public V1CustomResourceSubresourceScaleBuilder(
      V1CustomResourceSubresourceScaleFluent<?> fluent, V1CustomResourceSubresourceScale instance) {
    this(fluent, instance, false);
  }

  public V1CustomResourceSubresourceScaleBuilder(
      V1CustomResourceSubresourceScaleFluent<?> fluent,
      V1CustomResourceSubresourceScale instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withLabelSelectorPath(instance.getLabelSelectorPath());

    fluent.withSpecReplicasPath(instance.getSpecReplicasPath());

    fluent.withStatusReplicasPath(instance.getStatusReplicasPath());

    this.validationEnabled = validationEnabled;
  }

  public V1CustomResourceSubresourceScaleBuilder(V1CustomResourceSubresourceScale instance) {
    this(instance, false);
  }

  public V1CustomResourceSubresourceScaleBuilder(
      V1CustomResourceSubresourceScale instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withLabelSelectorPath(instance.getLabelSelectorPath());

    this.withSpecReplicasPath(instance.getSpecReplicasPath());

    this.withStatusReplicasPath(instance.getStatusReplicasPath());

    this.validationEnabled = validationEnabled;
  }

  V1CustomResourceSubresourceScaleFluent<?> fluent;
  Boolean validationEnabled;

  public V1CustomResourceSubresourceScale build() {
    V1CustomResourceSubresourceScale buildable = new V1CustomResourceSubresourceScale();
    buildable.setLabelSelectorPath(fluent.getLabelSelectorPath());
    buildable.setSpecReplicasPath(fluent.getSpecReplicasPath());
    buildable.setStatusReplicasPath(fluent.getStatusReplicasPath());
    return buildable;
  }
}
