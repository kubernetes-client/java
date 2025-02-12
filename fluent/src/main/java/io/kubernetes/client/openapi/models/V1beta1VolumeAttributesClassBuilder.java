package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1VolumeAttributesClassBuilder extends V1beta1VolumeAttributesClassFluent<V1beta1VolumeAttributesClassBuilder> implements VisitableBuilder<V1beta1VolumeAttributesClass,V1beta1VolumeAttributesClassBuilder>{
  public V1beta1VolumeAttributesClassBuilder() {
    this(new V1beta1VolumeAttributesClass());
  }
  
  public V1beta1VolumeAttributesClassBuilder(V1beta1VolumeAttributesClassFluent<?> fluent) {
    this(fluent, new V1beta1VolumeAttributesClass());
  }
  
  public V1beta1VolumeAttributesClassBuilder(V1beta1VolumeAttributesClassFluent<?> fluent,V1beta1VolumeAttributesClass instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1VolumeAttributesClassBuilder(V1beta1VolumeAttributesClass instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1VolumeAttributesClassFluent<?> fluent;
  
  public V1beta1VolumeAttributesClass build() {
    V1beta1VolumeAttributesClass buildable = new V1beta1VolumeAttributesClass();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDriverName(fluent.getDriverName());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setParameters(fluent.getParameters());
    return buildable;
  }
  

}