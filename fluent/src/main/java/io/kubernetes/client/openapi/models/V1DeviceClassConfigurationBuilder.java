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
public class V1DeviceClassConfigurationBuilder extends V1DeviceClassConfigurationFluent<V1DeviceClassConfigurationBuilder> implements VisitableBuilder<V1DeviceClassConfiguration,V1DeviceClassConfigurationBuilder>{

  V1DeviceClassConfigurationFluent<?> fluent;

  public V1DeviceClassConfigurationBuilder() {
    this(new V1DeviceClassConfiguration());
  }
  
  public V1DeviceClassConfigurationBuilder(V1DeviceClassConfigurationFluent<?> fluent) {
    this(fluent, new V1DeviceClassConfiguration());
  }
  
  public V1DeviceClassConfigurationBuilder(V1DeviceClassConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DeviceClassConfigurationBuilder(V1DeviceClassConfigurationFluent<?> fluent,V1DeviceClassConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DeviceClassConfiguration build() {
    V1DeviceClassConfiguration buildable = new V1DeviceClassConfiguration();
    buildable.setOpaque(fluent.buildOpaque());
    return buildable;
  }
  
}