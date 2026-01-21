package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1StorageVersionMigrationBuilder extends V1beta1StorageVersionMigrationFluent<V1beta1StorageVersionMigrationBuilder> implements VisitableBuilder<V1beta1StorageVersionMigration,V1beta1StorageVersionMigrationBuilder>{

  V1beta1StorageVersionMigrationFluent<?> fluent;

  public V1beta1StorageVersionMigrationBuilder() {
    this(new V1beta1StorageVersionMigration());
  }
  
  public V1beta1StorageVersionMigrationBuilder(V1beta1StorageVersionMigrationFluent<?> fluent) {
    this(fluent, new V1beta1StorageVersionMigration());
  }
  
  public V1beta1StorageVersionMigrationBuilder(V1beta1StorageVersionMigration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1StorageVersionMigrationBuilder(V1beta1StorageVersionMigrationFluent<?> fluent,V1beta1StorageVersionMigration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1StorageVersionMigration build() {
    V1beta1StorageVersionMigration buildable = new V1beta1StorageVersionMigration();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  
}