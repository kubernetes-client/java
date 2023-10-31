package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1VolumeAttachmentBuilder extends V1VolumeAttachmentFluent<V1VolumeAttachmentBuilder> implements VisitableBuilder<V1VolumeAttachment,V1VolumeAttachmentBuilder>{
  public V1VolumeAttachmentBuilder() {
    this(new V1VolumeAttachment());
  }
  
  public V1VolumeAttachmentBuilder(V1VolumeAttachmentFluent<?> fluent) {
    this(fluent, new V1VolumeAttachment());
  }
  
  public V1VolumeAttachmentBuilder(V1VolumeAttachmentFluent<?> fluent,V1VolumeAttachment instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1VolumeAttachmentBuilder(V1VolumeAttachment instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1VolumeAttachmentFluent<?> fluent;
  
  public V1VolumeAttachment build() {
    V1VolumeAttachment buildable = new V1VolumeAttachment();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}