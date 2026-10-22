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
public class V1alpha3WorkloadPodGroupDisruptionModeBuilder extends V1alpha3WorkloadPodGroupDisruptionModeFluent<V1alpha3WorkloadPodGroupDisruptionModeBuilder> implements VisitableBuilder<V1alpha3WorkloadPodGroupDisruptionMode,V1alpha3WorkloadPodGroupDisruptionModeBuilder>{

  V1alpha3WorkloadPodGroupDisruptionModeFluent<?> fluent;

  public V1alpha3WorkloadPodGroupDisruptionModeBuilder() {
    this(new V1alpha3WorkloadPodGroupDisruptionMode());
  }
  
  public V1alpha3WorkloadPodGroupDisruptionModeBuilder(V1alpha3WorkloadPodGroupDisruptionModeFluent<?> fluent) {
    this(fluent, new V1alpha3WorkloadPodGroupDisruptionMode());
  }
  
  public V1alpha3WorkloadPodGroupDisruptionModeBuilder(V1alpha3WorkloadPodGroupDisruptionMode instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha3WorkloadPodGroupDisruptionModeBuilder(V1alpha3WorkloadPodGroupDisruptionModeFluent<?> fluent,V1alpha3WorkloadPodGroupDisruptionMode instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha3WorkloadPodGroupDisruptionMode build() {
    V1alpha3WorkloadPodGroupDisruptionMode buildable = new V1alpha3WorkloadPodGroupDisruptionMode();
    buildable.setAll(fluent.getAll());
    buildable.setSingle(fluent.getSingle());
    return buildable;
  }
  
}