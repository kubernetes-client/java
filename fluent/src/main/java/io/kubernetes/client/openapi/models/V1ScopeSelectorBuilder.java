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
public class V1ScopeSelectorBuilder extends V1ScopeSelectorFluent<V1ScopeSelectorBuilder> implements VisitableBuilder<V1ScopeSelector,V1ScopeSelectorBuilder>{

  V1ScopeSelectorFluent<?> fluent;

  public V1ScopeSelectorBuilder() {
    this(new V1ScopeSelector());
  }
  
  public V1ScopeSelectorBuilder(V1ScopeSelectorFluent<?> fluent) {
    this(fluent, new V1ScopeSelector());
  }
  
  public V1ScopeSelectorBuilder(V1ScopeSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ScopeSelectorBuilder(V1ScopeSelectorFluent<?> fluent,V1ScopeSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ScopeSelector build() {
    V1ScopeSelector buildable = new V1ScopeSelector();
    buildable.setMatchExpressions(fluent.buildMatchExpressions());
    return buildable;
  }
  
}