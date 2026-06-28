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
public class V1ConfigMapBuilder extends V1ConfigMapFluent<V1ConfigMapBuilder> implements VisitableBuilder<V1ConfigMap,V1ConfigMapBuilder>{

  V1ConfigMapFluent<?> fluent;

  public V1ConfigMapBuilder() {
    this(new V1ConfigMap());
  }
  
  public V1ConfigMapBuilder(V1ConfigMapFluent<?> fluent) {
    this(fluent, new V1ConfigMap());
  }
  
  public V1ConfigMapBuilder(V1ConfigMap instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ConfigMapBuilder(V1ConfigMapFluent<?> fluent,V1ConfigMap instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ConfigMap build() {
    V1ConfigMap buildable = new V1ConfigMap();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setBinaryData(fluent.getBinaryData());
    buildable.setData(fluent.getData());
    buildable.setImmutable(fluent.getImmutable());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}