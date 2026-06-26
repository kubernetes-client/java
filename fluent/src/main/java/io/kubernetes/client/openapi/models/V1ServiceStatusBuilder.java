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
public class V1ServiceStatusBuilder extends V1ServiceStatusFluent<V1ServiceStatusBuilder> implements VisitableBuilder<V1ServiceStatus,V1ServiceStatusBuilder>{

  V1ServiceStatusFluent<?> fluent;

  public V1ServiceStatusBuilder() {
    this(new V1ServiceStatus());
  }
  
  public V1ServiceStatusBuilder(V1ServiceStatusFluent<?> fluent) {
    this(fluent, new V1ServiceStatus());
  }
  
  public V1ServiceStatusBuilder(V1ServiceStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ServiceStatusBuilder(V1ServiceStatusFluent<?> fluent,V1ServiceStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ServiceStatus build() {
    V1ServiceStatus buildable = new V1ServiceStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setLoadBalancer(fluent.buildLoadBalancer());
    return buildable;
  }
  
}