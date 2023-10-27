package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1EnvFromSourceBuilder extends V1EnvFromSourceFluent<V1EnvFromSourceBuilder> implements VisitableBuilder<V1EnvFromSource,V1EnvFromSourceBuilder>{
  public V1EnvFromSourceBuilder() {
    this(new V1EnvFromSource());
  }
  
  public V1EnvFromSourceBuilder(V1EnvFromSourceFluent<?> fluent) {
    this(fluent, new V1EnvFromSource());
  }
  
  public V1EnvFromSourceBuilder(V1EnvFromSourceFluent<?> fluent,V1EnvFromSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1EnvFromSourceBuilder(V1EnvFromSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1EnvFromSourceFluent<?> fluent;
  
  public V1EnvFromSource build() {
    V1EnvFromSource buildable = new V1EnvFromSource();
    buildable.setConfigMapRef(fluent.buildConfigMapRef());
    buildable.setPrefix(fluent.getPrefix());
    buildable.setSecretRef(fluent.buildSecretRef());
    return buildable;
  }
  

}