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
public class V1ContainerStateWaitingBuilder extends V1ContainerStateWaitingFluent<V1ContainerStateWaitingBuilder> implements VisitableBuilder<V1ContainerStateWaiting,V1ContainerStateWaitingBuilder>{

  V1ContainerStateWaitingFluent<?> fluent;

  public V1ContainerStateWaitingBuilder() {
    this(new V1ContainerStateWaiting());
  }
  
  public V1ContainerStateWaitingBuilder(V1ContainerStateWaitingFluent<?> fluent) {
    this(fluent, new V1ContainerStateWaiting());
  }
  
  public V1ContainerStateWaitingBuilder(V1ContainerStateWaiting instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ContainerStateWaitingBuilder(V1ContainerStateWaitingFluent<?> fluent,V1ContainerStateWaiting instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ContainerStateWaiting build() {
    V1ContainerStateWaiting buildable = new V1ContainerStateWaiting();
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    return buildable;
  }
  
}