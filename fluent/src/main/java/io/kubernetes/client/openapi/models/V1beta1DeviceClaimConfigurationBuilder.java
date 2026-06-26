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
public class V1beta1DeviceClaimConfigurationBuilder extends V1beta1DeviceClaimConfigurationFluent<V1beta1DeviceClaimConfigurationBuilder> implements VisitableBuilder<V1beta1DeviceClaimConfiguration,V1beta1DeviceClaimConfigurationBuilder>{

  V1beta1DeviceClaimConfigurationFluent<?> fluent;

  public V1beta1DeviceClaimConfigurationBuilder() {
    this(new V1beta1DeviceClaimConfiguration());
  }
  
  public V1beta1DeviceClaimConfigurationBuilder(V1beta1DeviceClaimConfigurationFluent<?> fluent) {
    this(fluent, new V1beta1DeviceClaimConfiguration());
  }
  
  public V1beta1DeviceClaimConfigurationBuilder(V1beta1DeviceClaimConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1DeviceClaimConfigurationBuilder(V1beta1DeviceClaimConfigurationFluent<?> fluent,V1beta1DeviceClaimConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1DeviceClaimConfiguration build() {
    V1beta1DeviceClaimConfiguration buildable = new V1beta1DeviceClaimConfiguration();
    buildable.setOpaque(fluent.buildOpaque());
    buildable.setRequests(fluent.getRequests());
    return buildable;
  }
  
}