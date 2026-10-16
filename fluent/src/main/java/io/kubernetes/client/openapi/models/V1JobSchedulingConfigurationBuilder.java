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
import javax.annotation.processing.Generated;
@Generated("io.sundr:builder-annotations")
public class V1JobSchedulingConfigurationBuilder extends V1JobSchedulingConfigurationFluent<V1JobSchedulingConfigurationBuilder> implements VisitableBuilder<V1JobSchedulingConfiguration,V1JobSchedulingConfigurationBuilder>{

  V1JobSchedulingConfigurationFluent<?> fluent;

  public V1JobSchedulingConfigurationBuilder() {
    this(new V1JobSchedulingConfiguration());
  }
  
  public V1JobSchedulingConfigurationBuilder(V1JobSchedulingConfigurationFluent<?> fluent) {
    this(fluent, new V1JobSchedulingConfiguration());
  }
  
  public V1JobSchedulingConfigurationBuilder(V1JobSchedulingConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1JobSchedulingConfigurationBuilder(V1JobSchedulingConfigurationFluent<?> fluent,V1JobSchedulingConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1JobSchedulingConfiguration build() {
    V1JobSchedulingConfiguration buildable = new V1JobSchedulingConfiguration();
    buildable.setDisruptionMode(fluent.buildDisruptionMode());
    buildable.setResourceClaims(fluent.buildResourceClaims());
    buildable.setSchedulingConstraints(fluent.buildSchedulingConstraints());
    buildable.setSchedulingPolicy(fluent.buildSchedulingPolicy());
    return buildable;
  }
  
}