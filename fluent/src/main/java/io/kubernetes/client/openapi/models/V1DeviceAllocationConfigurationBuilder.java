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
public class V1DeviceAllocationConfigurationBuilder extends V1DeviceAllocationConfigurationFluent<V1DeviceAllocationConfigurationBuilder> implements VisitableBuilder<V1DeviceAllocationConfiguration,V1DeviceAllocationConfigurationBuilder>{

  V1DeviceAllocationConfigurationFluent<?> fluent;

  public V1DeviceAllocationConfigurationBuilder() {
    this(new V1DeviceAllocationConfiguration());
  }
  
  public V1DeviceAllocationConfigurationBuilder(V1DeviceAllocationConfigurationFluent<?> fluent) {
    this(fluent, new V1DeviceAllocationConfiguration());
  }
  
  public V1DeviceAllocationConfigurationBuilder(V1DeviceAllocationConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DeviceAllocationConfigurationBuilder(V1DeviceAllocationConfigurationFluent<?> fluent,V1DeviceAllocationConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DeviceAllocationConfiguration build() {
    V1DeviceAllocationConfiguration buildable = new V1DeviceAllocationConfiguration();
    buildable.setOpaque(fluent.buildOpaque());
    buildable.setRequests(fluent.getRequests());
    buildable.setSource(fluent.getSource());
    return buildable;
  }
  
}