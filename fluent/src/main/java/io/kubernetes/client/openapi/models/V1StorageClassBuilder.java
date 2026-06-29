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
public class V1StorageClassBuilder extends V1StorageClassFluent<V1StorageClassBuilder> implements VisitableBuilder<V1StorageClass,V1StorageClassBuilder>{

  V1StorageClassFluent<?> fluent;

  public V1StorageClassBuilder() {
    this(new V1StorageClass());
  }
  
  public V1StorageClassBuilder(V1StorageClassFluent<?> fluent) {
    this(fluent, new V1StorageClass());
  }
  
  public V1StorageClassBuilder(V1StorageClass instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1StorageClassBuilder(V1StorageClassFluent<?> fluent,V1StorageClass instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1StorageClass build() {
    V1StorageClass buildable = new V1StorageClass();
    buildable.setAllowVolumeExpansion(fluent.getAllowVolumeExpansion());
    buildable.setAllowedTopologies(fluent.buildAllowedTopologies());
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setMountOptions(fluent.getMountOptions());
    buildable.setParameters(fluent.getParameters());
    buildable.setProvisioner(fluent.getProvisioner());
    buildable.setReclaimPolicy(fluent.getReclaimPolicy());
    buildable.setVolumeBindingMode(fluent.getVolumeBindingMode());
    return buildable;
  }
  
}