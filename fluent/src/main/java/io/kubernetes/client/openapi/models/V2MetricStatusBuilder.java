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
public class V2MetricStatusBuilder extends V2MetricStatusFluent<V2MetricStatusBuilder> implements VisitableBuilder<V2MetricStatus,V2MetricStatusBuilder>{

  V2MetricStatusFluent<?> fluent;

  public V2MetricStatusBuilder() {
    this(new V2MetricStatus());
  }
  
  public V2MetricStatusBuilder(V2MetricStatusFluent<?> fluent) {
    this(fluent, new V2MetricStatus());
  }
  
  public V2MetricStatusBuilder(V2MetricStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V2MetricStatusBuilder(V2MetricStatusFluent<?> fluent,V2MetricStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V2MetricStatus build() {
    V2MetricStatus buildable = new V2MetricStatus();
    buildable.setContainerResource(fluent.buildContainerResource());
    buildable.setExternal(fluent.buildExternal());
    buildable.setObject(fluent.buildObject());
    buildable.setPods(fluent.buildPods());
    buildable.setResource(fluent.buildResource());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}