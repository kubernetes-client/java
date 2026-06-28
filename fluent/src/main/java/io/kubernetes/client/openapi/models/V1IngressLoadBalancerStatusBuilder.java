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
public class V1IngressLoadBalancerStatusBuilder extends V1IngressLoadBalancerStatusFluent<V1IngressLoadBalancerStatusBuilder> implements VisitableBuilder<V1IngressLoadBalancerStatus,V1IngressLoadBalancerStatusBuilder>{

  V1IngressLoadBalancerStatusFluent<?> fluent;

  public V1IngressLoadBalancerStatusBuilder() {
    this(new V1IngressLoadBalancerStatus());
  }
  
  public V1IngressLoadBalancerStatusBuilder(V1IngressLoadBalancerStatusFluent<?> fluent) {
    this(fluent, new V1IngressLoadBalancerStatus());
  }
  
  public V1IngressLoadBalancerStatusBuilder(V1IngressLoadBalancerStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1IngressLoadBalancerStatusBuilder(V1IngressLoadBalancerStatusFluent<?> fluent,V1IngressLoadBalancerStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1IngressLoadBalancerStatus build() {
    V1IngressLoadBalancerStatus buildable = new V1IngressLoadBalancerStatus();
    buildable.setIngress(fluent.buildIngress());
    return buildable;
  }
  
}