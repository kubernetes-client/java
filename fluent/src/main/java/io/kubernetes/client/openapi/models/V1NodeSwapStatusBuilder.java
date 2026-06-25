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
public class V1NodeSwapStatusBuilder extends V1NodeSwapStatusFluent<V1NodeSwapStatusBuilder> implements VisitableBuilder<V1NodeSwapStatus,V1NodeSwapStatusBuilder>{

  V1NodeSwapStatusFluent<?> fluent;

  public V1NodeSwapStatusBuilder() {
    this(new V1NodeSwapStatus());
  }
  
  public V1NodeSwapStatusBuilder(V1NodeSwapStatusFluent<?> fluent) {
    this(fluent, new V1NodeSwapStatus());
  }
  
  public V1NodeSwapStatusBuilder(V1NodeSwapStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NodeSwapStatusBuilder(V1NodeSwapStatusFluent<?> fluent,V1NodeSwapStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NodeSwapStatus build() {
    V1NodeSwapStatus buildable = new V1NodeSwapStatus();
    buildable.setCapacity(fluent.getCapacity());
    return buildable;
  }
  
}