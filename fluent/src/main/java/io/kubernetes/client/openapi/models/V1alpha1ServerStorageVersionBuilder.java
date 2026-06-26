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
public class V1alpha1ServerStorageVersionBuilder extends V1alpha1ServerStorageVersionFluent<V1alpha1ServerStorageVersionBuilder> implements VisitableBuilder<V1alpha1ServerStorageVersion,V1alpha1ServerStorageVersionBuilder>{

  V1alpha1ServerStorageVersionFluent<?> fluent;

  public V1alpha1ServerStorageVersionBuilder() {
    this(new V1alpha1ServerStorageVersion());
  }
  
  public V1alpha1ServerStorageVersionBuilder(V1alpha1ServerStorageVersionFluent<?> fluent) {
    this(fluent, new V1alpha1ServerStorageVersion());
  }
  
  public V1alpha1ServerStorageVersionBuilder(V1alpha1ServerStorageVersion instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1ServerStorageVersionBuilder(V1alpha1ServerStorageVersionFluent<?> fluent,V1alpha1ServerStorageVersion instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1ServerStorageVersion build() {
    V1alpha1ServerStorageVersion buildable = new V1alpha1ServerStorageVersion();
    buildable.setApiServerID(fluent.getApiServerID());
    buildable.setDecodableVersions(fluent.getDecodableVersions());
    buildable.setEncodingVersion(fluent.getEncodingVersion());
    buildable.setServedVersions(fluent.getServedVersions());
    return buildable;
  }
  
}