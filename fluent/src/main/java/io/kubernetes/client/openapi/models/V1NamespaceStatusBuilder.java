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
public class V1NamespaceStatusBuilder extends V1NamespaceStatusFluent<V1NamespaceStatusBuilder> implements VisitableBuilder<V1NamespaceStatus,V1NamespaceStatusBuilder>{

  V1NamespaceStatusFluent<?> fluent;

  public V1NamespaceStatusBuilder() {
    this(new V1NamespaceStatus());
  }
  
  public V1NamespaceStatusBuilder(V1NamespaceStatusFluent<?> fluent) {
    this(fluent, new V1NamespaceStatus());
  }
  
  public V1NamespaceStatusBuilder(V1NamespaceStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NamespaceStatusBuilder(V1NamespaceStatusFluent<?> fluent,V1NamespaceStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NamespaceStatus build() {
    V1NamespaceStatus buildable = new V1NamespaceStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setPhase(fluent.getPhase());
    return buildable;
  }
  
}