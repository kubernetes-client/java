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
public class V1RuntimeClassBuilder extends V1RuntimeClassFluent<V1RuntimeClassBuilder> implements VisitableBuilder<V1RuntimeClass,V1RuntimeClassBuilder>{

  V1RuntimeClassFluent<?> fluent;

  public V1RuntimeClassBuilder() {
    this(new V1RuntimeClass());
  }
  
  public V1RuntimeClassBuilder(V1RuntimeClassFluent<?> fluent) {
    this(fluent, new V1RuntimeClass());
  }
  
  public V1RuntimeClassBuilder(V1RuntimeClass instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1RuntimeClassBuilder(V1RuntimeClassFluent<?> fluent,V1RuntimeClass instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1RuntimeClass build() {
    V1RuntimeClass buildable = new V1RuntimeClass();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setHandler(fluent.getHandler());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setOverhead(fluent.buildOverhead());
    buildable.setScheduling(fluent.buildScheduling());
    return buildable;
  }
  
}