package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ISCSIVolumeSourceBuilder extends V1ISCSIVolumeSourceFluent<V1ISCSIVolumeSourceBuilder> implements VisitableBuilder<V1ISCSIVolumeSource,V1ISCSIVolumeSourceBuilder>{
  public V1ISCSIVolumeSourceBuilder() {
    this(new V1ISCSIVolumeSource());
  }
  
  public V1ISCSIVolumeSourceBuilder(V1ISCSIVolumeSourceFluent<?> fluent) {
    this(fluent, new V1ISCSIVolumeSource());
  }
  
  public V1ISCSIVolumeSourceBuilder(V1ISCSIVolumeSourceFluent<?> fluent,V1ISCSIVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ISCSIVolumeSourceBuilder(V1ISCSIVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ISCSIVolumeSourceFluent<?> fluent;
  
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
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setTargetPortal(fluent.getTargetPortal());
    return buildable;
  }
  

}