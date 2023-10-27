package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ISCSIPersistentVolumeSourceBuilder extends V1ISCSIPersistentVolumeSourceFluent<V1ISCSIPersistentVolumeSourceBuilder> implements VisitableBuilder<V1ISCSIPersistentVolumeSource,V1ISCSIPersistentVolumeSourceBuilder>{
  public V1ISCSIPersistentVolumeSourceBuilder() {
    this(new V1ISCSIPersistentVolumeSource());
  }
  
  public V1ISCSIPersistentVolumeSourceBuilder(V1ISCSIPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, new V1ISCSIPersistentVolumeSource());
  }
  
  public V1ISCSIPersistentVolumeSourceBuilder(V1ISCSIPersistentVolumeSourceFluent<?> fluent,V1ISCSIPersistentVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ISCSIPersistentVolumeSourceBuilder(V1ISCSIPersistentVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ISCSIPersistentVolumeSourceFluent<?> fluent;
  
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
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setTargetPortal(fluent.getTargetPortal());
    return buildable;
  }
  

}