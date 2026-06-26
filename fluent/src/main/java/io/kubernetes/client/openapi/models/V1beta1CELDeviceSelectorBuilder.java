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
public class V1beta1CELDeviceSelectorBuilder extends V1beta1CELDeviceSelectorFluent<V1beta1CELDeviceSelectorBuilder> implements VisitableBuilder<V1beta1CELDeviceSelector,V1beta1CELDeviceSelectorBuilder>{

  V1beta1CELDeviceSelectorFluent<?> fluent;

  public V1beta1CELDeviceSelectorBuilder() {
    this(new V1beta1CELDeviceSelector());
  }
  
  public V1beta1CELDeviceSelectorBuilder(V1beta1CELDeviceSelectorFluent<?> fluent) {
    this(fluent, new V1beta1CELDeviceSelector());
  }
  
  public V1beta1CELDeviceSelectorBuilder(V1beta1CELDeviceSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1CELDeviceSelectorBuilder(V1beta1CELDeviceSelectorFluent<?> fluent,V1beta1CELDeviceSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1CELDeviceSelector build() {
    V1beta1CELDeviceSelector buildable = new V1beta1CELDeviceSelector();
    buildable.setExpression(fluent.getExpression());
    return buildable;
  }
  
}