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
public class V2ResourceMetricStatusBuilder extends V2ResourceMetricStatusFluent<V2ResourceMetricStatusBuilder> implements VisitableBuilder<V2ResourceMetricStatus,V2ResourceMetricStatusBuilder>{

  V2ResourceMetricStatusFluent<?> fluent;

  public V2ResourceMetricStatusBuilder() {
    this(new V2ResourceMetricStatus());
  }
  
  public V2ResourceMetricStatusBuilder(V2ResourceMetricStatusFluent<?> fluent) {
    this(fluent, new V2ResourceMetricStatus());
  }
  
  public V2ResourceMetricStatusBuilder(V2ResourceMetricStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V2ResourceMetricStatusBuilder(V2ResourceMetricStatusFluent<?> fluent,V2ResourceMetricStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V2ResourceMetricStatus build() {
    V2ResourceMetricStatus buildable = new V2ResourceMetricStatus();
    buildable.setCurrent(fluent.buildCurrent());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}