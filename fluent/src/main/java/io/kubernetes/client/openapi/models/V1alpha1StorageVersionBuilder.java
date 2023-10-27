package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1StorageVersionBuilder extends V1alpha1StorageVersionFluent<V1alpha1StorageVersionBuilder> implements VisitableBuilder<V1alpha1StorageVersion,V1alpha1StorageVersionBuilder>{
  public V1alpha1StorageVersionBuilder() {
    this(new V1alpha1StorageVersion());
  }
  
  public V1alpha1StorageVersionBuilder(V1alpha1StorageVersionFluent<?> fluent) {
    this(fluent, new V1alpha1StorageVersion());
  }
  
  public V1alpha1StorageVersionBuilder(V1alpha1StorageVersionFluent<?> fluent,V1alpha1StorageVersion instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1StorageVersionBuilder(V1alpha1StorageVersion instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1StorageVersionFluent<?> fluent;
  
  public V1alpha1StorageVersion build() {
    V1alpha1StorageVersion buildable = new V1alpha1StorageVersion();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}