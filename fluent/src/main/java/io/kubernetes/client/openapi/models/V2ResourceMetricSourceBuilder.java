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
public class V2ResourceMetricSourceBuilder extends V2ResourceMetricSourceFluent<V2ResourceMetricSourceBuilder> implements VisitableBuilder<V2ResourceMetricSource,V2ResourceMetricSourceBuilder>{

  V2ResourceMetricSourceFluent<?> fluent;

  public V2ResourceMetricSourceBuilder() {
    this(new V2ResourceMetricSource());
  }
  
  public V2ResourceMetricSourceBuilder(V2ResourceMetricSourceFluent<?> fluent) {
    this(fluent, new V2ResourceMetricSource());
  }
  
  public V2ResourceMetricSourceBuilder(V2ResourceMetricSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V2ResourceMetricSourceBuilder(V2ResourceMetricSourceFluent<?> fluent,V2ResourceMetricSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V2ResourceMetricSource build() {
    V2ResourceMetricSource buildable = new V2ResourceMetricSource();
    buildable.setName(fluent.getName());
    buildable.setTarget(fluent.buildTarget());
    return buildable;
  }
  
}