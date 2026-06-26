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
public class V2APIGroupDiscoveryBuilder extends V2APIGroupDiscoveryFluent<V2APIGroupDiscoveryBuilder> implements VisitableBuilder<V2APIGroupDiscovery,V2APIGroupDiscoveryBuilder>{

  V2APIGroupDiscoveryFluent<?> fluent;

  public V2APIGroupDiscoveryBuilder() {
    this(new V2APIGroupDiscovery());
  }
  
  public V2APIGroupDiscoveryBuilder(V2APIGroupDiscoveryFluent<?> fluent) {
    this(fluent, new V2APIGroupDiscovery());
  }
  
  public V2APIGroupDiscoveryBuilder(V2APIGroupDiscovery instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V2APIGroupDiscoveryBuilder(V2APIGroupDiscoveryFluent<?> fluent,V2APIGroupDiscovery instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V2APIGroupDiscovery build() {
    V2APIGroupDiscovery buildable = new V2APIGroupDiscovery();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setVersions(fluent.buildVersions());
    return buildable;
  }
  
}