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
public class V1PreferredSchedulingTermBuilder extends V1PreferredSchedulingTermFluent<V1PreferredSchedulingTermBuilder> implements VisitableBuilder<V1PreferredSchedulingTerm,V1PreferredSchedulingTermBuilder>{

  V1PreferredSchedulingTermFluent<?> fluent;

  public V1PreferredSchedulingTermBuilder() {
    this(new V1PreferredSchedulingTerm());
  }
  
  public V1PreferredSchedulingTermBuilder(V1PreferredSchedulingTermFluent<?> fluent) {
    this(fluent, new V1PreferredSchedulingTerm());
  }
  
  public V1PreferredSchedulingTermBuilder(V1PreferredSchedulingTerm instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PreferredSchedulingTermBuilder(V1PreferredSchedulingTermFluent<?> fluent,V1PreferredSchedulingTerm instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PreferredSchedulingTerm build() {
    V1PreferredSchedulingTerm buildable = new V1PreferredSchedulingTerm();
    buildable.setPreference(fluent.buildPreference());
    buildable.setWeight(fluent.getWeight());
    return buildable;
  }
  
}