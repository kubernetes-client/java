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
public class V1alpha2PodGroupSpecBuilder extends V1alpha2PodGroupSpecFluent<V1alpha2PodGroupSpecBuilder> implements VisitableBuilder<V1alpha2PodGroupSpec,V1alpha2PodGroupSpecBuilder>{

  V1alpha2PodGroupSpecFluent<?> fluent;

  public V1alpha2PodGroupSpecBuilder() {
    this(new V1alpha2PodGroupSpec());
  }
  
  public V1alpha2PodGroupSpecBuilder(V1alpha2PodGroupSpecFluent<?> fluent) {
    this(fluent, new V1alpha2PodGroupSpec());
  }
  
  public V1alpha2PodGroupSpecBuilder(V1alpha2PodGroupSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha2PodGroupSpecBuilder(V1alpha2PodGroupSpecFluent<?> fluent,V1alpha2PodGroupSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha2PodGroupSpec build() {
    V1alpha2PodGroupSpec buildable = new V1alpha2PodGroupSpec();
    buildable.setDisruptionMode(fluent.getDisruptionMode());
    buildable.setPodGroupTemplateRef(fluent.buildPodGroupTemplateRef());
    buildable.setPriority(fluent.getPriority());
    buildable.setPriorityClassName(fluent.getPriorityClassName());
    buildable.setResourceClaims(fluent.buildResourceClaims());
    buildable.setSchedulingConstraints(fluent.buildSchedulingConstraints());
    buildable.setSchedulingPolicy(fluent.buildSchedulingPolicy());
    return buildable;
  }
  
}