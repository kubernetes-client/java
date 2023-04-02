package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1VolumeAttachmentStatusBuilder extends V1VolumeAttachmentStatusFluentImpl<V1VolumeAttachmentStatusBuilder> implements VisitableBuilder<V1VolumeAttachmentStatus,V1VolumeAttachmentStatusBuilder>{
  public V1VolumeAttachmentStatusBuilder() {
    this(false);
  }
  public V1VolumeAttachmentStatusBuilder(Boolean validationEnabled) {
    this(new V1VolumeAttachmentStatus(), validationEnabled);
  }
  public V1VolumeAttachmentStatusBuilder(V1VolumeAttachmentStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1VolumeAttachmentStatusBuilder(V1VolumeAttachmentStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1VolumeAttachmentStatus(), validationEnabled);
  }
  public V1VolumeAttachmentStatusBuilder(V1VolumeAttachmentStatusFluent<?> fluent,V1VolumeAttachmentStatus instance) {
    this(fluent, instance, false);
  }
  public V1VolumeAttachmentStatusBuilder(V1VolumeAttachmentStatusFluent<?> fluent,V1VolumeAttachmentStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAttachError(instance.getAttachError());

    fluent.withAttached(instance.getAttached());

    fluent.withAttachmentMetadata(instance.getAttachmentMetadata());

    fluent.withDetachError(instance.getDetachError());

    this.validationEnabled = validationEnabled; 
  }
  public V1VolumeAttachmentStatusBuilder(V1VolumeAttachmentStatus instance) {
    this(instance,false);
  }
  public V1VolumeAttachmentStatusBuilder(V1VolumeAttachmentStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAttachError(instance.getAttachError());

    this.withAttached(instance.getAttached());

    this.withAttachmentMetadata(instance.getAttachmentMetadata());

    this.withDetachError(instance.getDetachError());

    this.validationEnabled = validationEnabled; 
  }
  V1VolumeAttachmentStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1VolumeAttachmentStatus build() {
    V1VolumeAttachmentStatus buildable = new V1VolumeAttachmentStatus();
    buildable.setAttachError(fluent.getAttachError());
    buildable.setAttached(fluent.getAttached());
    buildable.setAttachmentMetadata(fluent.getAttachmentMetadata());
    buildable.setDetachError(fluent.getDetachError());
    return buildable;
  }
  
}