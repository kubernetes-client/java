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
public class V1alpha2PodGroupSchedulingPolicyBuilder extends V1alpha2PodGroupSchedulingPolicyFluent<V1alpha2PodGroupSchedulingPolicyBuilder> implements VisitableBuilder<V1alpha2PodGroupSchedulingPolicy,V1alpha2PodGroupSchedulingPolicyBuilder>{

  V1alpha2PodGroupSchedulingPolicyFluent<?> fluent;

  public V1alpha2PodGroupSchedulingPolicyBuilder() {
    this(new V1alpha2PodGroupSchedulingPolicy());
  }
  
  public V1alpha2PodGroupSchedulingPolicyBuilder(V1alpha2PodGroupSchedulingPolicyFluent<?> fluent) {
    this(fluent, new V1alpha2PodGroupSchedulingPolicy());
  }
  
  public V1alpha2PodGroupSchedulingPolicyBuilder(V1alpha2PodGroupSchedulingPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha2PodGroupSchedulingPolicyBuilder(V1alpha2PodGroupSchedulingPolicyFluent<?> fluent,V1alpha2PodGroupSchedulingPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha2PodGroupSchedulingPolicy build() {
    V1alpha2PodGroupSchedulingPolicy buildable = new V1alpha2PodGroupSchedulingPolicy();
    buildable.setBasic(fluent.getBasic());
    buildable.setGang(fluent.buildGang());
    return buildable;
  }
  
}