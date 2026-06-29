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
public class V2beta1APIGroupDiscoveryBuilder extends V2beta1APIGroupDiscoveryFluent<V2beta1APIGroupDiscoveryBuilder> implements VisitableBuilder<V2beta1APIGroupDiscovery,V2beta1APIGroupDiscoveryBuilder>{

  V2beta1APIGroupDiscoveryFluent<?> fluent;

  public V2beta1APIGroupDiscoveryBuilder() {
    this(new V2beta1APIGroupDiscovery());
  }
  
  public V2beta1APIGroupDiscoveryBuilder(V2beta1APIGroupDiscoveryFluent<?> fluent) {
    this(fluent, new V2beta1APIGroupDiscovery());
  }
  
  public V2beta1APIGroupDiscoveryBuilder(V2beta1APIGroupDiscovery instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V2beta1APIGroupDiscoveryBuilder(V2beta1APIGroupDiscoveryFluent<?> fluent,V2beta1APIGroupDiscovery instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V2beta1APIGroupDiscovery build() {
    V2beta1APIGroupDiscovery buildable = new V2beta1APIGroupDiscovery();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setVersions(fluent.buildVersions());
    return buildable;
  }
  
}