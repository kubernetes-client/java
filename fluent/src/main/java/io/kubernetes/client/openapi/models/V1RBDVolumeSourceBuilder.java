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
public class V1RBDVolumeSourceBuilder extends V1RBDVolumeSourceFluent<V1RBDVolumeSourceBuilder> implements VisitableBuilder<V1RBDVolumeSource,V1RBDVolumeSourceBuilder>{

  V1RBDVolumeSourceFluent<?> fluent;

  public V1RBDVolumeSourceBuilder() {
    this(new V1RBDVolumeSource());
  }
  
  public V1RBDVolumeSourceBuilder(V1RBDVolumeSourceFluent<?> fluent) {
    this(fluent, new V1RBDVolumeSource());
  }
  
  public V1RBDVolumeSourceBuilder(V1RBDVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1RBDVolumeSourceBuilder(V1RBDVolumeSourceFluent<?> fluent,V1RBDVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1RBDVolumeSource build() {
    V1RBDVolumeSource buildable = new V1RBDVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setImage(fluent.getImage());
    buildable.setKeyring(fluent.getKeyring());
    buildable.setMonitors(fluent.getMonitors());
    buildable.setPool(fluent.getPool());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setUser(fluent.getUser());
    return buildable;
  }
  
}