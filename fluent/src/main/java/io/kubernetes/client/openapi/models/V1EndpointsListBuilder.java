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
public class V1EndpointsListBuilder extends V1EndpointsListFluent<V1EndpointsListBuilder> implements VisitableBuilder<V1EndpointsList,V1EndpointsListBuilder>{

  V1EndpointsListFluent<?> fluent;

  public V1EndpointsListBuilder() {
    this(new V1EndpointsList());
  }
  
  public V1EndpointsListBuilder(V1EndpointsListFluent<?> fluent) {
    this(fluent, new V1EndpointsList());
  }
  
  public V1EndpointsListBuilder(V1EndpointsList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1EndpointsListBuilder(V1EndpointsListFluent<?> fluent,V1EndpointsList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1EndpointsList build() {
    V1EndpointsList buildable = new V1EndpointsList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}