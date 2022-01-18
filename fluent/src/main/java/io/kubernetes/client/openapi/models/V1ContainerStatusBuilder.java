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

public class V1ContainerStatusBuilder
    extends io.kubernetes.client.openapi.models.V1ContainerStatusFluentImpl<
        io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ContainerStatus,
        io.kubernetes.client.openapi.models.V1ContainerStatusBuilder> {
  public V1ContainerStatusBuilder() {
    this(false);
  }

  public V1ContainerStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ContainerStatus(), validationEnabled);
  }

  public V1ContainerStatusBuilder(
      io.kubernetes.client.openapi.models.V1ContainerStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ContainerStatusBuilder(
      io.kubernetes.client.openapi.models.V1ContainerStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ContainerStatus(), validationEnabled);
  }

  public V1ContainerStatusBuilder(
      io.kubernetes.client.openapi.models.V1ContainerStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ContainerStatus instance) {
    this(fluent, instance, false);
  }

  public V1ContainerStatusBuilder(
      io.kubernetes.client.openapi.models.V1ContainerStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ContainerStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withContainerID(instance.getContainerID());

    fluent.withImage(instance.getImage());

    fluent.withImageID(instance.getImageID());

    fluent.withLastState(instance.getLastState());

    fluent.withName(instance.getName());

    fluent.withReady(instance.getReady());

    fluent.withRestartCount(instance.getRestartCount());

    fluent.withStarted(instance.getStarted());

    fluent.withState(instance.getState());

    this.validationEnabled = validationEnabled;
  }

  public V1ContainerStatusBuilder(io.kubernetes.client.openapi.models.V1ContainerStatus instance) {
    this(instance, false);
  }

  public V1ContainerStatusBuilder(
      io.kubernetes.client.openapi.models.V1ContainerStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withContainerID(instance.getContainerID());

    this.withImage(instance.getImage());

    this.withImageID(instance.getImageID());

    this.withLastState(instance.getLastState());

    this.withName(instance.getName());

    this.withReady(instance.getReady());

    this.withRestartCount(instance.getRestartCount());

    this.withStarted(instance.getStarted());

    this.withState(instance.getState());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ContainerStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ContainerStatus build() {
    V1ContainerStatus buildable = new V1ContainerStatus();
    buildable.setContainerID(fluent.getContainerID());
    buildable.setImage(fluent.getImage());
    buildable.setImageID(fluent.getImageID());
    buildable.setLastState(fluent.getLastState());
    buildable.setName(fluent.getName());
    buildable.setReady(fluent.getReady());
    buildable.setRestartCount(fluent.getRestartCount());
    buildable.setStarted(fluent.getStarted());
    buildable.setState(fluent.getState());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ContainerStatusBuilder that = (V1ContainerStatusBuilder) o;
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
