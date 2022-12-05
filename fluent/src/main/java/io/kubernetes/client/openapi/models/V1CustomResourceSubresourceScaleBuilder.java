package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CustomResourceSubresourceScaleBuilder extends V1CustomResourceSubresourceScaleFluentImpl<V1CustomResourceSubresourceScaleBuilder> implements VisitableBuilder<V1CustomResourceSubresourceScale,V1CustomResourceSubresourceScaleBuilder>{
  public V1CustomResourceSubresourceScaleBuilder() {
    this(false);
  }
  public V1CustomResourceSubresourceScaleBuilder(Boolean validationEnabled) {
    this(new V1CustomResourceSubresourceScale(), validationEnabled);
  }
  public V1CustomResourceSubresourceScaleBuilder(V1CustomResourceSubresourceScaleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CustomResourceSubresourceScaleBuilder(V1CustomResourceSubresourceScaleFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CustomResourceSubresourceScale(), validationEnabled);
  }
  public V1CustomResourceSubresourceScaleBuilder(V1CustomResourceSubresourceScaleFluent<?> fluent,V1CustomResourceSubresourceScale instance) {
    this(fluent, instance, false);
  }
  public V1CustomResourceSubresourceScaleBuilder(V1CustomResourceSubresourceScaleFluent<?> fluent,V1CustomResourceSubresourceScale instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLabelSelectorPath(instance.getLabelSelectorPath());

    fluent.withSpecReplicasPath(instance.getSpecReplicasPath());

    fluent.withStatusReplicasPath(instance.getStatusReplicasPath());

    this.validationEnabled = validationEnabled; 
  }
  public V1CustomResourceSubresourceScaleBuilder(V1CustomResourceSubresourceScale instance) {
    this(instance,false);
  }
  public V1CustomResourceSubresourceScaleBuilder(V1CustomResourceSubresourceScale instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLabelSelectorPath(instance.getLabelSelectorPath());

    this.withSpecReplicasPath(instance.getSpecReplicasPath());

    this.withStatusReplicasPath(instance.getStatusReplicasPath());

    this.validationEnabled = validationEnabled; 
  }
  V1CustomResourceSubresourceScaleFluent<?> fluent;
  Boolean validationEnabled;
  public V1CustomResourceSubresourceScale build() {
    V1CustomResourceSubresourceScale buildable = new V1CustomResourceSubresourceScale();
    buildable.setLabelSelectorPath(fluent.getLabelSelectorPath());
    buildable.setSpecReplicasPath(fluent.getSpecReplicasPath());
    buildable.setStatusReplicasPath(fluent.getStatusReplicasPath());
    return buildable;
  }
  
}