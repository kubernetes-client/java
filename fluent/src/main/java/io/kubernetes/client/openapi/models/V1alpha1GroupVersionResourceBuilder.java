package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1GroupVersionResourceBuilder extends V1alpha1GroupVersionResourceFluent<V1alpha1GroupVersionResourceBuilder> implements VisitableBuilder<V1alpha1GroupVersionResource,V1alpha1GroupVersionResourceBuilder>{
  public V1alpha1GroupVersionResourceBuilder() {
    this(new V1alpha1GroupVersionResource());
  }
  
  public V1alpha1GroupVersionResourceBuilder(V1alpha1GroupVersionResourceFluent<?> fluent) {
    this(fluent, new V1alpha1GroupVersionResource());
  }
  
  public V1alpha1GroupVersionResourceBuilder(V1alpha1GroupVersionResourceFluent<?> fluent,V1alpha1GroupVersionResource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1GroupVersionResourceBuilder(V1alpha1GroupVersionResource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1GroupVersionResourceFluent<?> fluent;
  
  public V1alpha1GroupVersionResource build() {
    V1alpha1GroupVersionResource buildable = new V1alpha1GroupVersionResource();
    buildable.setGroup(fluent.getGroup());
    buildable.setResource(fluent.getResource());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }
  

}