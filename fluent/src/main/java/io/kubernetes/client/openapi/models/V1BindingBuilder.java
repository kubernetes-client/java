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
public class V1BindingBuilder extends V1BindingFluent<V1BindingBuilder> implements VisitableBuilder<V1Binding,V1BindingBuilder>{

  V1BindingFluent<?> fluent;

  public V1BindingBuilder() {
    this(new V1Binding());
  }
  
  public V1BindingBuilder(V1BindingFluent<?> fluent) {
    this(fluent, new V1Binding());
  }
  
  public V1BindingBuilder(V1Binding instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1BindingBuilder(V1BindingFluent<?> fluent,V1Binding instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1Binding build() {
    V1Binding buildable = new V1Binding();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setTarget(fluent.buildTarget());
    return buildable;
  }
  
}