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
public class V1NodeListBuilder extends V1NodeListFluent<V1NodeListBuilder> implements VisitableBuilder<V1NodeList,V1NodeListBuilder>{

  V1NodeListFluent<?> fluent;

  public V1NodeListBuilder() {
    this(new V1NodeList());
  }
  
  public V1NodeListBuilder(V1NodeListFluent<?> fluent) {
    this(fluent, new V1NodeList());
  }
  
  public V1NodeListBuilder(V1NodeList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NodeListBuilder(V1NodeListFluent<?> fluent,V1NodeList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NodeList build() {
    V1NodeList buildable = new V1NodeList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}