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
public class V1alpha3CompositeGangSchedulingPolicyBuilder extends V1alpha3CompositeGangSchedulingPolicyFluent<V1alpha3CompositeGangSchedulingPolicyBuilder> implements VisitableBuilder<V1alpha3CompositeGangSchedulingPolicy,V1alpha3CompositeGangSchedulingPolicyBuilder>{

  V1alpha3CompositeGangSchedulingPolicyFluent<?> fluent;

  public V1alpha3CompositeGangSchedulingPolicyBuilder() {
    this(new V1alpha3CompositeGangSchedulingPolicy());
  }
  
  public V1alpha3CompositeGangSchedulingPolicyBuilder(V1alpha3CompositeGangSchedulingPolicyFluent<?> fluent) {
    this(fluent, new V1alpha3CompositeGangSchedulingPolicy());
  }
  
  public V1alpha3CompositeGangSchedulingPolicyBuilder(V1alpha3CompositeGangSchedulingPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha3CompositeGangSchedulingPolicyBuilder(V1alpha3CompositeGangSchedulingPolicyFluent<?> fluent,V1alpha3CompositeGangSchedulingPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha3CompositeGangSchedulingPolicy build() {
    V1alpha3CompositeGangSchedulingPolicy buildable = new V1alpha3CompositeGangSchedulingPolicy();
    buildable.setMinGroupCount(fluent.getMinGroupCount());
    return buildable;
  }
  
}