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

public class V1ContainerImageBuilder extends V1ContainerImageFluentImpl<V1ContainerImageBuilder>
    implements VisitableBuilder<V1ContainerImage, V1ContainerImageBuilder> {
  public V1ContainerImageBuilder() {
    this(false);
  }

  public V1ContainerImageBuilder(Boolean validationEnabled) {
    this(new V1ContainerImage(), validationEnabled);
  }

  public V1ContainerImageBuilder(V1ContainerImageFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ContainerImageBuilder(V1ContainerImageFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ContainerImage(), validationEnabled);
  }

  public V1ContainerImageBuilder(V1ContainerImageFluent<?> fluent, V1ContainerImage instance) {
    this(fluent, instance, false);
  }

  public V1ContainerImageBuilder(
      V1ContainerImageFluent<?> fluent, V1ContainerImage instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withNames(instance.getNames());

    fluent.withSizeBytes(instance.getSizeBytes());

    this.validationEnabled = validationEnabled;
  }

  public V1ContainerImageBuilder(V1ContainerImage instance) {
    this(instance, false);
  }

  public V1ContainerImageBuilder(V1ContainerImage instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withNames(instance.getNames());

    this.withSizeBytes(instance.getSizeBytes());

    this.validationEnabled = validationEnabled;
  }

  V1ContainerImageFluent<?> fluent;
  Boolean validationEnabled;

  public V1ContainerImage build() {
    V1ContainerImage buildable = new V1ContainerImage();
    buildable.setNames(fluent.getNames());
    buildable.setSizeBytes(fluent.getSizeBytes());
    return buildable;
  }
}
