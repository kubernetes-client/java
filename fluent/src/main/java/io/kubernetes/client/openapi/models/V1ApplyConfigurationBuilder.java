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
public class V1ApplyConfigurationBuilder extends V1ApplyConfigurationFluent<V1ApplyConfigurationBuilder> implements VisitableBuilder<V1ApplyConfiguration,V1ApplyConfigurationBuilder>{

  V1ApplyConfigurationFluent<?> fluent;

  public V1ApplyConfigurationBuilder() {
    this(new V1ApplyConfiguration());
  }
  
  public V1ApplyConfigurationBuilder(V1ApplyConfigurationFluent<?> fluent) {
    this(fluent, new V1ApplyConfiguration());
  }
  
  public V1ApplyConfigurationBuilder(V1ApplyConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ApplyConfigurationBuilder(V1ApplyConfigurationFluent<?> fluent,V1ApplyConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ApplyConfiguration build() {
    V1ApplyConfiguration buildable = new V1ApplyConfiguration();
    buildable.setExpression(fluent.getExpression());
    return buildable;
  }
  
}