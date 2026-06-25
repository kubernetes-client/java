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
public class V1NodeSelectorTermBuilder extends V1NodeSelectorTermFluent<V1NodeSelectorTermBuilder> implements VisitableBuilder<V1NodeSelectorTerm,V1NodeSelectorTermBuilder>{

  V1NodeSelectorTermFluent<?> fluent;

  public V1NodeSelectorTermBuilder() {
    this(new V1NodeSelectorTerm());
  }
  
  public V1NodeSelectorTermBuilder(V1NodeSelectorTermFluent<?> fluent) {
    this(fluent, new V1NodeSelectorTerm());
  }
  
  public V1NodeSelectorTermBuilder(V1NodeSelectorTerm instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NodeSelectorTermBuilder(V1NodeSelectorTermFluent<?> fluent,V1NodeSelectorTerm instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NodeSelectorTerm build() {
    V1NodeSelectorTerm buildable = new V1NodeSelectorTerm();
    buildable.setMatchExpressions(fluent.buildMatchExpressions());
    buildable.setMatchFields(fluent.buildMatchFields());
    return buildable;
  }
  
}