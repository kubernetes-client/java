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
public class V1PodAffinityTermBuilder extends V1PodAffinityTermFluent<V1PodAffinityTermBuilder> implements VisitableBuilder<V1PodAffinityTerm,V1PodAffinityTermBuilder>{

  V1PodAffinityTermFluent<?> fluent;

  public V1PodAffinityTermBuilder() {
    this(new V1PodAffinityTerm());
  }
  
  public V1PodAffinityTermBuilder(V1PodAffinityTermFluent<?> fluent) {
    this(fluent, new V1PodAffinityTerm());
  }
  
  public V1PodAffinityTermBuilder(V1PodAffinityTerm instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PodAffinityTermBuilder(V1PodAffinityTermFluent<?> fluent,V1PodAffinityTerm instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PodAffinityTerm build() {
    V1PodAffinityTerm buildable = new V1PodAffinityTerm();
    buildable.setLabelSelector(fluent.buildLabelSelector());
    buildable.setMatchLabelKeys(fluent.getMatchLabelKeys());
    buildable.setMismatchLabelKeys(fluent.getMismatchLabelKeys());
    buildable.setNamespaceSelector(fluent.buildNamespaceSelector());
    buildable.setNamespaces(fluent.getNamespaces());
    buildable.setTopologyKey(fluent.getTopologyKey());
    return buildable;
  }
  
}