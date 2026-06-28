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
public class V2APISubresourceDiscoveryBuilder extends V2APISubresourceDiscoveryFluent<V2APISubresourceDiscoveryBuilder> implements VisitableBuilder<V2APISubresourceDiscovery,V2APISubresourceDiscoveryBuilder>{

  V2APISubresourceDiscoveryFluent<?> fluent;

  public V2APISubresourceDiscoveryBuilder() {
    this(new V2APISubresourceDiscovery());
  }
  
  public V2APISubresourceDiscoveryBuilder(V2APISubresourceDiscoveryFluent<?> fluent) {
    this(fluent, new V2APISubresourceDiscovery());
  }
  
  public V2APISubresourceDiscoveryBuilder(V2APISubresourceDiscovery instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V2APISubresourceDiscoveryBuilder(V2APISubresourceDiscoveryFluent<?> fluent,V2APISubresourceDiscovery instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V2APISubresourceDiscovery build() {
    V2APISubresourceDiscovery buildable = new V2APISubresourceDiscovery();
    buildable.setSubresource(fluent.getSubresource());
    buildable.setResponseKind(fluent.buildResponseKind());
    buildable.setAcceptedTypes(fluent.buildAcceptedTypes());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  
}