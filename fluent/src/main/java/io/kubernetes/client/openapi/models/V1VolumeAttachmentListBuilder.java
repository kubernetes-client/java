package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1VolumeAttachmentListBuilder extends V1VolumeAttachmentListFluentImpl<V1VolumeAttachmentListBuilder> implements VisitableBuilder<V1VolumeAttachmentList,V1VolumeAttachmentListBuilder>{
  public V1VolumeAttachmentListBuilder() {
    this(false);
  }
  public V1VolumeAttachmentListBuilder(Boolean validationEnabled) {
    this(new V1VolumeAttachmentList(), validationEnabled);
  }
  public V1VolumeAttachmentListBuilder(V1VolumeAttachmentListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1VolumeAttachmentListBuilder(V1VolumeAttachmentListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1VolumeAttachmentList(), validationEnabled);
  }
  public V1VolumeAttachmentListBuilder(V1VolumeAttachmentListFluent<?> fluent,V1VolumeAttachmentList instance) {
    this(fluent, instance, false);
  }
  public V1VolumeAttachmentListBuilder(V1VolumeAttachmentListFluent<?> fluent,V1VolumeAttachmentList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1VolumeAttachmentListBuilder(V1VolumeAttachmentList instance) {
    this(instance,false);
  }
  public V1VolumeAttachmentListBuilder(V1VolumeAttachmentList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1VolumeAttachmentListFluent<?> fluent;
  Boolean validationEnabled;
  public V1VolumeAttachmentList build() {
    V1VolumeAttachmentList buildable = new V1VolumeAttachmentList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}