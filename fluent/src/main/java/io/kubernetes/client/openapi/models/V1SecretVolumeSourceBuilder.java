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
public class V1SecretVolumeSourceBuilder extends V1SecretVolumeSourceFluent<V1SecretVolumeSourceBuilder> implements VisitableBuilder<V1SecretVolumeSource,V1SecretVolumeSourceBuilder>{

  V1SecretVolumeSourceFluent<?> fluent;

  public V1SecretVolumeSourceBuilder() {
    this(new V1SecretVolumeSource());
  }
  
  public V1SecretVolumeSourceBuilder(V1SecretVolumeSourceFluent<?> fluent) {
    this(fluent, new V1SecretVolumeSource());
  }
  
  public V1SecretVolumeSourceBuilder(V1SecretVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1SecretVolumeSourceBuilder(V1SecretVolumeSourceFluent<?> fluent,V1SecretVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1SecretVolumeSource build() {
    V1SecretVolumeSource buildable = new V1SecretVolumeSource();
    buildable.setDefaultMode(fluent.getDefaultMode());
    buildable.setItems(fluent.buildItems());
    buildable.setOptional(fluent.getOptional());
    buildable.setSecretName(fluent.getSecretName());
    return buildable;
  }
  
}