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
public class V1beta1DeviceTolerationBuilder extends V1beta1DeviceTolerationFluent<V1beta1DeviceTolerationBuilder> implements VisitableBuilder<V1beta1DeviceToleration,V1beta1DeviceTolerationBuilder>{

  V1beta1DeviceTolerationFluent<?> fluent;

  public V1beta1DeviceTolerationBuilder() {
    this(new V1beta1DeviceToleration());
  }
  
  public V1beta1DeviceTolerationBuilder(V1beta1DeviceTolerationFluent<?> fluent) {
    this(fluent, new V1beta1DeviceToleration());
  }
  
  public V1beta1DeviceTolerationBuilder(V1beta1DeviceToleration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1DeviceTolerationBuilder(V1beta1DeviceTolerationFluent<?> fluent,V1beta1DeviceToleration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1DeviceToleration build() {
    V1beta1DeviceToleration buildable = new V1beta1DeviceToleration();
    buildable.setEffect(fluent.getEffect());
    buildable.setKey(fluent.getKey());
    buildable.setOperator(fluent.getOperator());
    buildable.setTolerationSeconds(fluent.getTolerationSeconds());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}