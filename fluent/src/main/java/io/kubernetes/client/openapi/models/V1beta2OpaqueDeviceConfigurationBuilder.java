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
public class V1beta2OpaqueDeviceConfigurationBuilder extends V1beta2OpaqueDeviceConfigurationFluent<V1beta2OpaqueDeviceConfigurationBuilder> implements VisitableBuilder<V1beta2OpaqueDeviceConfiguration,V1beta2OpaqueDeviceConfigurationBuilder>{

  V1beta2OpaqueDeviceConfigurationFluent<?> fluent;

  public V1beta2OpaqueDeviceConfigurationBuilder() {
    this(new V1beta2OpaqueDeviceConfiguration());
  }
  
  public V1beta2OpaqueDeviceConfigurationBuilder(V1beta2OpaqueDeviceConfigurationFluent<?> fluent) {
    this(fluent, new V1beta2OpaqueDeviceConfiguration());
  }
  
  public V1beta2OpaqueDeviceConfigurationBuilder(V1beta2OpaqueDeviceConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2OpaqueDeviceConfigurationBuilder(V1beta2OpaqueDeviceConfigurationFluent<?> fluent,V1beta2OpaqueDeviceConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2OpaqueDeviceConfiguration build() {
    V1beta2OpaqueDeviceConfiguration buildable = new V1beta2OpaqueDeviceConfiguration();
    buildable.setDriver(fluent.getDriver());
    buildable.setParameters(fluent.getParameters());
    return buildable;
  }
  
}