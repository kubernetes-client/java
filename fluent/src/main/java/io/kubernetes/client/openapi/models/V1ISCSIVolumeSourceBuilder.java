package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ISCSIVolumeSourceBuilder extends V1ISCSIVolumeSourceFluentImpl<V1ISCSIVolumeSourceBuilder> implements VisitableBuilder<V1ISCSIVolumeSource,V1ISCSIVolumeSourceBuilder>{
  public V1ISCSIVolumeSourceBuilder() {
    this(false);
  }
  public V1ISCSIVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1ISCSIVolumeSource(), validationEnabled);
  }
  public V1ISCSIVolumeSourceBuilder(V1ISCSIVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ISCSIVolumeSourceBuilder(V1ISCSIVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ISCSIVolumeSource(), validationEnabled);
  }
  public V1ISCSIVolumeSourceBuilder(V1ISCSIVolumeSourceFluent<?> fluent,V1ISCSIVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1ISCSIVolumeSourceBuilder(V1ISCSIVolumeSourceFluent<?> fluent,V1ISCSIVolumeSource instance,Boolean validationEnabled) {
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
  public V1ISCSIVolumeSourceBuilder(V1ISCSIVolumeSource instance) {
    this(instance,false);
  }
  public V1ISCSIVolumeSourceBuilder(V1ISCSIVolumeSource instance,Boolean validationEnabled) {
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
  V1ISCSIVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1ISCSIVolumeSource build() {
    V1ISCSIVolumeSource buildable = new V1ISCSIVolumeSource();
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