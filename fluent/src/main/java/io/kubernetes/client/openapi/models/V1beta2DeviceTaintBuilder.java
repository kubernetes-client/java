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
public class V1beta2DeviceTaintBuilder extends V1beta2DeviceTaintFluent<V1beta2DeviceTaintBuilder> implements VisitableBuilder<V1beta2DeviceTaint,V1beta2DeviceTaintBuilder>{

  V1beta2DeviceTaintFluent<?> fluent;

  public V1beta2DeviceTaintBuilder() {
    this(new V1beta2DeviceTaint());
  }
  
  public V1beta2DeviceTaintBuilder(V1beta2DeviceTaintFluent<?> fluent) {
    this(fluent, new V1beta2DeviceTaint());
  }
  
  public V1beta2DeviceTaintBuilder(V1beta2DeviceTaint instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2DeviceTaintBuilder(V1beta2DeviceTaintFluent<?> fluent,V1beta2DeviceTaint instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2DeviceTaint build() {
    V1beta2DeviceTaint buildable = new V1beta2DeviceTaint();
    buildable.setEffect(fluent.getEffect());
    buildable.setKey(fluent.getKey());
    buildable.setTimeAdded(fluent.getTimeAdded());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}