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
public class V1PodBuilder extends V1PodFluent<V1PodBuilder> implements VisitableBuilder<V1Pod,V1PodBuilder>{

  V1PodFluent<?> fluent;

  public V1PodBuilder() {
    this(new V1Pod());
  }
  
  public V1PodBuilder(V1PodFluent<?> fluent) {
    this(fluent, new V1Pod());
  }
  
  public V1PodBuilder(V1Pod instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PodBuilder(V1PodFluent<?> fluent,V1Pod instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1Pod build() {
    V1Pod buildable = new V1Pod();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  
}