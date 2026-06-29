/*
Copyright 2026 The Kubernetes Authors.
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
public class V1ContainerResizePolicyBuilder extends V1ContainerResizePolicyFluent<V1ContainerResizePolicyBuilder> implements VisitableBuilder<V1ContainerResizePolicy,V1ContainerResizePolicyBuilder>{

  V1ContainerResizePolicyFluent<?> fluent;

  public V1ContainerResizePolicyBuilder() {
    this(new V1ContainerResizePolicy());
  }
  
  public V1ContainerResizePolicyBuilder(V1ContainerResizePolicyFluent<?> fluent) {
    this(fluent, new V1ContainerResizePolicy());
  }
  
  public V1ContainerResizePolicyBuilder(V1ContainerResizePolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ContainerResizePolicyBuilder(V1ContainerResizePolicyFluent<?> fluent,V1ContainerResizePolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ContainerResizePolicy build() {
    V1ContainerResizePolicy buildable = new V1ContainerResizePolicy();
    buildable.setResourceName(fluent.getResourceName());
    buildable.setRestartPolicy(fluent.getRestartPolicy());
    return buildable;
  }
  
}