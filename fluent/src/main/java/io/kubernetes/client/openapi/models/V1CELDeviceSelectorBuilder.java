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
public class V1CELDeviceSelectorBuilder extends V1CELDeviceSelectorFluent<V1CELDeviceSelectorBuilder> implements VisitableBuilder<V1CELDeviceSelector,V1CELDeviceSelectorBuilder>{

  V1CELDeviceSelectorFluent<?> fluent;

  public V1CELDeviceSelectorBuilder() {
    this(new V1CELDeviceSelector());
  }
  
  public V1CELDeviceSelectorBuilder(V1CELDeviceSelectorFluent<?> fluent) {
    this(fluent, new V1CELDeviceSelector());
  }
  
  public V1CELDeviceSelectorBuilder(V1CELDeviceSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CELDeviceSelectorBuilder(V1CELDeviceSelectorFluent<?> fluent,V1CELDeviceSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CELDeviceSelector build() {
    V1CELDeviceSelector buildable = new V1CELDeviceSelector();
    buildable.setExpression(fluent.getExpression());
    return buildable;
  }
  
}