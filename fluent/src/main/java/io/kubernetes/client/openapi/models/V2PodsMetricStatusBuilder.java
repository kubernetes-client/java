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
public class V2PodsMetricStatusBuilder extends V2PodsMetricStatusFluent<V2PodsMetricStatusBuilder> implements VisitableBuilder<V2PodsMetricStatus,V2PodsMetricStatusBuilder>{

  V2PodsMetricStatusFluent<?> fluent;

  public V2PodsMetricStatusBuilder() {
    this(new V2PodsMetricStatus());
  }
  
  public V2PodsMetricStatusBuilder(V2PodsMetricStatusFluent<?> fluent) {
    this(fluent, new V2PodsMetricStatus());
  }
  
  public V2PodsMetricStatusBuilder(V2PodsMetricStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V2PodsMetricStatusBuilder(V2PodsMetricStatusFluent<?> fluent,V2PodsMetricStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V2PodsMetricStatus build() {
    V2PodsMetricStatus buildable = new V2PodsMetricStatus();
    buildable.setCurrent(fluent.buildCurrent());
    buildable.setMetric(fluent.buildMetric());
    return buildable;
  }
  
}