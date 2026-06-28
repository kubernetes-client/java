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
public class V2beta1APIVersionDiscoveryBuilder extends V2beta1APIVersionDiscoveryFluent<V2beta1APIVersionDiscoveryBuilder> implements VisitableBuilder<V2beta1APIVersionDiscovery,V2beta1APIVersionDiscoveryBuilder>{

  V2beta1APIVersionDiscoveryFluent<?> fluent;

  public V2beta1APIVersionDiscoveryBuilder() {
    this(new V2beta1APIVersionDiscovery());
  }
  
  public V2beta1APIVersionDiscoveryBuilder(V2beta1APIVersionDiscoveryFluent<?> fluent) {
    this(fluent, new V2beta1APIVersionDiscovery());
  }
  
  public V2beta1APIVersionDiscoveryBuilder(V2beta1APIVersionDiscovery instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V2beta1APIVersionDiscoveryBuilder(V2beta1APIVersionDiscoveryFluent<?> fluent,V2beta1APIVersionDiscovery instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V2beta1APIVersionDiscovery build() {
    V2beta1APIVersionDiscovery buildable = new V2beta1APIVersionDiscovery();
    buildable.setVersion(fluent.getVersion());
    buildable.setResources(fluent.buildResources());
    buildable.setFreshness(fluent.getFreshness());
    return buildable;
  }
  
}