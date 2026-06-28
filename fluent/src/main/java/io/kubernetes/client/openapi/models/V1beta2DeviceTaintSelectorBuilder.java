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
public class V1beta2DeviceTaintSelectorBuilder extends V1beta2DeviceTaintSelectorFluent<V1beta2DeviceTaintSelectorBuilder> implements VisitableBuilder<V1beta2DeviceTaintSelector,V1beta2DeviceTaintSelectorBuilder>{

  V1beta2DeviceTaintSelectorFluent<?> fluent;

  public V1beta2DeviceTaintSelectorBuilder() {
    this(new V1beta2DeviceTaintSelector());
  }
  
  public V1beta2DeviceTaintSelectorBuilder(V1beta2DeviceTaintSelectorFluent<?> fluent) {
    this(fluent, new V1beta2DeviceTaintSelector());
  }
  
  public V1beta2DeviceTaintSelectorBuilder(V1beta2DeviceTaintSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2DeviceTaintSelectorBuilder(V1beta2DeviceTaintSelectorFluent<?> fluent,V1beta2DeviceTaintSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2DeviceTaintSelector build() {
    V1beta2DeviceTaintSelector buildable = new V1beta2DeviceTaintSelector();
    buildable.setDevice(fluent.getDevice());
    buildable.setDriver(fluent.getDriver());
    buildable.setPool(fluent.getPool());
    return buildable;
  }
  
}