package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NodeConfigSourceBuilder extends V1NodeConfigSourceFluent<V1NodeConfigSourceBuilder> implements VisitableBuilder<V1NodeConfigSource,V1NodeConfigSourceBuilder>{
  public V1NodeConfigSourceBuilder() {
    this(new V1NodeConfigSource());
  }
  
  public V1NodeConfigSourceBuilder(V1NodeConfigSourceFluent<?> fluent) {
    this(fluent, new V1NodeConfigSource());
  }
  
  public V1NodeConfigSourceBuilder(V1NodeConfigSourceFluent<?> fluent,V1NodeConfigSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NodeConfigSourceBuilder(V1NodeConfigSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NodeConfigSourceFluent<?> fluent;
  
  public V1NodeConfigSource build() {
    V1NodeConfigSource buildable = new V1NodeConfigSource();
    buildable.setConfigMap(fluent.buildConfigMap());
    return buildable;
  }
  

}