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
public class V2PodsMetricSourceBuilder extends V2PodsMetricSourceFluent<V2PodsMetricSourceBuilder> implements VisitableBuilder<V2PodsMetricSource,V2PodsMetricSourceBuilder>{

  V2PodsMetricSourceFluent<?> fluent;

  public V2PodsMetricSourceBuilder() {
    this(new V2PodsMetricSource());
  }
  
  public V2PodsMetricSourceBuilder(V2PodsMetricSourceFluent<?> fluent) {
    this(fluent, new V2PodsMetricSource());
  }
  
  public V2PodsMetricSourceBuilder(V2PodsMetricSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V2PodsMetricSourceBuilder(V2PodsMetricSourceFluent<?> fluent,V2PodsMetricSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V2PodsMetricSource build() {
    V2PodsMetricSource buildable = new V2PodsMetricSource();
    buildable.setMetric(fluent.buildMetric());
    buildable.setTarget(fluent.buildTarget());
    return buildable;
  }
  
}