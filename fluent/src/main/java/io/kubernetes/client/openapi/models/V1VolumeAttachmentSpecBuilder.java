package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1VolumeAttachmentSpecBuilder extends V1VolumeAttachmentSpecFluentImpl<V1VolumeAttachmentSpecBuilder> implements VisitableBuilder<V1VolumeAttachmentSpec,V1VolumeAttachmentSpecBuilder>{
  public V1VolumeAttachmentSpecBuilder() {
    this(false);
  }
  public V1VolumeAttachmentSpecBuilder(Boolean validationEnabled) {
    this(new V1VolumeAttachmentSpec(), validationEnabled);
  }
  public V1VolumeAttachmentSpecBuilder(V1VolumeAttachmentSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1VolumeAttachmentSpecBuilder(V1VolumeAttachmentSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1VolumeAttachmentSpec(), validationEnabled);
  }
  public V1VolumeAttachmentSpecBuilder(V1VolumeAttachmentSpecFluent<?> fluent,V1VolumeAttachmentSpec instance) {
    this(fluent, instance, false);
  }
  public V1VolumeAttachmentSpecBuilder(V1VolumeAttachmentSpecFluent<?> fluent,V1VolumeAttachmentSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAttacher(instance.getAttacher());

    fluent.withNodeName(instance.getNodeName());

    fluent.withSource(instance.getSource());

    this.validationEnabled = validationEnabled; 
  }
  public V1VolumeAttachmentSpecBuilder(V1VolumeAttachmentSpec instance) {
    this(instance,false);
  }
  public V1VolumeAttachmentSpecBuilder(V1VolumeAttachmentSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAttacher(instance.getAttacher());

    this.withNodeName(instance.getNodeName());

    this.withSource(instance.getSource());

    this.validationEnabled = validationEnabled; 
  }
  V1VolumeAttachmentSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1VolumeAttachmentSpec build() {
    V1VolumeAttachmentSpec buildable = new V1VolumeAttachmentSpec();
    buildable.setAttacher(fluent.getAttacher());
    buildable.setNodeName(fluent.getNodeName());
    buildable.setSource(fluent.getSource());
    return buildable;
  }
  
}