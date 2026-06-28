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
public class V2ExternalMetricStatusBuilder extends V2ExternalMetricStatusFluent<V2ExternalMetricStatusBuilder> implements VisitableBuilder<V2ExternalMetricStatus,V2ExternalMetricStatusBuilder>{

  V2ExternalMetricStatusFluent<?> fluent;

  public V2ExternalMetricStatusBuilder() {
    this(new V2ExternalMetricStatus());
  }
  
  public V2ExternalMetricStatusBuilder(V2ExternalMetricStatusFluent<?> fluent) {
    this(fluent, new V2ExternalMetricStatus());
  }
  
  public V2ExternalMetricStatusBuilder(V2ExternalMetricStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V2ExternalMetricStatusBuilder(V2ExternalMetricStatusFluent<?> fluent,V2ExternalMetricStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V2ExternalMetricStatus build() {
    V2ExternalMetricStatus buildable = new V2ExternalMetricStatus();
    buildable.setCurrent(fluent.buildCurrent());
    buildable.setMetric(fluent.buildMetric());
    return buildable;
  }
  
}