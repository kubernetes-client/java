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
public class V1PriorityClassBuilder extends V1PriorityClassFluent<V1PriorityClassBuilder> implements VisitableBuilder<V1PriorityClass,V1PriorityClassBuilder>{

  V1PriorityClassFluent<?> fluent;

  public V1PriorityClassBuilder() {
    this(new V1PriorityClass());
  }
  
  public V1PriorityClassBuilder(V1PriorityClassFluent<?> fluent) {
    this(fluent, new V1PriorityClass());
  }
  
  public V1PriorityClassBuilder(V1PriorityClass instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PriorityClassBuilder(V1PriorityClassFluent<?> fluent,V1PriorityClass instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PriorityClass build() {
    V1PriorityClass buildable = new V1PriorityClass();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDescription(fluent.getDescription());
    buildable.setGlobalDefault(fluent.getGlobalDefault());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setPreemptionPolicy(fluent.getPreemptionPolicy());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}