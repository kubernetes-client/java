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
public class V1AzureFileVolumeSourceBuilder extends V1AzureFileVolumeSourceFluent<V1AzureFileVolumeSourceBuilder> implements VisitableBuilder<V1AzureFileVolumeSource,V1AzureFileVolumeSourceBuilder>{

  V1AzureFileVolumeSourceFluent<?> fluent;

  public V1AzureFileVolumeSourceBuilder() {
    this(new V1AzureFileVolumeSource());
  }
  
  public V1AzureFileVolumeSourceBuilder(V1AzureFileVolumeSourceFluent<?> fluent) {
    this(fluent, new V1AzureFileVolumeSource());
  }
  
  public V1AzureFileVolumeSourceBuilder(V1AzureFileVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1AzureFileVolumeSourceBuilder(V1AzureFileVolumeSourceFluent<?> fluent,V1AzureFileVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1AzureFileVolumeSource build() {
    V1AzureFileVolumeSource buildable = new V1AzureFileVolumeSource();
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretName(fluent.getSecretName());
    buildable.setShareName(fluent.getShareName());
    return buildable;
  }
  
}