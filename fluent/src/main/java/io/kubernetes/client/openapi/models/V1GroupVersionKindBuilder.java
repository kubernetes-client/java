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
public class V1GroupVersionKindBuilder extends V1GroupVersionKindFluent<V1GroupVersionKindBuilder> implements VisitableBuilder<V1GroupVersionKind,V1GroupVersionKindBuilder>{

  V1GroupVersionKindFluent<?> fluent;

  public V1GroupVersionKindBuilder() {
    this(new V1GroupVersionKind());
  }
  
  public V1GroupVersionKindBuilder(V1GroupVersionKindFluent<?> fluent) {
    this(fluent, new V1GroupVersionKind());
  }
  
  public V1GroupVersionKindBuilder(V1GroupVersionKind instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1GroupVersionKindBuilder(V1GroupVersionKindFluent<?> fluent,V1GroupVersionKind instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1GroupVersionKind build() {
    V1GroupVersionKind buildable = new V1GroupVersionKind();
    buildable.setGroup(fluent.getGroup());
    buildable.setKind(fluent.getKind());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }
  
}