package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ISCSIPersistentVolumeSourceBuilder extends V1ISCSIPersistentVolumeSourceFluentImpl<V1ISCSIPersistentVolumeSourceBuilder> implements VisitableBuilder<V1ISCSIPersistentVolumeSource,V1ISCSIPersistentVolumeSourceBuilder>{
  public V1ISCSIPersistentVolumeSourceBuilder() {
    this(false);
  }
  public V1ISCSIPersistentVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1ISCSIPersistentVolumeSource(), validationEnabled);
  }
  public V1ISCSIPersistentVolumeSourceBuilder(V1ISCSIPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ISCSIPersistentVolumeSourceBuilder(V1ISCSIPersistentVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ISCSIPersistentVolumeSource(), validationEnabled);
  }
  public V1ISCSIPersistentVolumeSourceBuilder(V1ISCSIPersistentVolumeSourceFluent<?> fluent,V1ISCSIPersistentVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1ISCSIPersistentVolumeSourceBuilder(V1ISCSIPersistentVolumeSourceFluent<?> fluent,V1ISCSIPersistentVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withChapAuthDiscovery(instance.getChapAuthDiscovery());

    fluent.withChapAuthSession(instance.getChapAuthSession());

    fluent.withFsType(instance.getFsType());

    fluent.withInitiatorName(instance.getInitiatorName());

    fluent.withIqn(instance.getIqn());

    fluent.withIscsiInterface(instance.getIscsiInterface());

    fluent.withLun(instance.getLun());

    fluent.withPortals(instance.getPortals());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretRef(instance.getSecretRef());

    fluent.withTargetPortal(instance.getTargetPortal());

    this.validationEnabled = validationEnabled; 
  }
  public V1ISCSIPersistentVolumeSourceBuilder(V1ISCSIPersistentVolumeSource instance) {
    this(instance,false);
  }
  public V1ISCSIPersistentVolumeSourceBuilder(V1ISCSIPersistentVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withChapAuthDiscovery(instance.getChapAuthDiscovery());

    this.withChapAuthSession(instance.getChapAuthSession());

    this.withFsType(instance.getFsType());

    this.withInitiatorName(instance.getInitiatorName());

    this.withIqn(instance.getIqn());

    this.withIscsiInterface(instance.getIscsiInterface());

    this.withLun(instance.getLun());

    this.withPortals(instance.getPortals());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.withTargetPortal(instance.getTargetPortal());

    this.validationEnabled = validationEnabled; 
  }
  V1ISCSIPersistentVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1ISCSIPersistentVolumeSource build() {
    V1ISCSIPersistentVolumeSource buildable = new V1ISCSIPersistentVolumeSource();
    buildable.setChapAuthDiscovery(fluent.getChapAuthDiscovery());
    buildable.setChapAuthSession(fluent.getChapAuthSession());
    buildable.setFsType(fluent.getFsType());
    buildable.setInitiatorName(fluent.getInitiatorName());
    buildable.setIqn(fluent.getIqn());
    buildable.setIscsiInterface(fluent.getIscsiInterface());
    buildable.setLun(fluent.getLun());
    buildable.setPortals(fluent.getPortals());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.getSecretRef());
    buildable.setTargetPortal(fluent.getTargetPortal());
    return buildable;
  }
  
}