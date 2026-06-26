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
public class V1beta2DeviceSelectorBuilder extends V1beta2DeviceSelectorFluent<V1beta2DeviceSelectorBuilder> implements VisitableBuilder<V1beta2DeviceSelector,V1beta2DeviceSelectorBuilder>{

  V1beta2DeviceSelectorFluent<?> fluent;

  public V1beta2DeviceSelectorBuilder() {
    this(new V1beta2DeviceSelector());
  }
  
  public V1beta2DeviceSelectorBuilder(V1beta2DeviceSelectorFluent<?> fluent) {
    this(fluent, new V1beta2DeviceSelector());
  }
  
  public V1beta2DeviceSelectorBuilder(V1beta2DeviceSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2DeviceSelectorBuilder(V1beta2DeviceSelectorFluent<?> fluent,V1beta2DeviceSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2DeviceSelector build() {
    V1beta2DeviceSelector buildable = new V1beta2DeviceSelector();
    buildable.setCel(fluent.buildCel());
    return buildable;
  }
  
}