package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1StorageVersionMigrationBuilder extends V1alpha1StorageVersionMigrationFluent<V1alpha1StorageVersionMigrationBuilder> implements VisitableBuilder<V1alpha1StorageVersionMigration,V1alpha1StorageVersionMigrationBuilder>{
  public V1alpha1StorageVersionMigrationBuilder() {
    this(new V1alpha1StorageVersionMigration());
  }
  
  public V1alpha1StorageVersionMigrationBuilder(V1alpha1StorageVersionMigrationFluent<?> fluent) {
    this(fluent, new V1alpha1StorageVersionMigration());
  }
  
  public V1alpha1StorageVersionMigrationBuilder(V1alpha1StorageVersionMigrationFluent<?> fluent,V1alpha1StorageVersionMigration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1StorageVersionMigrationBuilder(V1alpha1StorageVersionMigration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1StorageVersionMigrationFluent<?> fluent;
  
  public V1alpha1StorageVersionMigration build() {
    V1alpha1StorageVersionMigration buildable = new V1alpha1StorageVersionMigration();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}