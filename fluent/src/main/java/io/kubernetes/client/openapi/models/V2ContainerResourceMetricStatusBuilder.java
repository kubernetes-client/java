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
public class V2ContainerResourceMetricStatusBuilder extends V2ContainerResourceMetricStatusFluent<V2ContainerResourceMetricStatusBuilder> implements VisitableBuilder<V2ContainerResourceMetricStatus,V2ContainerResourceMetricStatusBuilder>{

  V2ContainerResourceMetricStatusFluent<?> fluent;

  public V2ContainerResourceMetricStatusBuilder() {
    this(new V2ContainerResourceMetricStatus());
  }
  
  public V2ContainerResourceMetricStatusBuilder(V2ContainerResourceMetricStatusFluent<?> fluent) {
    this(fluent, new V2ContainerResourceMetricStatus());
  }
  
  public V2ContainerResourceMetricStatusBuilder(V2ContainerResourceMetricStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V2ContainerResourceMetricStatusBuilder(V2ContainerResourceMetricStatusFluent<?> fluent,V2ContainerResourceMetricStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V2ContainerResourceMetricStatus build() {
    V2ContainerResourceMetricStatus buildable = new V2ContainerResourceMetricStatus();
    buildable.setContainer(fluent.getContainer());
    buildable.setCurrent(fluent.buildCurrent());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}