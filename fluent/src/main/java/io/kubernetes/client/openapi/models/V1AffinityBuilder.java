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
public class V1AffinityBuilder extends V1AffinityFluent<V1AffinityBuilder> implements VisitableBuilder<V1Affinity,V1AffinityBuilder>{

  V1AffinityFluent<?> fluent;

  public V1AffinityBuilder() {
    this(new V1Affinity());
  }
  
  public V1AffinityBuilder(V1AffinityFluent<?> fluent) {
    this(fluent, new V1Affinity());
  }
  
  public V1AffinityBuilder(V1Affinity instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1AffinityBuilder(V1AffinityFluent<?> fluent,V1Affinity instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1Affinity build() {
    V1Affinity buildable = new V1Affinity();
    buildable.setNodeAffinity(fluent.buildNodeAffinity());
    buildable.setPodAffinity(fluent.buildPodAffinity());
    buildable.setPodAntiAffinity(fluent.buildPodAntiAffinity());
    return buildable;
  }
  
}