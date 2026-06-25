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
public class V1ServiceCIDRStatusBuilder extends V1ServiceCIDRStatusFluent<V1ServiceCIDRStatusBuilder> implements VisitableBuilder<V1ServiceCIDRStatus,V1ServiceCIDRStatusBuilder>{

  V1ServiceCIDRStatusFluent<?> fluent;

  public V1ServiceCIDRStatusBuilder() {
    this(new V1ServiceCIDRStatus());
  }
  
  public V1ServiceCIDRStatusBuilder(V1ServiceCIDRStatusFluent<?> fluent) {
    this(fluent, new V1ServiceCIDRStatus());
  }
  
  public V1ServiceCIDRStatusBuilder(V1ServiceCIDRStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ServiceCIDRStatusBuilder(V1ServiceCIDRStatusFluent<?> fluent,V1ServiceCIDRStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ServiceCIDRStatus build() {
    V1ServiceCIDRStatus buildable = new V1ServiceCIDRStatus();
    buildable.setConditions(fluent.buildConditions());
    return buildable;
  }
  
}