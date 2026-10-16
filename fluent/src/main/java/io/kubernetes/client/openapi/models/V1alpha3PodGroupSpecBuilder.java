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
public class V1alpha3PodGroupSpecBuilder extends V1alpha3PodGroupSpecFluent<V1alpha3PodGroupSpecBuilder> implements VisitableBuilder<V1alpha3PodGroupSpec,V1alpha3PodGroupSpecBuilder>{

  V1alpha3PodGroupSpecFluent<?> fluent;

  public V1alpha3PodGroupSpecBuilder() {
    this(new V1alpha3PodGroupSpec());
  }
  
  public V1alpha3PodGroupSpecBuilder(V1alpha3PodGroupSpecFluent<?> fluent) {
    this(fluent, new V1alpha3PodGroupSpec());
  }
  
  public V1alpha3PodGroupSpecBuilder(V1alpha3PodGroupSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha3PodGroupSpecBuilder(V1alpha3PodGroupSpecFluent<?> fluent,V1alpha3PodGroupSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha3PodGroupSpec build() {
    V1alpha3PodGroupSpec buildable = new V1alpha3PodGroupSpec();
    buildable.setDisruptionMode(fluent.buildDisruptionMode());
    buildable.setParentCompositePodGroupName(fluent.getParentCompositePodGroupName());
    buildable.setPreemptionPolicy(fluent.getPreemptionPolicy());
    buildable.setPriority(fluent.getPriority());
    buildable.setPriorityClassName(fluent.getPriorityClassName());
    buildable.setResourceClaims(fluent.buildResourceClaims());
    buildable.setSchedulingConstraints(fluent.buildSchedulingConstraints());
    buildable.setSchedulingPolicy(fluent.buildSchedulingPolicy());
    buildable.setWorkloadRef(fluent.buildWorkloadRef());
    return buildable;
  }
  
}