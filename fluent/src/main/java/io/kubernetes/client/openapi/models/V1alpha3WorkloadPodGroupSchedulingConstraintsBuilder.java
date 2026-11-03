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
public class V1alpha3WorkloadPodGroupSchedulingConstraintsBuilder extends V1alpha3WorkloadPodGroupSchedulingConstraintsFluent<V1alpha3WorkloadPodGroupSchedulingConstraintsBuilder> implements VisitableBuilder<V1alpha3WorkloadPodGroupSchedulingConstraints,V1alpha3WorkloadPodGroupSchedulingConstraintsBuilder>{

  V1alpha3WorkloadPodGroupSchedulingConstraintsFluent<?> fluent;

  public V1alpha3WorkloadPodGroupSchedulingConstraintsBuilder() {
    this(new V1alpha3WorkloadPodGroupSchedulingConstraints());
  }
  
  public V1alpha3WorkloadPodGroupSchedulingConstraintsBuilder(V1alpha3WorkloadPodGroupSchedulingConstraintsFluent<?> fluent) {
    this(fluent, new V1alpha3WorkloadPodGroupSchedulingConstraints());
  }
  
  public V1alpha3WorkloadPodGroupSchedulingConstraintsBuilder(V1alpha3WorkloadPodGroupSchedulingConstraints instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha3WorkloadPodGroupSchedulingConstraintsBuilder(V1alpha3WorkloadPodGroupSchedulingConstraintsFluent<?> fluent,V1alpha3WorkloadPodGroupSchedulingConstraints instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha3WorkloadPodGroupSchedulingConstraints build() {
    V1alpha3WorkloadPodGroupSchedulingConstraints buildable = new V1alpha3WorkloadPodGroupSchedulingConstraints();
    buildable.setTopology(fluent.buildTopology());
    return buildable;
  }
  
}