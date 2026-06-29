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
public class V1GlusterfsPersistentVolumeSourceBuilder extends V1GlusterfsPersistentVolumeSourceFluent<V1GlusterfsPersistentVolumeSourceBuilder> implements VisitableBuilder<V1GlusterfsPersistentVolumeSource,V1GlusterfsPersistentVolumeSourceBuilder>{

  V1GlusterfsPersistentVolumeSourceFluent<?> fluent;

  public V1GlusterfsPersistentVolumeSourceBuilder() {
    this(new V1GlusterfsPersistentVolumeSource());
  }
  
  public V1GlusterfsPersistentVolumeSourceBuilder(V1GlusterfsPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, new V1GlusterfsPersistentVolumeSource());
  }
  
  public V1GlusterfsPersistentVolumeSourceBuilder(V1GlusterfsPersistentVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1GlusterfsPersistentVolumeSourceBuilder(V1GlusterfsPersistentVolumeSourceFluent<?> fluent,V1GlusterfsPersistentVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1GlusterfsPersistentVolumeSource build() {
    V1GlusterfsPersistentVolumeSource buildable = new V1GlusterfsPersistentVolumeSource();
    buildable.setEndpoints(fluent.getEndpoints());
    buildable.setEndpointsNamespace(fluent.getEndpointsNamespace());
    buildable.setPath(fluent.getPath());
    buildable.setReadOnly(fluent.getReadOnly());
    return buildable;
  }
  
}