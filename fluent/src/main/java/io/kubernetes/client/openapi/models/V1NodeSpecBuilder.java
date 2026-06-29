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
public class V1NodeSpecBuilder extends V1NodeSpecFluent<V1NodeSpecBuilder> implements VisitableBuilder<V1NodeSpec,V1NodeSpecBuilder>{

  V1NodeSpecFluent<?> fluent;

  public V1NodeSpecBuilder() {
    this(new V1NodeSpec());
  }
  
  public V1NodeSpecBuilder(V1NodeSpecFluent<?> fluent) {
    this(fluent, new V1NodeSpec());
  }
  
  public V1NodeSpecBuilder(V1NodeSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NodeSpecBuilder(V1NodeSpecFluent<?> fluent,V1NodeSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NodeSpec build() {
    V1NodeSpec buildable = new V1NodeSpec();
    buildable.setConfigSource(fluent.buildConfigSource());
    buildable.setExternalID(fluent.getExternalID());
    buildable.setPodCIDR(fluent.getPodCIDR());
    buildable.setPodCIDRs(fluent.getPodCIDRs());
    buildable.setProviderID(fluent.getProviderID());
    buildable.setTaints(fluent.buildTaints());
    buildable.setUnschedulable(fluent.getUnschedulable());
    return buildable;
  }
  
}