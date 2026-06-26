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
public class V1IngressListBuilder extends V1IngressListFluent<V1IngressListBuilder> implements VisitableBuilder<V1IngressList,V1IngressListBuilder>{

  V1IngressListFluent<?> fluent;

  public V1IngressListBuilder() {
    this(new V1IngressList());
  }
  
  public V1IngressListBuilder(V1IngressListFluent<?> fluent) {
    this(fluent, new V1IngressList());
  }
  
  public V1IngressListBuilder(V1IngressList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1IngressListBuilder(V1IngressListFluent<?> fluent,V1IngressList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1IngressList build() {
    V1IngressList buildable = new V1IngressList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}