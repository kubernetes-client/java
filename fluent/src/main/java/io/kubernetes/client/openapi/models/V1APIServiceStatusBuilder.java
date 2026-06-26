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
public class V1APIServiceStatusBuilder extends V1APIServiceStatusFluent<V1APIServiceStatusBuilder> implements VisitableBuilder<V1APIServiceStatus,V1APIServiceStatusBuilder>{

  V1APIServiceStatusFluent<?> fluent;

  public V1APIServiceStatusBuilder() {
    this(new V1APIServiceStatus());
  }
  
  public V1APIServiceStatusBuilder(V1APIServiceStatusFluent<?> fluent) {
    this(fluent, new V1APIServiceStatus());
  }
  
  public V1APIServiceStatusBuilder(V1APIServiceStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1APIServiceStatusBuilder(V1APIServiceStatusFluent<?> fluent,V1APIServiceStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1APIServiceStatus build() {
    V1APIServiceStatus buildable = new V1APIServiceStatus();
    buildable.setConditions(fluent.buildConditions());
    return buildable;
  }
  
}