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
public class V1ClusterRoleBuilder extends V1ClusterRoleFluent<V1ClusterRoleBuilder> implements VisitableBuilder<V1ClusterRole,V1ClusterRoleBuilder>{

  V1ClusterRoleFluent<?> fluent;

  public V1ClusterRoleBuilder() {
    this(new V1ClusterRole());
  }
  
  public V1ClusterRoleBuilder(V1ClusterRoleFluent<?> fluent) {
    this(fluent, new V1ClusterRole());
  }
  
  public V1ClusterRoleBuilder(V1ClusterRole instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ClusterRoleBuilder(V1ClusterRoleFluent<?> fluent,V1ClusterRole instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ClusterRole build() {
    V1ClusterRole buildable = new V1ClusterRole();
    buildable.setAggregationRule(fluent.buildAggregationRule());
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setRules(fluent.buildRules());
    return buildable;
  }
  
}