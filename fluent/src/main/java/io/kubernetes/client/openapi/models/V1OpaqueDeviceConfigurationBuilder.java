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
public class V1OpaqueDeviceConfigurationBuilder extends V1OpaqueDeviceConfigurationFluent<V1OpaqueDeviceConfigurationBuilder> implements VisitableBuilder<V1OpaqueDeviceConfiguration,V1OpaqueDeviceConfigurationBuilder>{

  V1OpaqueDeviceConfigurationFluent<?> fluent;

  public V1OpaqueDeviceConfigurationBuilder() {
    this(new V1OpaqueDeviceConfiguration());
  }
  
  public V1OpaqueDeviceConfigurationBuilder(V1OpaqueDeviceConfigurationFluent<?> fluent) {
    this(fluent, new V1OpaqueDeviceConfiguration());
  }
  
  public V1OpaqueDeviceConfigurationBuilder(V1OpaqueDeviceConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1OpaqueDeviceConfigurationBuilder(V1OpaqueDeviceConfigurationFluent<?> fluent,V1OpaqueDeviceConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1OpaqueDeviceConfiguration build() {
    V1OpaqueDeviceConfiguration buildable = new V1OpaqueDeviceConfiguration();
    buildable.setDriver(fluent.getDriver());
    buildable.setParameters(fluent.getParameters());
    return buildable;
  }
  
}