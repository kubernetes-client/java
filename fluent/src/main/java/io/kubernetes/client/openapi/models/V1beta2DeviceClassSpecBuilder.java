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
public class V1beta2DeviceClassSpecBuilder extends V1beta2DeviceClassSpecFluent<V1beta2DeviceClassSpecBuilder> implements VisitableBuilder<V1beta2DeviceClassSpec,V1beta2DeviceClassSpecBuilder>{

  V1beta2DeviceClassSpecFluent<?> fluent;

  public V1beta2DeviceClassSpecBuilder() {
    this(new V1beta2DeviceClassSpec());
  }
  
  public V1beta2DeviceClassSpecBuilder(V1beta2DeviceClassSpecFluent<?> fluent) {
    this(fluent, new V1beta2DeviceClassSpec());
  }
  
  public V1beta2DeviceClassSpecBuilder(V1beta2DeviceClassSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2DeviceClassSpecBuilder(V1beta2DeviceClassSpecFluent<?> fluent,V1beta2DeviceClassSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2DeviceClassSpec build() {
    V1beta2DeviceClassSpec buildable = new V1beta2DeviceClassSpec();
    buildable.setConfig(fluent.buildConfig());
    buildable.setExtendedResourceName(fluent.getExtendedResourceName());
    buildable.setSelectors(fluent.buildSelectors());
    return buildable;
  }
  
}