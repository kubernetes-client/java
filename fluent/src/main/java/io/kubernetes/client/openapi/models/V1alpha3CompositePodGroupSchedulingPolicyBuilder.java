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
public class V1alpha3CompositePodGroupSchedulingPolicyBuilder extends V1alpha3CompositePodGroupSchedulingPolicyFluent<V1alpha3CompositePodGroupSchedulingPolicyBuilder> implements VisitableBuilder<V1alpha3CompositePodGroupSchedulingPolicy,V1alpha3CompositePodGroupSchedulingPolicyBuilder>{

  V1alpha3CompositePodGroupSchedulingPolicyFluent<?> fluent;

  public V1alpha3CompositePodGroupSchedulingPolicyBuilder() {
    this(new V1alpha3CompositePodGroupSchedulingPolicy());
  }
  
  public V1alpha3CompositePodGroupSchedulingPolicyBuilder(V1alpha3CompositePodGroupSchedulingPolicyFluent<?> fluent) {
    this(fluent, new V1alpha3CompositePodGroupSchedulingPolicy());
  }
  
  public V1alpha3CompositePodGroupSchedulingPolicyBuilder(V1alpha3CompositePodGroupSchedulingPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha3CompositePodGroupSchedulingPolicyBuilder(V1alpha3CompositePodGroupSchedulingPolicyFluent<?> fluent,V1alpha3CompositePodGroupSchedulingPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha3CompositePodGroupSchedulingPolicy build() {
    V1alpha3CompositePodGroupSchedulingPolicy buildable = new V1alpha3CompositePodGroupSchedulingPolicy();
    buildable.setBasic(fluent.getBasic());
    buildable.setGang(fluent.buildGang());
    return buildable;
  }
  
}