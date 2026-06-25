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
public class V1ResourceSliceBuilder extends V1ResourceSliceFluent<V1ResourceSliceBuilder> implements VisitableBuilder<V1ResourceSlice,V1ResourceSliceBuilder>{

  V1ResourceSliceFluent<?> fluent;

  public V1ResourceSliceBuilder() {
    this(new V1ResourceSlice());
  }
  
  public V1ResourceSliceBuilder(V1ResourceSliceFluent<?> fluent) {
    this(fluent, new V1ResourceSlice());
  }
  
  public V1ResourceSliceBuilder(V1ResourceSlice instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ResourceSliceBuilder(V1ResourceSliceFluent<?> fluent,V1ResourceSlice instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ResourceSlice build() {
    V1ResourceSlice buildable = new V1ResourceSlice();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  
}