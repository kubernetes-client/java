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
public class V2MetricTargetBuilder extends V2MetricTargetFluent<V2MetricTargetBuilder> implements VisitableBuilder<V2MetricTarget,V2MetricTargetBuilder>{

  V2MetricTargetFluent<?> fluent;

  public V2MetricTargetBuilder() {
    this(new V2MetricTarget());
  }
  
  public V2MetricTargetBuilder(V2MetricTargetFluent<?> fluent) {
    this(fluent, new V2MetricTarget());
  }
  
  public V2MetricTargetBuilder(V2MetricTarget instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V2MetricTargetBuilder(V2MetricTargetFluent<?> fluent,V2MetricTarget instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V2MetricTarget build() {
    V2MetricTarget buildable = new V2MetricTarget();
    buildable.setAverageUtilization(fluent.getAverageUtilization());
    buildable.setAverageValue(fluent.getAverageValue());
    buildable.setType(fluent.getType());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}