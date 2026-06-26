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
public class V1alpha1WorkloadSpecBuilder extends V1alpha1WorkloadSpecFluent<V1alpha1WorkloadSpecBuilder> implements VisitableBuilder<V1alpha1WorkloadSpec,V1alpha1WorkloadSpecBuilder>{

  V1alpha1WorkloadSpecFluent<?> fluent;

  public V1alpha1WorkloadSpecBuilder() {
    this(new V1alpha1WorkloadSpec());
  }
  
  public V1alpha1WorkloadSpecBuilder(V1alpha1WorkloadSpecFluent<?> fluent) {
    this(fluent, new V1alpha1WorkloadSpec());
  }
  
  public V1alpha1WorkloadSpecBuilder(V1alpha1WorkloadSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1WorkloadSpecBuilder(V1alpha1WorkloadSpecFluent<?> fluent,V1alpha1WorkloadSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1WorkloadSpec build() {
    V1alpha1WorkloadSpec buildable = new V1alpha1WorkloadSpec();
    buildable.setControllerRef(fluent.buildControllerRef());
    buildable.setPodGroups(fluent.buildPodGroups());
    return buildable;
  }
  
}