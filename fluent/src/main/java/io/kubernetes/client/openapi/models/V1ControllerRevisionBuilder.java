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
public class V1ControllerRevisionBuilder extends V1ControllerRevisionFluent<V1ControllerRevisionBuilder> implements VisitableBuilder<V1ControllerRevision,V1ControllerRevisionBuilder>{

  V1ControllerRevisionFluent<?> fluent;

  public V1ControllerRevisionBuilder() {
    this(new V1ControllerRevision());
  }
  
  public V1ControllerRevisionBuilder(V1ControllerRevisionFluent<?> fluent) {
    this(fluent, new V1ControllerRevision());
  }
  
  public V1ControllerRevisionBuilder(V1ControllerRevision instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ControllerRevisionBuilder(V1ControllerRevisionFluent<?> fluent,V1ControllerRevision instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ControllerRevision build() {
    V1ControllerRevision buildable = new V1ControllerRevision();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setData(fluent.getData());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setRevision(fluent.getRevision());
    return buildable;
  }
  
}