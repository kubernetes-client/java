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
public class V1TopologySpreadConstraintBuilder extends V1TopologySpreadConstraintFluent<V1TopologySpreadConstraintBuilder> implements VisitableBuilder<V1TopologySpreadConstraint,V1TopologySpreadConstraintBuilder>{

  V1TopologySpreadConstraintFluent<?> fluent;

  public V1TopologySpreadConstraintBuilder() {
    this(new V1TopologySpreadConstraint());
  }
  
  public V1TopologySpreadConstraintBuilder(V1TopologySpreadConstraintFluent<?> fluent) {
    this(fluent, new V1TopologySpreadConstraint());
  }
  
  public V1TopologySpreadConstraintBuilder(V1TopologySpreadConstraint instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1TopologySpreadConstraintBuilder(V1TopologySpreadConstraintFluent<?> fluent,V1TopologySpreadConstraint instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1TopologySpreadConstraint build() {
    V1TopologySpreadConstraint buildable = new V1TopologySpreadConstraint();
    buildable.setLabelSelector(fluent.buildLabelSelector());
    buildable.setMatchLabelKeys(fluent.getMatchLabelKeys());
    buildable.setMaxSkew(fluent.getMaxSkew());
    buildable.setMinDomains(fluent.getMinDomains());
    buildable.setNodeAffinityPolicy(fluent.getNodeAffinityPolicy());
    buildable.setNodeTaintsPolicy(fluent.getNodeTaintsPolicy());
    buildable.setTopologyKey(fluent.getTopologyKey());
    buildable.setWhenUnsatisfiable(fluent.getWhenUnsatisfiable());
    return buildable;
  }
  
}