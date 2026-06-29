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
public class V1ContainerPortBuilder extends V1ContainerPortFluent<V1ContainerPortBuilder> implements VisitableBuilder<V1ContainerPort,V1ContainerPortBuilder>{

  V1ContainerPortFluent<?> fluent;

  public V1ContainerPortBuilder() {
    this(new V1ContainerPort());
  }
  
  public V1ContainerPortBuilder(V1ContainerPortFluent<?> fluent) {
    this(fluent, new V1ContainerPort());
  }
  
  public V1ContainerPortBuilder(V1ContainerPort instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ContainerPortBuilder(V1ContainerPortFluent<?> fluent,V1ContainerPort instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ContainerPort build() {
    V1ContainerPort buildable = new V1ContainerPort();
    buildable.setContainerPort(fluent.getContainerPort());
    buildable.setHostIP(fluent.getHostIP());
    buildable.setHostPort(fluent.getHostPort());
    buildable.setName(fluent.getName());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
  
}