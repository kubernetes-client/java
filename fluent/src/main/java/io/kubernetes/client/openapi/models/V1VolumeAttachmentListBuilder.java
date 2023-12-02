package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1VolumeAttachmentListBuilder extends V1VolumeAttachmentListFluent<V1VolumeAttachmentListBuilder> implements VisitableBuilder<V1VolumeAttachmentList,V1VolumeAttachmentListBuilder>{
  public V1VolumeAttachmentListBuilder() {
    this(new V1VolumeAttachmentList());
  }
  
  public V1VolumeAttachmentListBuilder(V1VolumeAttachmentListFluent<?> fluent) {
    this(fluent, new V1VolumeAttachmentList());
  }
  
  public V1VolumeAttachmentListBuilder(V1VolumeAttachmentListFluent<?> fluent,V1VolumeAttachmentList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1VolumeAttachmentListBuilder(V1VolumeAttachmentList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1VolumeAttachmentListFluent<?> fluent;
  
  public V1VolumeAttachmentList build() {
    V1VolumeAttachmentList buildable = new V1VolumeAttachmentList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}