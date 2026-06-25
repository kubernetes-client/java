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
public class V1TolerationBuilder extends V1TolerationFluent<V1TolerationBuilder> implements VisitableBuilder<V1Toleration,V1TolerationBuilder>{

  V1TolerationFluent<?> fluent;

  public V1TolerationBuilder() {
    this(new V1Toleration());
  }
  
  public V1TolerationBuilder(V1TolerationFluent<?> fluent) {
    this(fluent, new V1Toleration());
  }
  
  public V1TolerationBuilder(V1Toleration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1TolerationBuilder(V1TolerationFluent<?> fluent,V1Toleration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1Toleration build() {
    V1Toleration buildable = new V1Toleration();
    buildable.setEffect(fluent.getEffect());
    buildable.setKey(fluent.getKey());
    buildable.setOperator(fluent.getOperator());
    buildable.setTolerationSeconds(fluent.getTolerationSeconds());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}