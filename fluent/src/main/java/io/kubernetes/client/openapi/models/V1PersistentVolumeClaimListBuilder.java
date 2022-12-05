package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PersistentVolumeClaimListBuilder extends V1PersistentVolumeClaimListFluentImpl<V1PersistentVolumeClaimListBuilder> implements VisitableBuilder<V1PersistentVolumeClaimList,V1PersistentVolumeClaimListBuilder>{
  public V1PersistentVolumeClaimListBuilder() {
    this(false);
  }
  public V1PersistentVolumeClaimListBuilder(Boolean validationEnabled) {
    this(new V1PersistentVolumeClaimList(), validationEnabled);
  }
  public V1PersistentVolumeClaimListBuilder(V1PersistentVolumeClaimListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PersistentVolumeClaimListBuilder(V1PersistentVolumeClaimListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PersistentVolumeClaimList(), validationEnabled);
  }
  public V1PersistentVolumeClaimListBuilder(V1PersistentVolumeClaimListFluent<?> fluent,V1PersistentVolumeClaimList instance) {
    this(fluent, instance, false);
  }
  public V1PersistentVolumeClaimListBuilder(V1PersistentVolumeClaimListFluent<?> fluent,V1PersistentVolumeClaimList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1PersistentVolumeClaimListBuilder(V1PersistentVolumeClaimList instance) {
    this(instance,false);
  }
  public V1PersistentVolumeClaimListBuilder(V1PersistentVolumeClaimList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1PersistentVolumeClaimListFluent<?> fluent;
  Boolean validationEnabled;
  public V1PersistentVolumeClaimList build() {
    V1PersistentVolumeClaimList buildable = new V1PersistentVolumeClaimList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}