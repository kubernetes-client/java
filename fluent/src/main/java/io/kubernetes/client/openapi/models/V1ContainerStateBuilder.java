/*
Copyright 2020 The Kubernetes Authors.
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
import java.lang.Object;
public class V1ContainerStateBuilder extends V1ContainerStateFluent<V1ContainerStateBuilder> implements VisitableBuilder<V1ContainerState,V1ContainerStateBuilder>{

  V1ContainerStateFluent<?> fluent;

  public V1ContainerStateBuilder() {
    this(new V1ContainerState());
  }
  
  public V1ContainerStateBuilder(V1ContainerStateFluent<?> fluent) {
    this(fluent, new V1ContainerState());
  }
  
  public V1ContainerStateBuilder(V1ContainerState instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ContainerStateBuilder(V1ContainerStateFluent<?> fluent,V1ContainerState instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ContainerState build() {
    V1ContainerState buildable = new V1ContainerState();
    buildable.setRunning(fluent.buildRunning());
    buildable.setTerminated(fluent.buildTerminated());
    buildable.setWaiting(fluent.buildWaiting());
    return buildable;
  }
  
}