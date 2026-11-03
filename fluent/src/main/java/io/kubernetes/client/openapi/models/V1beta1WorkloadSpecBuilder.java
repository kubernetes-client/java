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
public class V1beta1WorkloadSpecBuilder extends V1beta1WorkloadSpecFluent<V1beta1WorkloadSpecBuilder> implements VisitableBuilder<V1beta1WorkloadSpec,V1beta1WorkloadSpecBuilder>{

  V1beta1WorkloadSpecFluent<?> fluent;

  public V1beta1WorkloadSpecBuilder() {
    this(new V1beta1WorkloadSpec());
  }
  
  public V1beta1WorkloadSpecBuilder(V1beta1WorkloadSpecFluent<?> fluent) {
    this(fluent, new V1beta1WorkloadSpec());
  }
  
  public V1beta1WorkloadSpecBuilder(V1beta1WorkloadSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1WorkloadSpecBuilder(V1beta1WorkloadSpecFluent<?> fluent,V1beta1WorkloadSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1WorkloadSpec build() {
    V1beta1WorkloadSpec buildable = new V1beta1WorkloadSpec();
    buildable.setCompositePodGroupTemplates(fluent.buildCompositePodGroupTemplates());
    buildable.setControllerRef(fluent.buildControllerRef());
    buildable.setPodGroupTemplates(fluent.buildPodGroupTemplates());
    return buildable;
  }
  
}