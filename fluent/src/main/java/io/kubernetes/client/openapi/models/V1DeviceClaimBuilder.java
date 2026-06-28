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
public class V1DeviceClaimBuilder extends V1DeviceClaimFluent<V1DeviceClaimBuilder> implements VisitableBuilder<V1DeviceClaim,V1DeviceClaimBuilder>{

  V1DeviceClaimFluent<?> fluent;

  public V1DeviceClaimBuilder() {
    this(new V1DeviceClaim());
  }
  
  public V1DeviceClaimBuilder(V1DeviceClaimFluent<?> fluent) {
    this(fluent, new V1DeviceClaim());
  }
  
  public V1DeviceClaimBuilder(V1DeviceClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DeviceClaimBuilder(V1DeviceClaimFluent<?> fluent,V1DeviceClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DeviceClaim build() {
    V1DeviceClaim buildable = new V1DeviceClaim();
    buildable.setConfig(fluent.buildConfig());
    buildable.setConstraints(fluent.buildConstraints());
    buildable.setRequests(fluent.buildRequests());
    return buildable;
  }
  
}