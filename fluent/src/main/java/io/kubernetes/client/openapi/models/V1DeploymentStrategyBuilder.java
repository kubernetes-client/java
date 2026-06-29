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
public class V1DeploymentStrategyBuilder extends V1DeploymentStrategyFluent<V1DeploymentStrategyBuilder> implements VisitableBuilder<V1DeploymentStrategy,V1DeploymentStrategyBuilder>{

  V1DeploymentStrategyFluent<?> fluent;

  public V1DeploymentStrategyBuilder() {
    this(new V1DeploymentStrategy());
  }
  
  public V1DeploymentStrategyBuilder(V1DeploymentStrategyFluent<?> fluent) {
    this(fluent, new V1DeploymentStrategy());
  }
  
  public V1DeploymentStrategyBuilder(V1DeploymentStrategy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DeploymentStrategyBuilder(V1DeploymentStrategyFluent<?> fluent,V1DeploymentStrategy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DeploymentStrategy build() {
    V1DeploymentStrategy buildable = new V1DeploymentStrategy();
    buildable.setRollingUpdate(fluent.buildRollingUpdate());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}