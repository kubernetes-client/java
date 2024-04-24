package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1StorageVersionMigrationSpecBuilder extends V1alpha1StorageVersionMigrationSpecFluent<V1alpha1StorageVersionMigrationSpecBuilder> implements VisitableBuilder<V1alpha1StorageVersionMigrationSpec,V1alpha1StorageVersionMigrationSpecBuilder>{
  public V1alpha1StorageVersionMigrationSpecBuilder() {
    this(new V1alpha1StorageVersionMigrationSpec());
  }
  
  public V1alpha1StorageVersionMigrationSpecBuilder(V1alpha1StorageVersionMigrationSpecFluent<?> fluent) {
    this(fluent, new V1alpha1StorageVersionMigrationSpec());
  }
  
  public V1alpha1StorageVersionMigrationSpecBuilder(V1alpha1StorageVersionMigrationSpecFluent<?> fluent,V1alpha1StorageVersionMigrationSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1StorageVersionMigrationSpecBuilder(V1alpha1StorageVersionMigrationSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1StorageVersionMigrationSpecFluent<?> fluent;
  
  public V1alpha1StorageVersionMigrationSpec build() {
    V1alpha1StorageVersionMigrationSpec buildable = new V1alpha1StorageVersionMigrationSpec();
    buildable.setContinueToken(fluent.getContinueToken());
    buildable.setResource(fluent.buildResource());
    return buildable;
  }
  

}