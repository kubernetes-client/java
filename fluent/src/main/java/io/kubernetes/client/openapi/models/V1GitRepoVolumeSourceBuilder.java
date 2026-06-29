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
public class V1GitRepoVolumeSourceBuilder extends V1GitRepoVolumeSourceFluent<V1GitRepoVolumeSourceBuilder> implements VisitableBuilder<V1GitRepoVolumeSource,V1GitRepoVolumeSourceBuilder>{

  V1GitRepoVolumeSourceFluent<?> fluent;

  public V1GitRepoVolumeSourceBuilder() {
    this(new V1GitRepoVolumeSource());
  }
  
  public V1GitRepoVolumeSourceBuilder(V1GitRepoVolumeSourceFluent<?> fluent) {
    this(fluent, new V1GitRepoVolumeSource());
  }
  
  public V1GitRepoVolumeSourceBuilder(V1GitRepoVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1GitRepoVolumeSourceBuilder(V1GitRepoVolumeSourceFluent<?> fluent,V1GitRepoVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1GitRepoVolumeSource build() {
    V1GitRepoVolumeSource buildable = new V1GitRepoVolumeSource();
    buildable.setDirectory(fluent.getDirectory());
    buildable.setRepository(fluent.getRepository());
    buildable.setRevision(fluent.getRevision());
    return buildable;
  }
  
}