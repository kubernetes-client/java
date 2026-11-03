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
import javax.annotation.processing.Generated;
@Generated("io.sundr:builder-annotations")
public class V1beta1PodGroupStatusBuilder extends V1beta1PodGroupStatusFluent<V1beta1PodGroupStatusBuilder> implements VisitableBuilder<V1beta1PodGroupStatus,V1beta1PodGroupStatusBuilder>{

  V1beta1PodGroupStatusFluent<?> fluent;

  public V1beta1PodGroupStatusBuilder() {
    this(new V1beta1PodGroupStatus());
  }
  
  public V1beta1PodGroupStatusBuilder(V1beta1PodGroupStatusFluent<?> fluent) {
    this(fluent, new V1beta1PodGroupStatus());
  }
  
  public V1beta1PodGroupStatusBuilder(V1beta1PodGroupStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1PodGroupStatusBuilder(V1beta1PodGroupStatusFluent<?> fluent,V1beta1PodGroupStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1PodGroupStatus build() {
    V1beta1PodGroupStatus buildable = new V1beta1PodGroupStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setResourceClaimStatuses(fluent.buildResourceClaimStatuses());
    return buildable;
  }
  
}