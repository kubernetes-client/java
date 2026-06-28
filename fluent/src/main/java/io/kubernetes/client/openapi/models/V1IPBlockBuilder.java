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
public class V1IPBlockBuilder extends V1IPBlockFluent<V1IPBlockBuilder> implements VisitableBuilder<V1IPBlock,V1IPBlockBuilder>{

  V1IPBlockFluent<?> fluent;

  public V1IPBlockBuilder() {
    this(new V1IPBlock());
  }
  
  public V1IPBlockBuilder(V1IPBlockFluent<?> fluent) {
    this(fluent, new V1IPBlock());
  }
  
  public V1IPBlockBuilder(V1IPBlock instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1IPBlockBuilder(V1IPBlockFluent<?> fluent,V1IPBlock instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1IPBlock build() {
    V1IPBlock buildable = new V1IPBlock();
    buildable.setCidr(fluent.getCidr());
    buildable.setExcept(fluent.getExcept());
    return buildable;
  }
  
}