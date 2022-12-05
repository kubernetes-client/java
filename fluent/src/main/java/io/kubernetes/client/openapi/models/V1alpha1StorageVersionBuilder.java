package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1StorageVersionBuilder extends V1alpha1StorageVersionFluentImpl<V1alpha1StorageVersionBuilder> implements VisitableBuilder<V1alpha1StorageVersion,V1alpha1StorageVersionBuilder>{
  public V1alpha1StorageVersionBuilder() {
    this(false);
  }
  public V1alpha1StorageVersionBuilder(Boolean validationEnabled) {
    this(new V1alpha1StorageVersion(), validationEnabled);
  }
  public V1alpha1StorageVersionBuilder(V1alpha1StorageVersionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1StorageVersionBuilder(V1alpha1StorageVersionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1StorageVersion(), validationEnabled);
  }
  public V1alpha1StorageVersionBuilder(V1alpha1StorageVersionFluent<?> fluent,V1alpha1StorageVersion instance) {
    this(fluent, instance, false);
  }
  public V1alpha1StorageVersionBuilder(V1alpha1StorageVersionFluent<?> fluent,V1alpha1StorageVersion instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1StorageVersionBuilder(V1alpha1StorageVersion instance) {
    this(instance,false);
  }
  public V1alpha1StorageVersionBuilder(V1alpha1StorageVersion instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1alpha1StorageVersionFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1StorageVersion build() {
    V1alpha1StorageVersion buildable = new V1alpha1StorageVersion();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}