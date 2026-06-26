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
public class V1DeviceTolerationBuilder extends V1DeviceTolerationFluent<V1DeviceTolerationBuilder> implements VisitableBuilder<V1DeviceToleration,V1DeviceTolerationBuilder>{

  V1DeviceTolerationFluent<?> fluent;

  public V1DeviceTolerationBuilder() {
    this(new V1DeviceToleration());
  }
  
  public V1DeviceTolerationBuilder(V1DeviceTolerationFluent<?> fluent) {
    this(fluent, new V1DeviceToleration());
  }
  
  public V1DeviceTolerationBuilder(V1DeviceToleration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DeviceTolerationBuilder(V1DeviceTolerationFluent<?> fluent,V1DeviceToleration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DeviceToleration build() {
    V1DeviceToleration buildable = new V1DeviceToleration();
    buildable.setEffect(fluent.getEffect());
    buildable.setKey(fluent.getKey());
    buildable.setOperator(fluent.getOperator());
    buildable.setTolerationSeconds(fluent.getTolerationSeconds());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}