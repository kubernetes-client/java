package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ContainerImageBuilder extends V1ContainerImageFluent<V1ContainerImageBuilder> implements VisitableBuilder<V1ContainerImage,V1ContainerImageBuilder>{
  public V1ContainerImageBuilder() {
    this(new V1ContainerImage());
  }
  
  public V1ContainerImageBuilder(V1ContainerImageFluent<?> fluent) {
    this(fluent, new V1ContainerImage());
  }
  
  public V1ContainerImageBuilder(V1ContainerImageFluent<?> fluent,V1ContainerImage instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ContainerImageBuilder(V1ContainerImage instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ContainerImageFluent<?> fluent;
  
  public V1ContainerImage build() {
    V1ContainerImage buildable = new V1ContainerImage();
    buildable.setNames(fluent.getNames());
    buildable.setSizeBytes(fluent.getSizeBytes());
    return buildable;
  }
  

}