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
public class V1DeviceClassSpecBuilder extends V1DeviceClassSpecFluent<V1DeviceClassSpecBuilder> implements VisitableBuilder<V1DeviceClassSpec,V1DeviceClassSpecBuilder>{

  V1DeviceClassSpecFluent<?> fluent;

  public V1DeviceClassSpecBuilder() {
    this(new V1DeviceClassSpec());
  }
  
  public V1DeviceClassSpecBuilder(V1DeviceClassSpecFluent<?> fluent) {
    this(fluent, new V1DeviceClassSpec());
  }
  
  public V1DeviceClassSpecBuilder(V1DeviceClassSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DeviceClassSpecBuilder(V1DeviceClassSpecFluent<?> fluent,V1DeviceClassSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DeviceClassSpec build() {
    V1DeviceClassSpec buildable = new V1DeviceClassSpec();
    buildable.setConfig(fluent.buildConfig());
    buildable.setExtendedResourceName(fluent.getExtendedResourceName());
    buildable.setSelectors(fluent.buildSelectors());
    return buildable;
  }
  
}