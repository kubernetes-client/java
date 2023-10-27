package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder extends V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder> implements VisitableBuilder<V1StatefulSetPersistentVolumeClaimRetentionPolicy,V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder>{
  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder() {
    this(new V1StatefulSetPersistentVolumeClaimRetentionPolicy());
  }
  
  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<?> fluent) {
    this(fluent, new V1StatefulSetPersistentVolumeClaimRetentionPolicy());
  }
  
  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<?> fluent,V1StatefulSetPersistentVolumeClaimRetentionPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(V1StatefulSetPersistentVolumeClaimRetentionPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<?> fluent;
  
  public V1StatefulSetPersistentVolumeClaimRetentionPolicy build() {
    V1StatefulSetPersistentVolumeClaimRetentionPolicy buildable = new V1StatefulSetPersistentVolumeClaimRetentionPolicy();
    buildable.setWhenDeleted(fluent.getWhenDeleted());
    buildable.setWhenScaled(fluent.getWhenScaled());
    return buildable;
  }
  

}