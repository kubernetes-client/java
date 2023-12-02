package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1VolumeAttachmentSpecBuilder extends V1VolumeAttachmentSpecFluent<V1VolumeAttachmentSpecBuilder> implements VisitableBuilder<V1VolumeAttachmentSpec,V1VolumeAttachmentSpecBuilder>{
  public V1VolumeAttachmentSpecBuilder() {
    this(new V1VolumeAttachmentSpec());
  }
  
  public V1VolumeAttachmentSpecBuilder(V1VolumeAttachmentSpecFluent<?> fluent) {
    this(fluent, new V1VolumeAttachmentSpec());
  }
  
  public V1VolumeAttachmentSpecBuilder(V1VolumeAttachmentSpecFluent<?> fluent,V1VolumeAttachmentSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1VolumeAttachmentSpecBuilder(V1VolumeAttachmentSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1VolumeAttachmentSpecFluent<?> fluent;
  
  public V1VolumeAttachmentSpec build() {
    V1VolumeAttachmentSpec buildable = new V1VolumeAttachmentSpec();
    buildable.setAttacher(fluent.getAttacher());
    buildable.setNodeName(fluent.getNodeName());
    buildable.setSource(fluent.buildSource());
    return buildable;
  }
  

}