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
public class V1LoadBalancerStatusBuilder extends V1LoadBalancerStatusFluent<V1LoadBalancerStatusBuilder> implements VisitableBuilder<V1LoadBalancerStatus,V1LoadBalancerStatusBuilder>{

  V1LoadBalancerStatusFluent<?> fluent;

  public V1LoadBalancerStatusBuilder() {
    this(new V1LoadBalancerStatus());
  }
  
  public V1LoadBalancerStatusBuilder(V1LoadBalancerStatusFluent<?> fluent) {
    this(fluent, new V1LoadBalancerStatus());
  }
  
  public V1LoadBalancerStatusBuilder(V1LoadBalancerStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1LoadBalancerStatusBuilder(V1LoadBalancerStatusFluent<?> fluent,V1LoadBalancerStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1LoadBalancerStatus build() {
    V1LoadBalancerStatus buildable = new V1LoadBalancerStatus();
    buildable.setIngress(fluent.buildIngress());
    return buildable;
  }
  
}