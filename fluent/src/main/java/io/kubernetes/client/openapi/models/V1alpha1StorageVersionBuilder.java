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
public class V1alpha1StorageVersionBuilder extends V1alpha1StorageVersionFluent<V1alpha1StorageVersionBuilder> implements VisitableBuilder<V1alpha1StorageVersion,V1alpha1StorageVersionBuilder>{

  V1alpha1StorageVersionFluent<?> fluent;

  public V1alpha1StorageVersionBuilder() {
    this(new V1alpha1StorageVersion());
  }
  
  public V1alpha1StorageVersionBuilder(V1alpha1StorageVersionFluent<?> fluent) {
    this(fluent, new V1alpha1StorageVersion());
  }
  
  public V1alpha1StorageVersionBuilder(V1alpha1StorageVersion instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1StorageVersionBuilder(V1alpha1StorageVersionFluent<?> fluent,V1alpha1StorageVersion instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1StorageVersion build() {
    V1alpha1StorageVersion buildable = new V1alpha1StorageVersion();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  
}