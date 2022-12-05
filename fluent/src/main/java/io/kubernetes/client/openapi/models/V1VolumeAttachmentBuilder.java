package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1VolumeAttachmentBuilder extends V1VolumeAttachmentFluentImpl<V1VolumeAttachmentBuilder> implements VisitableBuilder<V1VolumeAttachment,V1VolumeAttachmentBuilder>{
  public V1VolumeAttachmentBuilder() {
    this(false);
  }
  public V1VolumeAttachmentBuilder(Boolean validationEnabled) {
    this(new V1VolumeAttachment(), validationEnabled);
  }
  public V1VolumeAttachmentBuilder(V1VolumeAttachmentFluent<?> fluent) {
    this(fluent, false);
  }
  public V1VolumeAttachmentBuilder(V1VolumeAttachmentFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1VolumeAttachment(), validationEnabled);
  }
  public V1VolumeAttachmentBuilder(V1VolumeAttachmentFluent<?> fluent,V1VolumeAttachment instance) {
    this(fluent, instance, false);
  }
  public V1VolumeAttachmentBuilder(V1VolumeAttachmentFluent<?> fluent,V1VolumeAttachment instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1VolumeAttachmentBuilder(V1VolumeAttachment instance) {
    this(instance,false);
  }
  public V1VolumeAttachmentBuilder(V1VolumeAttachment instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1VolumeAttachmentFluent<?> fluent;
  Boolean validationEnabled;
  public V1VolumeAttachment build() {
    V1VolumeAttachment buildable = new V1VolumeAttachment();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}