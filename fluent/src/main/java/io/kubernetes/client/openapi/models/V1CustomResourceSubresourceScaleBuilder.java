package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CustomResourceSubresourceScaleBuilder extends V1CustomResourceSubresourceScaleFluent<V1CustomResourceSubresourceScaleBuilder> implements VisitableBuilder<V1CustomResourceSubresourceScale,V1CustomResourceSubresourceScaleBuilder>{
  public V1CustomResourceSubresourceScaleBuilder() {
    this(new V1CustomResourceSubresourceScale());
  }
  
  public V1CustomResourceSubresourceScaleBuilder(V1CustomResourceSubresourceScaleFluent<?> fluent) {
    this(fluent, new V1CustomResourceSubresourceScale());
  }
  
  public V1CustomResourceSubresourceScaleBuilder(V1CustomResourceSubresourceScaleFluent<?> fluent,V1CustomResourceSubresourceScale instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CustomResourceSubresourceScaleBuilder(V1CustomResourceSubresourceScale instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CustomResourceSubresourceScaleFluent<?> fluent;
  
  public V1CustomResourceSubresourceScale build() {
    V1CustomResourceSubresourceScale buildable = new V1CustomResourceSubresourceScale();
    buildable.setLabelSelectorPath(fluent.getLabelSelectorPath());
    buildable.setSpecReplicasPath(fluent.getSpecReplicasPath());
    buildable.setStatusReplicasPath(fluent.getStatusReplicasPath());
    return buildable;
  }
  

}