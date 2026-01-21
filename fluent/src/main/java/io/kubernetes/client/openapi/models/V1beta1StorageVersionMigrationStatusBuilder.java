package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1StorageVersionMigrationStatusBuilder extends V1beta1StorageVersionMigrationStatusFluent<V1beta1StorageVersionMigrationStatusBuilder> implements VisitableBuilder<V1beta1StorageVersionMigrationStatus,V1beta1StorageVersionMigrationStatusBuilder>{

  V1beta1StorageVersionMigrationStatusFluent<?> fluent;

  public V1beta1StorageVersionMigrationStatusBuilder() {
    this(new V1beta1StorageVersionMigrationStatus());
  }
  
  public V1beta1StorageVersionMigrationStatusBuilder(V1beta1StorageVersionMigrationStatusFluent<?> fluent) {
    this(fluent, new V1beta1StorageVersionMigrationStatus());
  }
  
  public V1beta1StorageVersionMigrationStatusBuilder(V1beta1StorageVersionMigrationStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1StorageVersionMigrationStatusBuilder(V1beta1StorageVersionMigrationStatusFluent<?> fluent,V1beta1StorageVersionMigrationStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1StorageVersionMigrationStatus build() {
    V1beta1StorageVersionMigrationStatus buildable = new V1beta1StorageVersionMigrationStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setResourceVersion(fluent.getResourceVersion());
    return buildable;
  }
  
}