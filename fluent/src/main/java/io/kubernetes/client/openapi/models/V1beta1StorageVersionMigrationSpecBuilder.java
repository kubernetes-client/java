package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1StorageVersionMigrationSpecBuilder extends V1beta1StorageVersionMigrationSpecFluent<V1beta1StorageVersionMigrationSpecBuilder> implements VisitableBuilder<V1beta1StorageVersionMigrationSpec,V1beta1StorageVersionMigrationSpecBuilder>{

  V1beta1StorageVersionMigrationSpecFluent<?> fluent;

  public V1beta1StorageVersionMigrationSpecBuilder() {
    this(new V1beta1StorageVersionMigrationSpec());
  }
  
  public V1beta1StorageVersionMigrationSpecBuilder(V1beta1StorageVersionMigrationSpecFluent<?> fluent) {
    this(fluent, new V1beta1StorageVersionMigrationSpec());
  }
  
  public V1beta1StorageVersionMigrationSpecBuilder(V1beta1StorageVersionMigrationSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1StorageVersionMigrationSpecBuilder(V1beta1StorageVersionMigrationSpecFluent<?> fluent,V1beta1StorageVersionMigrationSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1StorageVersionMigrationSpec build() {
    V1beta1StorageVersionMigrationSpec buildable = new V1beta1StorageVersionMigrationSpec();
    buildable.setResource(fluent.buildResource());
    return buildable;
  }
  
}