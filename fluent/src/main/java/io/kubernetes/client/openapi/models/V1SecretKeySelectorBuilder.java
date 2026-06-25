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
public class V1SecretKeySelectorBuilder extends V1SecretKeySelectorFluent<V1SecretKeySelectorBuilder> implements VisitableBuilder<V1SecretKeySelector,V1SecretKeySelectorBuilder>{

  V1SecretKeySelectorFluent<?> fluent;

  public V1SecretKeySelectorBuilder() {
    this(new V1SecretKeySelector());
  }
  
  public V1SecretKeySelectorBuilder(V1SecretKeySelectorFluent<?> fluent) {
    this(fluent, new V1SecretKeySelector());
  }
  
  public V1SecretKeySelectorBuilder(V1SecretKeySelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1SecretKeySelectorBuilder(V1SecretKeySelectorFluent<?> fluent,V1SecretKeySelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1SecretKeySelector build() {
    V1SecretKeySelector buildable = new V1SecretKeySelector();
    buildable.setKey(fluent.getKey());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  
}