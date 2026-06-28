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
public class V1alpha2PodGroupStatusBuilder extends V1alpha2PodGroupStatusFluent<V1alpha2PodGroupStatusBuilder> implements VisitableBuilder<V1alpha2PodGroupStatus,V1alpha2PodGroupStatusBuilder>{

  V1alpha2PodGroupStatusFluent<?> fluent;

  public V1alpha2PodGroupStatusBuilder() {
    this(new V1alpha2PodGroupStatus());
  }
  
  public V1alpha2PodGroupStatusBuilder(V1alpha2PodGroupStatusFluent<?> fluent) {
    this(fluent, new V1alpha2PodGroupStatus());
  }
  
  public V1alpha2PodGroupStatusBuilder(V1alpha2PodGroupStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha2PodGroupStatusBuilder(V1alpha2PodGroupStatusFluent<?> fluent,V1alpha2PodGroupStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha2PodGroupStatus build() {
    V1alpha2PodGroupStatus buildable = new V1alpha2PodGroupStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setResourceClaimStatuses(fluent.buildResourceClaimStatuses());
    return buildable;
  }
  
}