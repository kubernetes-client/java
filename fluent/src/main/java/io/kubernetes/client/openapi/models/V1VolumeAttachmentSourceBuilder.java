package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1VolumeAttachmentSourceBuilder extends V1VolumeAttachmentSourceFluentImpl<V1VolumeAttachmentSourceBuilder> implements VisitableBuilder<V1VolumeAttachmentSource,V1VolumeAttachmentSourceBuilder>{
  public V1VolumeAttachmentSourceBuilder() {
    this(false);
  }
  public V1VolumeAttachmentSourceBuilder(Boolean validationEnabled) {
    this(new V1VolumeAttachmentSource(), validationEnabled);
  }
  public V1VolumeAttachmentSourceBuilder(V1VolumeAttachmentSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1VolumeAttachmentSourceBuilder(V1VolumeAttachmentSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1VolumeAttachmentSource(), validationEnabled);
  }
  public V1VolumeAttachmentSourceBuilder(V1VolumeAttachmentSourceFluent<?> fluent,V1VolumeAttachmentSource instance) {
    this(fluent, instance, false);
  }
  public V1VolumeAttachmentSourceBuilder(V1VolumeAttachmentSourceFluent<?> fluent,V1VolumeAttachmentSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withInlineVolumeSpec(instance.getInlineVolumeSpec());

    fluent.withPersistentVolumeName(instance.getPersistentVolumeName());

    this.validationEnabled = validationEnabled; 
  }
  public V1VolumeAttachmentSourceBuilder(V1VolumeAttachmentSource instance) {
    this(instance,false);
  }
  public V1VolumeAttachmentSourceBuilder(V1VolumeAttachmentSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withInlineVolumeSpec(instance.getInlineVolumeSpec());

    this.withPersistentVolumeName(instance.getPersistentVolumeName());

    this.validationEnabled = validationEnabled; 
  }
  V1VolumeAttachmentSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1VolumeAttachmentSource build() {
    V1VolumeAttachmentSource buildable = new V1VolumeAttachmentSource();
    buildable.setInlineVolumeSpec(fluent.getInlineVolumeSpec());
    buildable.setPersistentVolumeName(fluent.getPersistentVolumeName());
    return buildable;
  }
  
}