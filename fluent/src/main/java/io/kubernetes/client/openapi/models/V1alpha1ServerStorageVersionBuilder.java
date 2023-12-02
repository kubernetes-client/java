package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ServerStorageVersionBuilder extends V1alpha1ServerStorageVersionFluent<V1alpha1ServerStorageVersionBuilder> implements VisitableBuilder<V1alpha1ServerStorageVersion,V1alpha1ServerStorageVersionBuilder>{
  public V1alpha1ServerStorageVersionBuilder() {
    this(new V1alpha1ServerStorageVersion());
  }
  
  public V1alpha1ServerStorageVersionBuilder(V1alpha1ServerStorageVersionFluent<?> fluent) {
    this(fluent, new V1alpha1ServerStorageVersion());
  }
  
  public V1alpha1ServerStorageVersionBuilder(V1alpha1ServerStorageVersionFluent<?> fluent,V1alpha1ServerStorageVersion instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ServerStorageVersionBuilder(V1alpha1ServerStorageVersion instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ServerStorageVersionFluent<?> fluent;
  
  public V1alpha1ServerStorageVersion build() {
    V1alpha1ServerStorageVersion buildable = new V1alpha1ServerStorageVersion();
    buildable.setApiServerID(fluent.getApiServerID());
    buildable.setDecodableVersions(fluent.getDecodableVersions());
    buildable.setEncodingVersion(fluent.getEncodingVersion());
    buildable.setServedVersions(fluent.getServedVersions());
    return buildable;
  }
  

}