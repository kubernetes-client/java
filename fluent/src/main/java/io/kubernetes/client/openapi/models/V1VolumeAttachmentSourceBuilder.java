package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1VolumeAttachmentSourceBuilder extends V1VolumeAttachmentSourceFluent<V1VolumeAttachmentSourceBuilder> implements VisitableBuilder<V1VolumeAttachmentSource,V1VolumeAttachmentSourceBuilder>{
  public V1VolumeAttachmentSourceBuilder() {
    this(new V1VolumeAttachmentSource());
  }
  
  public V1VolumeAttachmentSourceBuilder(V1VolumeAttachmentSourceFluent<?> fluent) {
    this(fluent, new V1VolumeAttachmentSource());
  }
  
  public V1VolumeAttachmentSourceBuilder(V1VolumeAttachmentSourceFluent<?> fluent,V1VolumeAttachmentSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1VolumeAttachmentSourceBuilder(V1VolumeAttachmentSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1VolumeAttachmentSourceFluent<?> fluent;
  
  public V1VolumeAttachmentSource build() {
    V1VolumeAttachmentSource buildable = new V1VolumeAttachmentSource();
    buildable.setInlineVolumeSpec(fluent.buildInlineVolumeSpec());
    buildable.setPersistentVolumeName(fluent.getPersistentVolumeName());
    return buildable;
  }
  

}