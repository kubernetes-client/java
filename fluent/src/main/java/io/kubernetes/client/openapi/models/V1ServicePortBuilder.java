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
public class V1ServicePortBuilder extends V1ServicePortFluent<V1ServicePortBuilder> implements VisitableBuilder<V1ServicePort,V1ServicePortBuilder>{

  V1ServicePortFluent<?> fluent;

  public V1ServicePortBuilder() {
    this(new V1ServicePort());
  }
  
  public V1ServicePortBuilder(V1ServicePortFluent<?> fluent) {
    this(fluent, new V1ServicePort());
  }
  
  public V1ServicePortBuilder(V1ServicePort instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ServicePortBuilder(V1ServicePortFluent<?> fluent,V1ServicePort instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ServicePort build() {
    V1ServicePort buildable = new V1ServicePort();
    buildable.setAppProtocol(fluent.getAppProtocol());
    buildable.setName(fluent.getName());
    buildable.setNodePort(fluent.getNodePort());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    buildable.setTargetPort(fluent.getTargetPort());
    return buildable;
  }
  
}