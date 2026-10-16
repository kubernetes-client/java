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
public class V1beta1CompositePodGroupSchedulingPolicyBuilder extends V1beta1CompositePodGroupSchedulingPolicyFluent<V1beta1CompositePodGroupSchedulingPolicyBuilder> implements VisitableBuilder<V1beta1CompositePodGroupSchedulingPolicy,V1beta1CompositePodGroupSchedulingPolicyBuilder>{

  V1beta1CompositePodGroupSchedulingPolicyFluent<?> fluent;

  public V1beta1CompositePodGroupSchedulingPolicyBuilder() {
    this(new V1beta1CompositePodGroupSchedulingPolicy());
  }
  
  public V1beta1CompositePodGroupSchedulingPolicyBuilder(V1beta1CompositePodGroupSchedulingPolicyFluent<?> fluent) {
    this(fluent, new V1beta1CompositePodGroupSchedulingPolicy());
  }
  
  public V1beta1CompositePodGroupSchedulingPolicyBuilder(V1beta1CompositePodGroupSchedulingPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1CompositePodGroupSchedulingPolicyBuilder(V1beta1CompositePodGroupSchedulingPolicyFluent<?> fluent,V1beta1CompositePodGroupSchedulingPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1CompositePodGroupSchedulingPolicy build() {
    V1beta1CompositePodGroupSchedulingPolicy buildable = new V1beta1CompositePodGroupSchedulingPolicy();
    buildable.setBasic(fluent.getBasic());
    buildable.setGang(fluent.buildGang());
    return buildable;
  }
  
}