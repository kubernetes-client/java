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
public class V2MetricValueStatusBuilder extends V2MetricValueStatusFluent<V2MetricValueStatusBuilder> implements VisitableBuilder<V2MetricValueStatus,V2MetricValueStatusBuilder>{

  V2MetricValueStatusFluent<?> fluent;

  public V2MetricValueStatusBuilder() {
    this(new V2MetricValueStatus());
  }
  
  public V2MetricValueStatusBuilder(V2MetricValueStatusFluent<?> fluent) {
    this(fluent, new V2MetricValueStatus());
  }
  
  public V2MetricValueStatusBuilder(V2MetricValueStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V2MetricValueStatusBuilder(V2MetricValueStatusFluent<?> fluent,V2MetricValueStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V2MetricValueStatus build() {
    V2MetricValueStatus buildable = new V2MetricValueStatus();
    buildable.setAverageUtilization(fluent.getAverageUtilization());
    buildable.setAverageValue(fluent.getAverageValue());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}