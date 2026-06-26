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
public class V1beta2DeviceClaimBuilder extends V1beta2DeviceClaimFluent<V1beta2DeviceClaimBuilder> implements VisitableBuilder<V1beta2DeviceClaim,V1beta2DeviceClaimBuilder>{

  V1beta2DeviceClaimFluent<?> fluent;

  public V1beta2DeviceClaimBuilder() {
    this(new V1beta2DeviceClaim());
  }
  
  public V1beta2DeviceClaimBuilder(V1beta2DeviceClaimFluent<?> fluent) {
    this(fluent, new V1beta2DeviceClaim());
  }
  
  public V1beta2DeviceClaimBuilder(V1beta2DeviceClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2DeviceClaimBuilder(V1beta2DeviceClaimFluent<?> fluent,V1beta2DeviceClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2DeviceClaim build() {
    V1beta2DeviceClaim buildable = new V1beta2DeviceClaim();
    buildable.setConfig(fluent.buildConfig());
    buildable.setConstraints(fluent.buildConstraints());
    buildable.setRequests(fluent.buildRequests());
    return buildable;
  }
  
}