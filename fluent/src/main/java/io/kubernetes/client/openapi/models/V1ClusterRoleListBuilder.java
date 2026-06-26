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
public class V1ClusterRoleListBuilder extends V1ClusterRoleListFluent<V1ClusterRoleListBuilder> implements VisitableBuilder<V1ClusterRoleList,V1ClusterRoleListBuilder>{

  V1ClusterRoleListFluent<?> fluent;

  public V1ClusterRoleListBuilder() {
    this(new V1ClusterRoleList());
  }
  
  public V1ClusterRoleListBuilder(V1ClusterRoleListFluent<?> fluent) {
    this(fluent, new V1ClusterRoleList());
  }
  
  public V1ClusterRoleListBuilder(V1ClusterRoleList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ClusterRoleListBuilder(V1ClusterRoleListFluent<?> fluent,V1ClusterRoleList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ClusterRoleList build() {
    V1ClusterRoleList buildable = new V1ClusterRoleList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}