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
public class V1LimitRangeBuilder extends V1LimitRangeFluent<V1LimitRangeBuilder> implements VisitableBuilder<V1LimitRange,V1LimitRangeBuilder>{

  V1LimitRangeFluent<?> fluent;

  public V1LimitRangeBuilder() {
    this(new V1LimitRange());
  }
  
  public V1LimitRangeBuilder(V1LimitRangeFluent<?> fluent) {
    this(fluent, new V1LimitRange());
  }
  
  public V1LimitRangeBuilder(V1LimitRange instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1LimitRangeBuilder(V1LimitRangeFluent<?> fluent,V1LimitRange instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1LimitRange build() {
    V1LimitRange buildable = new V1LimitRange();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  
}