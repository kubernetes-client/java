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
public class V2beta1APIResourceDiscoveryBuilder extends V2beta1APIResourceDiscoveryFluent<V2beta1APIResourceDiscoveryBuilder> implements VisitableBuilder<V2beta1APIResourceDiscovery,V2beta1APIResourceDiscoveryBuilder>{

  V2beta1APIResourceDiscoveryFluent<?> fluent;

  public V2beta1APIResourceDiscoveryBuilder() {
    this(new V2beta1APIResourceDiscovery());
  }
  
  public V2beta1APIResourceDiscoveryBuilder(V2beta1APIResourceDiscoveryFluent<?> fluent) {
    this(fluent, new V2beta1APIResourceDiscovery());
  }
  
  public V2beta1APIResourceDiscoveryBuilder(V2beta1APIResourceDiscovery instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V2beta1APIResourceDiscoveryBuilder(V2beta1APIResourceDiscoveryFluent<?> fluent,V2beta1APIResourceDiscovery instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V2beta1APIResourceDiscovery build() {
    V2beta1APIResourceDiscovery buildable = new V2beta1APIResourceDiscovery();
    buildable.setResource(fluent.getResource());
    buildable.setResponseKind(fluent.buildResponseKind());
    buildable.setScope(fluent.getScope());
    buildable.setSingularResource(fluent.getSingularResource());
    buildable.setVerbs(fluent.getVerbs());
    buildable.setShortNames(fluent.getShortNames());
    buildable.setCategories(fluent.getCategories());
    buildable.setSubresources(fluent.buildSubresources());
    return buildable;
  }
  
}