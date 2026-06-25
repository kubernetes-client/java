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
public class V1EnvVarBuilder extends V1EnvVarFluent<V1EnvVarBuilder> implements VisitableBuilder<V1EnvVar,V1EnvVarBuilder>{

  V1EnvVarFluent<?> fluent;

  public V1EnvVarBuilder() {
    this(new V1EnvVar());
  }
  
  public V1EnvVarBuilder(V1EnvVarFluent<?> fluent) {
    this(fluent, new V1EnvVar());
  }
  
  public V1EnvVarBuilder(V1EnvVar instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1EnvVarBuilder(V1EnvVarFluent<?> fluent,V1EnvVar instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1EnvVar build() {
    V1EnvVar buildable = new V1EnvVar();
    buildable.setName(fluent.getName());
    buildable.setValue(fluent.getValue());
    buildable.setValueFrom(fluent.buildValueFrom());
    return buildable;
  }
  
}