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
public class V1StorageVersionMigrationSpecBuilder extends V1StorageVersionMigrationSpecFluent<V1StorageVersionMigrationSpecBuilder> implements VisitableBuilder<V1StorageVersionMigrationSpec,V1StorageVersionMigrationSpecBuilder>{

  V1StorageVersionMigrationSpecFluent<?> fluent;

  public V1StorageVersionMigrationSpecBuilder() {
    this(new V1StorageVersionMigrationSpec());
  }
  
  public V1StorageVersionMigrationSpecBuilder(V1StorageVersionMigrationSpecFluent<?> fluent) {
    this(fluent, new V1StorageVersionMigrationSpec());
  }
  
  public V1StorageVersionMigrationSpecBuilder(V1StorageVersionMigrationSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1StorageVersionMigrationSpecBuilder(V1StorageVersionMigrationSpecFluent<?> fluent,V1StorageVersionMigrationSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1StorageVersionMigrationSpec build() {
    V1StorageVersionMigrationSpec buildable = new V1StorageVersionMigrationSpec();
    buildable.setResource(fluent.buildResource());
    return buildable;
  }
  
}