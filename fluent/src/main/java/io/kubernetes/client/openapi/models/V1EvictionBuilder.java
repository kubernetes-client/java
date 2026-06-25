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
public class V1EvictionBuilder extends V1EvictionFluent<V1EvictionBuilder> implements VisitableBuilder<V1Eviction,V1EvictionBuilder>{

  V1EvictionFluent<?> fluent;

  public V1EvictionBuilder() {
    this(new V1Eviction());
  }
  
  public V1EvictionBuilder(V1EvictionFluent<?> fluent) {
    this(fluent, new V1Eviction());
  }
  
  public V1EvictionBuilder(V1Eviction instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1EvictionBuilder(V1EvictionFluent<?> fluent,V1Eviction instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1Eviction build() {
    V1Eviction buildable = new V1Eviction();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDeleteOptions(fluent.buildDeleteOptions());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}