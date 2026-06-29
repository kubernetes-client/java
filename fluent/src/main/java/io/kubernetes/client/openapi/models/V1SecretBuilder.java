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
public class V1SecretBuilder extends V1SecretFluent<V1SecretBuilder> implements VisitableBuilder<V1Secret,V1SecretBuilder>{

  V1SecretFluent<?> fluent;

  public V1SecretBuilder() {
    this(new V1Secret());
  }
  
  public V1SecretBuilder(V1SecretFluent<?> fluent) {
    this(fluent, new V1Secret());
  }
  
  public V1SecretBuilder(V1Secret instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1SecretBuilder(V1SecretFluent<?> fluent,V1Secret instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1Secret build() {
    V1Secret buildable = new V1Secret();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setData(fluent.getData());
    buildable.setImmutable(fluent.getImmutable());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setStringData(fluent.getStringData());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}