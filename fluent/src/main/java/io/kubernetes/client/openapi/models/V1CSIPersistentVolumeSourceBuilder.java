package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CSIPersistentVolumeSourceBuilder extends V1CSIPersistentVolumeSourceFluentImpl<V1CSIPersistentVolumeSourceBuilder> implements VisitableBuilder<V1CSIPersistentVolumeSource,V1CSIPersistentVolumeSourceBuilder>{
  public V1CSIPersistentVolumeSourceBuilder() {
    this(false);
  }
  public V1CSIPersistentVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1CSIPersistentVolumeSource(), validationEnabled);
  }
  public V1CSIPersistentVolumeSourceBuilder(V1CSIPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CSIPersistentVolumeSourceBuilder(V1CSIPersistentVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CSIPersistentVolumeSource(), validationEnabled);
  }
  public V1CSIPersistentVolumeSourceBuilder(V1CSIPersistentVolumeSourceFluent<?> fluent,V1CSIPersistentVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1CSIPersistentVolumeSourceBuilder(V1CSIPersistentVolumeSourceFluent<?> fluent,V1CSIPersistentVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withControllerExpandSecretRef(instance.getControllerExpandSecretRef());

    fluent.withControllerPublishSecretRef(instance.getControllerPublishSecretRef());

    fluent.withDriver(instance.getDriver());

    fluent.withFsType(instance.getFsType());

    fluent.withNodeExpandSecretRef(instance.getNodeExpandSecretRef());

    fluent.withNodePublishSecretRef(instance.getNodePublishSecretRef());

    fluent.withNodeStageSecretRef(instance.getNodeStageSecretRef());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withVolumeAttributes(instance.getVolumeAttributes());

    fluent.withVolumeHandle(instance.getVolumeHandle());

    this.validationEnabled = validationEnabled; 
  }
  public V1CSIPersistentVolumeSourceBuilder(V1CSIPersistentVolumeSource instance) {
    this(instance,false);
  }
  public V1CSIPersistentVolumeSourceBuilder(V1CSIPersistentVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withControllerExpandSecretRef(instance.getControllerExpandSecretRef());

    this.withControllerPublishSecretRef(instance.getControllerPublishSecretRef());

    this.withDriver(instance.getDriver());

    this.withFsType(instance.getFsType());

    this.withNodeExpandSecretRef(instance.getNodeExpandSecretRef());

    this.withNodePublishSecretRef(instance.getNodePublishSecretRef());

    this.withNodeStageSecretRef(instance.getNodeStageSecretRef());

    this.withReadOnly(instance.getReadOnly());

    this.withVolumeAttributes(instance.getVolumeAttributes());

    this.withVolumeHandle(instance.getVolumeHandle());

    this.validationEnabled = validationEnabled; 
  }
  V1CSIPersistentVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1CSIPersistentVolumeSource build() {
    V1CSIPersistentVolumeSource buildable = new V1CSIPersistentVolumeSource();
    buildable.setControllerExpandSecretRef(fluent.getControllerExpandSecretRef());
    buildable.setControllerPublishSecretRef(fluent.getControllerPublishSecretRef());
    buildable.setDriver(fluent.getDriver());
    buildable.setFsType(fluent.getFsType());
    buildable.setNodeExpandSecretRef(fluent.getNodeExpandSecretRef());
    buildable.setNodePublishSecretRef(fluent.getNodePublishSecretRef());
    buildable.setNodeStageSecretRef(fluent.getNodeStageSecretRef());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setVolumeAttributes(fluent.getVolumeAttributes());
    buildable.setVolumeHandle(fluent.getVolumeHandle());
    return buildable;
  }
  
}