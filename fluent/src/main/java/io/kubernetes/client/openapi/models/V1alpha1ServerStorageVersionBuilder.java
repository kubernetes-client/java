package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1ServerStorageVersionBuilder extends V1alpha1ServerStorageVersionFluentImpl<V1alpha1ServerStorageVersionBuilder> implements VisitableBuilder<V1alpha1ServerStorageVersion,V1alpha1ServerStorageVersionBuilder>{
  public V1alpha1ServerStorageVersionBuilder() {
    this(false);
  }
  public V1alpha1ServerStorageVersionBuilder(Boolean validationEnabled) {
    this(new V1alpha1ServerStorageVersion(), validationEnabled);
  }
  public V1alpha1ServerStorageVersionBuilder(V1alpha1ServerStorageVersionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1ServerStorageVersionBuilder(V1alpha1ServerStorageVersionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1ServerStorageVersion(), validationEnabled);
  }
  public V1alpha1ServerStorageVersionBuilder(V1alpha1ServerStorageVersionFluent<?> fluent,V1alpha1ServerStorageVersion instance) {
    this(fluent, instance, false);
  }
  public V1alpha1ServerStorageVersionBuilder(V1alpha1ServerStorageVersionFluent<?> fluent,V1alpha1ServerStorageVersion instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiServerID(instance.getApiServerID());

    fluent.withDecodableVersions(instance.getDecodableVersions());

    fluent.withEncodingVersion(instance.getEncodingVersion());

    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1ServerStorageVersionBuilder(V1alpha1ServerStorageVersion instance) {
    this(instance,false);
  }
  public V1alpha1ServerStorageVersionBuilder(V1alpha1ServerStorageVersion instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiServerID(instance.getApiServerID());

    this.withDecodableVersions(instance.getDecodableVersions());

    this.withEncodingVersion(instance.getEncodingVersion());

    this.validationEnabled = validationEnabled; 
  }
  V1alpha1ServerStorageVersionFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1ServerStorageVersion build() {
    V1alpha1ServerStorageVersion buildable = new V1alpha1ServerStorageVersion();
    buildable.setApiServerID(fluent.getApiServerID());
    buildable.setDecodableVersions(fluent.getDecodableVersions());
    buildable.setEncodingVersion(fluent.getEncodingVersion());
    return buildable;
  }
  
}