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
public class V1EndpointSliceListBuilder extends V1EndpointSliceListFluent<V1EndpointSliceListBuilder> implements VisitableBuilder<V1EndpointSliceList,V1EndpointSliceListBuilder>{

  V1EndpointSliceListFluent<?> fluent;

  public V1EndpointSliceListBuilder() {
    this(new V1EndpointSliceList());
  }
  
  public V1EndpointSliceListBuilder(V1EndpointSliceListFluent<?> fluent) {
    this(fluent, new V1EndpointSliceList());
  }
  
  public V1EndpointSliceListBuilder(V1EndpointSliceList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1EndpointSliceListBuilder(V1EndpointSliceListFluent<?> fluent,V1EndpointSliceList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1EndpointSliceList build() {
    V1EndpointSliceList buildable = new V1EndpointSliceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}