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
public class V1DeploymentListBuilder extends V1DeploymentListFluent<V1DeploymentListBuilder> implements VisitableBuilder<V1DeploymentList,V1DeploymentListBuilder>{

  V1DeploymentListFluent<?> fluent;

  public V1DeploymentListBuilder() {
    this(new V1DeploymentList());
  }
  
  public V1DeploymentListBuilder(V1DeploymentListFluent<?> fluent) {
    this(fluent, new V1DeploymentList());
  }
  
  public V1DeploymentListBuilder(V1DeploymentList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DeploymentListBuilder(V1DeploymentListFluent<?> fluent,V1DeploymentList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DeploymentList build() {
    V1DeploymentList buildable = new V1DeploymentList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}