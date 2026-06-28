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
public class V1AzureFilePersistentVolumeSourceBuilder extends V1AzureFilePersistentVolumeSourceFluent<V1AzureFilePersistentVolumeSourceBuilder> implements VisitableBuilder<V1AzureFilePersistentVolumeSource,V1AzureFilePersistentVolumeSourceBuilder>{

  V1AzureFilePersistentVolumeSourceFluent<?> fluent;

  public V1AzureFilePersistentVolumeSourceBuilder() {
    this(new V1AzureFilePersistentVolumeSource());
  }
  
  public V1AzureFilePersistentVolumeSourceBuilder(V1AzureFilePersistentVolumeSourceFluent<?> fluent) {
    this(fluent, new V1AzureFilePersistentVolumeSource());
  }
  
  public V1AzureFilePersistentVolumeSourceBuilder(V1AzureFilePersistentVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1AzureFilePersistentVolumeSourceBuilder(V1AzureFilePersistentVolumeSourceFluent<?> fluent,V1AzureFilePersistentVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1AzureFilePersistentVolumeSource build() {
    V1AzureFilePersistentVolumeSource buildable = new V1AzureFilePersistentVolumeSource();
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretName(fluent.getSecretName());
    buildable.setSecretNamespace(fluent.getSecretNamespace());
    buildable.setShareName(fluent.getShareName());
    return buildable;
  }
  
}