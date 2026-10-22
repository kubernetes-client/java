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
public class V1alpha3PodGroupStatusBuilder extends V1alpha3PodGroupStatusFluent<V1alpha3PodGroupStatusBuilder> implements VisitableBuilder<V1alpha3PodGroupStatus,V1alpha3PodGroupStatusBuilder>{

  V1alpha3PodGroupStatusFluent<?> fluent;

  public V1alpha3PodGroupStatusBuilder() {
    this(new V1alpha3PodGroupStatus());
  }
  
  public V1alpha3PodGroupStatusBuilder(V1alpha3PodGroupStatusFluent<?> fluent) {
    this(fluent, new V1alpha3PodGroupStatus());
  }
  
  public V1alpha3PodGroupStatusBuilder(V1alpha3PodGroupStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha3PodGroupStatusBuilder(V1alpha3PodGroupStatusFluent<?> fluent,V1alpha3PodGroupStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha3PodGroupStatus build() {
    V1alpha3PodGroupStatus buildable = new V1alpha3PodGroupStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setResourceClaimStatuses(fluent.buildResourceClaimStatuses());
    return buildable;
  }
  
}