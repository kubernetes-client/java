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
public class V1NodePodPreemptionPolicyBuilder extends V1NodePodPreemptionPolicyFluent<V1NodePodPreemptionPolicyBuilder> implements VisitableBuilder<V1NodePodPreemptionPolicy,V1NodePodPreemptionPolicyBuilder>{

  V1NodePodPreemptionPolicyFluent<?> fluent;

  public V1NodePodPreemptionPolicyBuilder() {
    this(new V1NodePodPreemptionPolicy());
  }
  
  public V1NodePodPreemptionPolicyBuilder(V1NodePodPreemptionPolicyFluent<?> fluent) {
    this(fluent, new V1NodePodPreemptionPolicy());
  }
  
  public V1NodePodPreemptionPolicyBuilder(V1NodePodPreemptionPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NodePodPreemptionPolicyBuilder(V1NodePodPreemptionPolicyFluent<?> fluent,V1NodePodPreemptionPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NodePodPreemptionPolicy build() {
    V1NodePodPreemptionPolicy buildable = new V1NodePodPreemptionPolicy();
    buildable.setDisableResizePreemption(fluent.getDisableResizePreemption());
    return buildable;
  }
  
}