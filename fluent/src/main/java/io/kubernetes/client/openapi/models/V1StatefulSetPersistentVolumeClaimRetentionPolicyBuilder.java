package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder extends V1StatefulSetPersistentVolumeClaimRetentionPolicyFluentImpl<V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder> implements VisitableBuilder<V1StatefulSetPersistentVolumeClaimRetentionPolicy,V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder>{
  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder() {
    this(false);
  }
  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(Boolean validationEnabled) {
    this(new V1StatefulSetPersistentVolumeClaimRetentionPolicy(), validationEnabled);
  }
  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<?> fluent) {
    this(fluent, false);
  }
  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1StatefulSetPersistentVolumeClaimRetentionPolicy(), validationEnabled);
  }
  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<?> fluent,V1StatefulSetPersistentVolumeClaimRetentionPolicy instance) {
    this(fluent, instance, false);
  }
  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<?> fluent,V1StatefulSetPersistentVolumeClaimRetentionPolicy instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withWhenDeleted(instance.getWhenDeleted());

    fluent.withWhenScaled(instance.getWhenScaled());

    this.validationEnabled = validationEnabled; 
  }
  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(V1StatefulSetPersistentVolumeClaimRetentionPolicy instance) {
    this(instance,false);
  }
  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(V1StatefulSetPersistentVolumeClaimRetentionPolicy instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withWhenDeleted(instance.getWhenDeleted());

    this.withWhenScaled(instance.getWhenScaled());

    this.validationEnabled = validationEnabled; 
  }
  V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<?> fluent;
  Boolean validationEnabled;
  public V1StatefulSetPersistentVolumeClaimRetentionPolicy build() {
    V1StatefulSetPersistentVolumeClaimRetentionPolicy buildable = new V1StatefulSetPersistentVolumeClaimRetentionPolicy();
    buildable.setWhenDeleted(fluent.getWhenDeleted());
    buildable.setWhenScaled(fluent.getWhenScaled());
    return buildable;
  }
  
}