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
public class V1DeviceSelectorBuilder extends V1DeviceSelectorFluent<V1DeviceSelectorBuilder> implements VisitableBuilder<V1DeviceSelector,V1DeviceSelectorBuilder>{

  V1DeviceSelectorFluent<?> fluent;

  public V1DeviceSelectorBuilder() {
    this(new V1DeviceSelector());
  }
  
  public V1DeviceSelectorBuilder(V1DeviceSelectorFluent<?> fluent) {
    this(fluent, new V1DeviceSelector());
  }
  
  public V1DeviceSelectorBuilder(V1DeviceSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DeviceSelectorBuilder(V1DeviceSelectorFluent<?> fluent,V1DeviceSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DeviceSelector build() {
    V1DeviceSelector buildable = new V1DeviceSelector();
    buildable.setCel(fluent.buildCel());
    return buildable;
  }
  
}