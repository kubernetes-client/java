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
public class V1ConfigMapEnvSourceBuilder extends V1ConfigMapEnvSourceFluent<V1ConfigMapEnvSourceBuilder> implements VisitableBuilder<V1ConfigMapEnvSource,V1ConfigMapEnvSourceBuilder>{

  V1ConfigMapEnvSourceFluent<?> fluent;

  public V1ConfigMapEnvSourceBuilder() {
    this(new V1ConfigMapEnvSource());
  }
  
  public V1ConfigMapEnvSourceBuilder(V1ConfigMapEnvSourceFluent<?> fluent) {
    this(fluent, new V1ConfigMapEnvSource());
  }
  
  public V1ConfigMapEnvSourceBuilder(V1ConfigMapEnvSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ConfigMapEnvSourceBuilder(V1ConfigMapEnvSourceFluent<?> fluent,V1ConfigMapEnvSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ConfigMapEnvSource build() {
    V1ConfigMapEnvSource buildable = new V1ConfigMapEnvSource();
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  
}