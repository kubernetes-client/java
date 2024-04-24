package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1VolumeAttributesClassBuilder extends V1alpha1VolumeAttributesClassFluent<V1alpha1VolumeAttributesClassBuilder> implements VisitableBuilder<V1alpha1VolumeAttributesClass,V1alpha1VolumeAttributesClassBuilder>{
  public V1alpha1VolumeAttributesClassBuilder() {
    this(new V1alpha1VolumeAttributesClass());
  }
  
  public V1alpha1VolumeAttributesClassBuilder(V1alpha1VolumeAttributesClassFluent<?> fluent) {
    this(fluent, new V1alpha1VolumeAttributesClass());
  }
  
  public V1alpha1VolumeAttributesClassBuilder(V1alpha1VolumeAttributesClassFluent<?> fluent,V1alpha1VolumeAttributesClass instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1VolumeAttributesClassBuilder(V1alpha1VolumeAttributesClass instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1VolumeAttributesClassFluent<?> fluent;
  
  public V1alpha1VolumeAttributesClass build() {
    V1alpha1VolumeAttributesClass buildable = new V1alpha1VolumeAttributesClass();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDriverName(fluent.getDriverName());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setParameters(fluent.getParameters());
    return buildable;
  }
  

}