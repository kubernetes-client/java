package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1StorageVersionStatusBuilder extends V1alpha1StorageVersionStatusFluentImpl<V1alpha1StorageVersionStatusBuilder> implements VisitableBuilder<V1alpha1StorageVersionStatus,V1alpha1StorageVersionStatusBuilder>{
  public V1alpha1StorageVersionStatusBuilder() {
    this(false);
  }
  public V1alpha1StorageVersionStatusBuilder(Boolean validationEnabled) {
    this(new V1alpha1StorageVersionStatus(), validationEnabled);
  }
  public V1alpha1StorageVersionStatusBuilder(V1alpha1StorageVersionStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1StorageVersionStatusBuilder(V1alpha1StorageVersionStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1StorageVersionStatus(), validationEnabled);
  }
  public V1alpha1StorageVersionStatusBuilder(V1alpha1StorageVersionStatusFluent<?> fluent,V1alpha1StorageVersionStatus instance) {
    this(fluent, instance, false);
  }
  public V1alpha1StorageVersionStatusBuilder(V1alpha1StorageVersionStatusFluent<?> fluent,V1alpha1StorageVersionStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCommonEncodingVersion(instance.getCommonEncodingVersion());

    fluent.withConditions(instance.getConditions());

    fluent.withStorageVersions(instance.getStorageVersions());

    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1StorageVersionStatusBuilder(V1alpha1StorageVersionStatus instance) {
    this(instance,false);
  }
  public V1alpha1StorageVersionStatusBuilder(V1alpha1StorageVersionStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withCommonEncodingVersion(instance.getCommonEncodingVersion());

    this.withConditions(instance.getConditions());

    this.withStorageVersions(instance.getStorageVersions());

    this.validationEnabled = validationEnabled; 
  }
  V1alpha1StorageVersionStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1StorageVersionStatus build() {
    V1alpha1StorageVersionStatus buildable = new V1alpha1StorageVersionStatus();
    buildable.setCommonEncodingVersion(fluent.getCommonEncodingVersion());
    buildable.setConditions(fluent.getConditions());
    buildable.setStorageVersions(fluent.getStorageVersions());
    return buildable;
  }
  
}