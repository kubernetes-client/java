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
public class V2MetricSpecBuilder extends V2MetricSpecFluent<V2MetricSpecBuilder> implements VisitableBuilder<V2MetricSpec,V2MetricSpecBuilder>{

  V2MetricSpecFluent<?> fluent;

  public V2MetricSpecBuilder() {
    this(new V2MetricSpec());
  }
  
  public V2MetricSpecBuilder(V2MetricSpecFluent<?> fluent) {
    this(fluent, new V2MetricSpec());
  }
  
  public V2MetricSpecBuilder(V2MetricSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V2MetricSpecBuilder(V2MetricSpecFluent<?> fluent,V2MetricSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V2MetricSpec build() {
    V2MetricSpec buildable = new V2MetricSpec();
    buildable.setContainerResource(fluent.buildContainerResource());
    buildable.setExternal(fluent.buildExternal());
    buildable.setObject(fluent.buildObject());
    buildable.setPods(fluent.buildPods());
    buildable.setResource(fluent.buildResource());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}