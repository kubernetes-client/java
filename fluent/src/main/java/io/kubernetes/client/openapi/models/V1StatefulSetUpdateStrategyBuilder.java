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
public class V1StatefulSetUpdateStrategyBuilder extends V1StatefulSetUpdateStrategyFluent<V1StatefulSetUpdateStrategyBuilder> implements VisitableBuilder<V1StatefulSetUpdateStrategy,V1StatefulSetUpdateStrategyBuilder>{

  V1StatefulSetUpdateStrategyFluent<?> fluent;

  public V1StatefulSetUpdateStrategyBuilder() {
    this(new V1StatefulSetUpdateStrategy());
  }
  
  public V1StatefulSetUpdateStrategyBuilder(V1StatefulSetUpdateStrategyFluent<?> fluent) {
    this(fluent, new V1StatefulSetUpdateStrategy());
  }
  
  public V1StatefulSetUpdateStrategyBuilder(V1StatefulSetUpdateStrategy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1StatefulSetUpdateStrategyBuilder(V1StatefulSetUpdateStrategyFluent<?> fluent,V1StatefulSetUpdateStrategy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1StatefulSetUpdateStrategy build() {
    V1StatefulSetUpdateStrategy buildable = new V1StatefulSetUpdateStrategy();
    buildable.setRollingUpdate(fluent.buildRollingUpdate());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}