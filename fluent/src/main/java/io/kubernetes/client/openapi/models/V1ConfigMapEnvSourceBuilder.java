package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ConfigMapEnvSourceBuilder extends V1ConfigMapEnvSourceFluent<V1ConfigMapEnvSourceBuilder> implements VisitableBuilder<V1ConfigMapEnvSource,V1ConfigMapEnvSourceBuilder>{
  public V1ConfigMapEnvSourceBuilder() {
    this(new V1ConfigMapEnvSource());
  }
  
  public V1ConfigMapEnvSourceBuilder(V1ConfigMapEnvSourceFluent<?> fluent) {
    this(fluent, new V1ConfigMapEnvSource());
  }
  
  public V1ConfigMapEnvSourceBuilder(V1ConfigMapEnvSourceFluent<?> fluent,V1ConfigMapEnvSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ConfigMapEnvSourceBuilder(V1ConfigMapEnvSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ConfigMapEnvSourceFluent<?> fluent;
  
  public V1ConfigMapEnvSource build() {
    V1ConfigMapEnvSource buildable = new V1ConfigMapEnvSource();
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  

}