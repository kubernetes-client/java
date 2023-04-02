package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CSIVolumeSourceBuilder extends V1CSIVolumeSourceFluentImpl<V1CSIVolumeSourceBuilder> implements VisitableBuilder<V1CSIVolumeSource,V1CSIVolumeSourceBuilder>{
  public V1CSIVolumeSourceBuilder() {
    this(false);
  }
  public V1CSIVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1CSIVolumeSource(), validationEnabled);
  }
  public V1CSIVolumeSourceBuilder(V1CSIVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CSIVolumeSourceBuilder(V1CSIVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CSIVolumeSource(), validationEnabled);
  }
  public V1CSIVolumeSourceBuilder(V1CSIVolumeSourceFluent<?> fluent,V1CSIVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1CSIVolumeSourceBuilder(V1CSIVolumeSourceFluent<?> fluent,V1CSIVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDriver(instance.getDriver());

    fluent.withFsType(instance.getFsType());

    fluent.withNodePublishSecretRef(instance.getNodePublishSecretRef());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withVolumeAttributes(instance.getVolumeAttributes());

    this.validationEnabled = validationEnabled; 
  }
  public V1CSIVolumeSourceBuilder(V1CSIVolumeSource instance) {
    this(instance,false);
  }
  public V1CSIVolumeSourceBuilder(V1CSIVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withDriver(instance.getDriver());

    this.withFsType(instance.getFsType());

    this.withNodePublishSecretRef(instance.getNodePublishSecretRef());

    this.withReadOnly(instance.getReadOnly());

    this.withVolumeAttributes(instance.getVolumeAttributes());

    this.validationEnabled = validationEnabled; 
  }
  V1CSIVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1CSIVolumeSource build() {
    V1CSIVolumeSource buildable = new V1CSIVolumeSource();
    buildable.setDriver(fluent.getDriver());
    buildable.setFsType(fluent.getFsType());
    buildable.setNodePublishSecretRef(fluent.getNodePublishSecretRef());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setVolumeAttributes(fluent.getVolumeAttributes());
    return buildable;
  }
  
}