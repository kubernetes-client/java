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
import javax.annotation.processing.Generated;
@Generated("io.sundr:builder-annotations")
public class V1StorageVersionMigrationListBuilder extends V1StorageVersionMigrationListFluent<V1StorageVersionMigrationListBuilder> implements VisitableBuilder<V1StorageVersionMigrationList,V1StorageVersionMigrationListBuilder>{

  V1StorageVersionMigrationListFluent<?> fluent;

  public V1StorageVersionMigrationListBuilder() {
    this(new V1StorageVersionMigrationList());
  }
  
  public V1StorageVersionMigrationListBuilder(V1StorageVersionMigrationListFluent<?> fluent) {
    this(fluent, new V1StorageVersionMigrationList());
  }
  
  public V1StorageVersionMigrationListBuilder(V1StorageVersionMigrationList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1StorageVersionMigrationListBuilder(V1StorageVersionMigrationListFluent<?> fluent,V1StorageVersionMigrationList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1StorageVersionMigrationList build() {
    V1StorageVersionMigrationList buildable = new V1StorageVersionMigrationList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}