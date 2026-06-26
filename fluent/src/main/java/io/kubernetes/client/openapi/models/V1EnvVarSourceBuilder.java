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
public class V1EnvVarSourceBuilder extends V1EnvVarSourceFluent<V1EnvVarSourceBuilder> implements VisitableBuilder<V1EnvVarSource,V1EnvVarSourceBuilder>{

  V1EnvVarSourceFluent<?> fluent;

  public V1EnvVarSourceBuilder() {
    this(new V1EnvVarSource());
  }
  
  public V1EnvVarSourceBuilder(V1EnvVarSourceFluent<?> fluent) {
    this(fluent, new V1EnvVarSource());
  }
  
  public V1EnvVarSourceBuilder(V1EnvVarSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1EnvVarSourceBuilder(V1EnvVarSourceFluent<?> fluent,V1EnvVarSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1EnvVarSource build() {
    V1EnvVarSource buildable = new V1EnvVarSource();
    buildable.setConfigMapKeyRef(fluent.buildConfigMapKeyRef());
    buildable.setFieldRef(fluent.buildFieldRef());
    buildable.setFileKeyRef(fluent.buildFileKeyRef());
    buildable.setResourceFieldRef(fluent.buildResourceFieldRef());
    buildable.setSecretKeyRef(fluent.buildSecretKeyRef());
    return buildable;
  }
  
}