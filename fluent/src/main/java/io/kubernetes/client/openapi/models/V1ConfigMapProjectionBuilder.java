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
public class V1ConfigMapProjectionBuilder extends V1ConfigMapProjectionFluent<V1ConfigMapProjectionBuilder> implements VisitableBuilder<V1ConfigMapProjection,V1ConfigMapProjectionBuilder>{

  V1ConfigMapProjectionFluent<?> fluent;

  public V1ConfigMapProjectionBuilder() {
    this(new V1ConfigMapProjection());
  }
  
  public V1ConfigMapProjectionBuilder(V1ConfigMapProjectionFluent<?> fluent) {
    this(fluent, new V1ConfigMapProjection());
  }
  
  public V1ConfigMapProjectionBuilder(V1ConfigMapProjection instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ConfigMapProjectionBuilder(V1ConfigMapProjectionFluent<?> fluent,V1ConfigMapProjection instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ConfigMapProjection build() {
    V1ConfigMapProjection buildable = new V1ConfigMapProjection();
    buildable.setItems(fluent.buildItems());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  
}