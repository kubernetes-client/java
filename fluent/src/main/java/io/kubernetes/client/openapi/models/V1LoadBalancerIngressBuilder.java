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
public class V1LoadBalancerIngressBuilder extends V1LoadBalancerIngressFluent<V1LoadBalancerIngressBuilder> implements VisitableBuilder<V1LoadBalancerIngress,V1LoadBalancerIngressBuilder>{

  V1LoadBalancerIngressFluent<?> fluent;

  public V1LoadBalancerIngressBuilder() {
    this(new V1LoadBalancerIngress());
  }
  
  public V1LoadBalancerIngressBuilder(V1LoadBalancerIngressFluent<?> fluent) {
    this(fluent, new V1LoadBalancerIngress());
  }
  
  public V1LoadBalancerIngressBuilder(V1LoadBalancerIngress instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1LoadBalancerIngressBuilder(V1LoadBalancerIngressFluent<?> fluent,V1LoadBalancerIngress instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1LoadBalancerIngress build() {
    V1LoadBalancerIngress buildable = new V1LoadBalancerIngress();
    buildable.setHostname(fluent.getHostname());
    buildable.setIp(fluent.getIp());
    buildable.setIpMode(fluent.getIpMode());
    buildable.setPorts(fluent.buildPorts());
    return buildable;
  }
  
}