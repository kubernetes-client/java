package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1StorageVersionStatusBuilder extends V1alpha1StorageVersionStatusFluent<V1alpha1StorageVersionStatusBuilder> implements VisitableBuilder<V1alpha1StorageVersionStatus,V1alpha1StorageVersionStatusBuilder>{
  public V1alpha1StorageVersionStatusBuilder() {
    this(new V1alpha1StorageVersionStatus());
  }
  
  public V1alpha1StorageVersionStatusBuilder(V1alpha1StorageVersionStatusFluent<?> fluent) {
    this(fluent, new V1alpha1StorageVersionStatus());
  }
  
  public V1alpha1StorageVersionStatusBuilder(V1alpha1StorageVersionStatusFluent<?> fluent,V1alpha1StorageVersionStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1StorageVersionStatusBuilder(V1alpha1StorageVersionStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1StorageVersionStatusFluent<?> fluent;
  
  public V1alpha1StorageVersionStatus build() {
    V1alpha1StorageVersionStatus buildable = new V1alpha1StorageVersionStatus();
    buildable.setCommonEncodingVersion(fluent.getCommonEncodingVersion());
    buildable.setConditions(fluent.buildConditions());
    buildable.setStorageVersions(fluent.buildStorageVersions());
    return buildable;
  }
  

}