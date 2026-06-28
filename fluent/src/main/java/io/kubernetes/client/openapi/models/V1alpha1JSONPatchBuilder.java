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
public class V1alpha1JSONPatchBuilder extends V1alpha1JSONPatchFluent<V1alpha1JSONPatchBuilder> implements VisitableBuilder<V1alpha1JSONPatch,V1alpha1JSONPatchBuilder>{

  V1alpha1JSONPatchFluent<?> fluent;

  public V1alpha1JSONPatchBuilder() {
    this(new V1alpha1JSONPatch());
  }
  
  public V1alpha1JSONPatchBuilder(V1alpha1JSONPatchFluent<?> fluent) {
    this(fluent, new V1alpha1JSONPatch());
  }
  
  public V1alpha1JSONPatchBuilder(V1alpha1JSONPatch instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1JSONPatchBuilder(V1alpha1JSONPatchFluent<?> fluent,V1alpha1JSONPatch instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1JSONPatch build() {
    V1alpha1JSONPatch buildable = new V1alpha1JSONPatch();
    buildable.setExpression(fluent.getExpression());
    return buildable;
  }
  
}