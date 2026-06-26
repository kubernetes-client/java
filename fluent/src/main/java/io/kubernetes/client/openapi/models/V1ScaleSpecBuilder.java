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
public class V1ScaleSpecBuilder extends V1ScaleSpecFluent<V1ScaleSpecBuilder> implements VisitableBuilder<V1ScaleSpec,V1ScaleSpecBuilder>{

  V1ScaleSpecFluent<?> fluent;

  public V1ScaleSpecBuilder() {
    this(new V1ScaleSpec());
  }
  
  public V1ScaleSpecBuilder(V1ScaleSpecFluent<?> fluent) {
    this(fluent, new V1ScaleSpec());
  }
  
  public V1ScaleSpecBuilder(V1ScaleSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ScaleSpecBuilder(V1ScaleSpecFluent<?> fluent,V1ScaleSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ScaleSpec build() {
    V1ScaleSpec buildable = new V1ScaleSpec();
    buildable.setReplicas(fluent.getReplicas());
    return buildable;
  }
  
}