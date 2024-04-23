package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1StorageVersionMigrationStatusBuilder extends V1alpha1StorageVersionMigrationStatusFluent<V1alpha1StorageVersionMigrationStatusBuilder> implements VisitableBuilder<V1alpha1StorageVersionMigrationStatus,V1alpha1StorageVersionMigrationStatusBuilder>{
  public V1alpha1StorageVersionMigrationStatusBuilder() {
    this(new V1alpha1StorageVersionMigrationStatus());
  }
  
  public V1alpha1StorageVersionMigrationStatusBuilder(V1alpha1StorageVersionMigrationStatusFluent<?> fluent) {
    this(fluent, new V1alpha1StorageVersionMigrationStatus());
  }
  
  public V1alpha1StorageVersionMigrationStatusBuilder(V1alpha1StorageVersionMigrationStatusFluent<?> fluent,V1alpha1StorageVersionMigrationStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1StorageVersionMigrationStatusBuilder(V1alpha1StorageVersionMigrationStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1StorageVersionMigrationStatusFluent<?> fluent;
  
  public V1alpha1StorageVersionMigrationStatus build() {
    V1alpha1StorageVersionMigrationStatus buildable = new V1alpha1StorageVersionMigrationStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setResourceVersion(fluent.getResourceVersion());
    return buildable;
  }
  

}