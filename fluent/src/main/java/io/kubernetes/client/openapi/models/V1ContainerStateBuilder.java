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

public class V1ContainerStateBuilder extends V1ContainerStateFluentImpl<V1ContainerStateBuilder>
    implements VisitableBuilder<V1ContainerState, V1ContainerStateBuilder> {
  public V1ContainerStateBuilder() {
    this(false);
  }

  public V1ContainerStateBuilder(Boolean validationEnabled) {
    this(new V1ContainerState(), validationEnabled);
  }

  public V1ContainerStateBuilder(V1ContainerStateFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ContainerStateBuilder(V1ContainerStateFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ContainerState(), validationEnabled);
  }

  public V1ContainerStateBuilder(V1ContainerStateFluent<?> fluent, V1ContainerState instance) {
    this(fluent, instance, false);
  }

  public V1ContainerStateBuilder(
      V1ContainerStateFluent<?> fluent, V1ContainerState instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withRunning(instance.getRunning());

    fluent.withTerminated(instance.getTerminated());

    fluent.withWaiting(instance.getWaiting());

    this.validationEnabled = validationEnabled;
  }

  public V1ContainerStateBuilder(V1ContainerState instance) {
    this(instance, false);
  }

  public V1ContainerStateBuilder(V1ContainerState instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withRunning(instance.getRunning());

    this.withTerminated(instance.getTerminated());

    this.withWaiting(instance.getWaiting());

    this.validationEnabled = validationEnabled;
  }

  V1ContainerStateFluent<?> fluent;
  Boolean validationEnabled;

  public V1ContainerState build() {
    V1ContainerState buildable = new V1ContainerState();
    buildable.setRunning(fluent.getRunning());
    buildable.setTerminated(fluent.getTerminated());
    buildable.setWaiting(fluent.getWaiting());
    return buildable;
  }
}
