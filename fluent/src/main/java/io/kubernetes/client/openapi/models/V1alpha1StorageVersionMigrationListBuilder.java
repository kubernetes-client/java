package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1StorageVersionMigrationListBuilder extends V1alpha1StorageVersionMigrationListFluent<V1alpha1StorageVersionMigrationListBuilder> implements VisitableBuilder<V1alpha1StorageVersionMigrationList,V1alpha1StorageVersionMigrationListBuilder>{
  public V1alpha1StorageVersionMigrationListBuilder() {
    this(new V1alpha1StorageVersionMigrationList());
  }
  
  public V1alpha1StorageVersionMigrationListBuilder(V1alpha1StorageVersionMigrationListFluent<?> fluent) {
    this(fluent, new V1alpha1StorageVersionMigrationList());
  }
  
  public V1alpha1StorageVersionMigrationListBuilder(V1alpha1StorageVersionMigrationListFluent<?> fluent,V1alpha1StorageVersionMigrationList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1StorageVersionMigrationListBuilder(V1alpha1StorageVersionMigrationList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1StorageVersionMigrationListFluent<?> fluent;
  
  public V1alpha1StorageVersionMigrationList build() {
    V1alpha1StorageVersionMigrationList buildable = new V1alpha1StorageVersionMigrationList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}