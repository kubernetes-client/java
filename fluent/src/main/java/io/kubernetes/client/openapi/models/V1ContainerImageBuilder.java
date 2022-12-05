package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ContainerImageBuilder extends V1ContainerImageFluentImpl<V1ContainerImageBuilder> implements VisitableBuilder<V1ContainerImage,V1ContainerImageBuilder>{
  public V1ContainerImageBuilder() {
    this(false);
  }
  public V1ContainerImageBuilder(Boolean validationEnabled) {
    this(new V1ContainerImage(), validationEnabled);
  }
  public V1ContainerImageBuilder(V1ContainerImageFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ContainerImageBuilder(V1ContainerImageFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ContainerImage(), validationEnabled);
  }
  public V1ContainerImageBuilder(V1ContainerImageFluent<?> fluent,V1ContainerImage instance) {
    this(fluent, instance, false);
  }
  public V1ContainerImageBuilder(V1ContainerImageFluent<?> fluent,V1ContainerImage instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withNames(instance.getNames());

    fluent.withSizeBytes(instance.getSizeBytes());

    this.validationEnabled = validationEnabled; 
  }
  public V1ContainerImageBuilder(V1ContainerImage instance) {
    this(instance,false);
  }
  public V1ContainerImageBuilder(V1ContainerImage instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withNames(instance.getNames());

    this.withSizeBytes(instance.getSizeBytes());

    this.validationEnabled = validationEnabled; 
  }
  V1ContainerImageFluent<?> fluent;
  Boolean validationEnabled;
  public V1ContainerImage build() {
    V1ContainerImage buildable = new V1ContainerImage();
    buildable.setNames(fluent.getNames());
    buildable.setSizeBytes(fluent.getSizeBytes());
    return buildable;
  }
  
}