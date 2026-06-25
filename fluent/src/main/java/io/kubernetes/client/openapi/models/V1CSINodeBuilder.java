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
public class V1CSINodeBuilder extends V1CSINodeFluent<V1CSINodeBuilder> implements VisitableBuilder<V1CSINode,V1CSINodeBuilder>{

  V1CSINodeFluent<?> fluent;

  public V1CSINodeBuilder() {
    this(new V1CSINode());
  }
  
  public V1CSINodeBuilder(V1CSINodeFluent<?> fluent) {
    this(fluent, new V1CSINode());
  }
  
  public V1CSINodeBuilder(V1CSINode instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CSINodeBuilder(V1CSINodeFluent<?> fluent,V1CSINode instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CSINode build() {
    V1CSINode buildable = new V1CSINode();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  
}