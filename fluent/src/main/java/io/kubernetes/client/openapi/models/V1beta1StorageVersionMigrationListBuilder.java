package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1StorageVersionMigrationListBuilder extends V1beta1StorageVersionMigrationListFluent<V1beta1StorageVersionMigrationListBuilder> implements VisitableBuilder<V1beta1StorageVersionMigrationList,V1beta1StorageVersionMigrationListBuilder>{

  V1beta1StorageVersionMigrationListFluent<?> fluent;

  public V1beta1StorageVersionMigrationListBuilder() {
    this(new V1beta1StorageVersionMigrationList());
  }
  
  public V1beta1StorageVersionMigrationListBuilder(V1beta1StorageVersionMigrationListFluent<?> fluent) {
    this(fluent, new V1beta1StorageVersionMigrationList());
  }
  
  public V1beta1StorageVersionMigrationListBuilder(V1beta1StorageVersionMigrationList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1StorageVersionMigrationListBuilder(V1beta1StorageVersionMigrationListFluent<?> fluent,V1beta1StorageVersionMigrationList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1StorageVersionMigrationList build() {
    V1beta1StorageVersionMigrationList buildable = new V1beta1StorageVersionMigrationList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}