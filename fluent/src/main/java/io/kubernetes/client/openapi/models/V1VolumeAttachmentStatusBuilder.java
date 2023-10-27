package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1VolumeAttachmentStatusBuilder extends V1VolumeAttachmentStatusFluent<V1VolumeAttachmentStatusBuilder> implements VisitableBuilder<V1VolumeAttachmentStatus,V1VolumeAttachmentStatusBuilder>{
  public V1VolumeAttachmentStatusBuilder() {
    this(new V1VolumeAttachmentStatus());
  }
  
  public V1VolumeAttachmentStatusBuilder(V1VolumeAttachmentStatusFluent<?> fluent) {
    this(fluent, new V1VolumeAttachmentStatus());
  }
  
  public V1VolumeAttachmentStatusBuilder(V1VolumeAttachmentStatusFluent<?> fluent,V1VolumeAttachmentStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1VolumeAttachmentStatusBuilder(V1VolumeAttachmentStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1VolumeAttachmentStatusFluent<?> fluent;
  
  public V1VolumeAttachmentStatus build() {
    V1VolumeAttachmentStatus buildable = new V1VolumeAttachmentStatus();
    buildable.setAttachError(fluent.buildAttachError());
    buildable.setAttached(fluent.getAttached());
    buildable.setAttachmentMetadata(fluent.getAttachmentMetadata());
    buildable.setDetachError(fluent.buildDetachError());
    return buildable;
  }
  

}