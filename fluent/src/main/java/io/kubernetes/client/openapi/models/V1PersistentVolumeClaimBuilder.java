package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PersistentVolumeClaimBuilder extends V1PersistentVolumeClaimFluentImpl<V1PersistentVolumeClaimBuilder> implements VisitableBuilder<V1PersistentVolumeClaim,V1PersistentVolumeClaimBuilder>{
  public V1PersistentVolumeClaimBuilder() {
    this(false);
  }
  public V1PersistentVolumeClaimBuilder(Boolean validationEnabled) {
    this(new V1PersistentVolumeClaim(), validationEnabled);
  }
  public V1PersistentVolumeClaimBuilder(V1PersistentVolumeClaimFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PersistentVolumeClaimBuilder(V1PersistentVolumeClaimFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PersistentVolumeClaim(), validationEnabled);
  }
  public V1PersistentVolumeClaimBuilder(V1PersistentVolumeClaimFluent<?> fluent,V1PersistentVolumeClaim instance) {
    this(fluent, instance, false);
  }
  public V1PersistentVolumeClaimBuilder(V1PersistentVolumeClaimFluent<?> fluent,V1PersistentVolumeClaim instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1PersistentVolumeClaimBuilder(V1PersistentVolumeClaim instance) {
    this(instance,false);
  }
  public V1PersistentVolumeClaimBuilder(V1PersistentVolumeClaim instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1PersistentVolumeClaimFluent<?> fluent;
  Boolean validationEnabled;
  public V1PersistentVolumeClaim build() {
    V1PersistentVolumeClaim buildable = new V1PersistentVolumeClaim();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}