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
public class V1ConfigMapKeySelectorBuilder extends V1ConfigMapKeySelectorFluent<V1ConfigMapKeySelectorBuilder> implements VisitableBuilder<V1ConfigMapKeySelector,V1ConfigMapKeySelectorBuilder>{

  V1ConfigMapKeySelectorFluent<?> fluent;

  public V1ConfigMapKeySelectorBuilder() {
    this(new V1ConfigMapKeySelector());
  }
  
  public V1ConfigMapKeySelectorBuilder(V1ConfigMapKeySelectorFluent<?> fluent) {
    this(fluent, new V1ConfigMapKeySelector());
  }
  
  public V1ConfigMapKeySelectorBuilder(V1ConfigMapKeySelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ConfigMapKeySelectorBuilder(V1ConfigMapKeySelectorFluent<?> fluent,V1ConfigMapKeySelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ConfigMapKeySelector build() {
    V1ConfigMapKeySelector buildable = new V1ConfigMapKeySelector();
    buildable.setKey(fluent.getKey());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  
}