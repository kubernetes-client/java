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
public class V1JSONPatchBuilder extends V1JSONPatchFluent<V1JSONPatchBuilder> implements VisitableBuilder<V1JSONPatch,V1JSONPatchBuilder>{

  V1JSONPatchFluent<?> fluent;

  public V1JSONPatchBuilder() {
    this(new V1JSONPatch());
  }
  
  public V1JSONPatchBuilder(V1JSONPatchFluent<?> fluent) {
    this(fluent, new V1JSONPatch());
  }
  
  public V1JSONPatchBuilder(V1JSONPatch instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1JSONPatchBuilder(V1JSONPatchFluent<?> fluent,V1JSONPatch instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1JSONPatch build() {
    V1JSONPatch buildable = new V1JSONPatch();
    buildable.setExpression(fluent.getExpression());
    return buildable;
  }
  
}