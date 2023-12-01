package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1EnvVarSourceBuilder extends V1EnvVarSourceFluent<V1EnvVarSourceBuilder> implements VisitableBuilder<V1EnvVarSource,V1EnvVarSourceBuilder>{
  public V1EnvVarSourceBuilder() {
    this(new V1EnvVarSource());
  }
  
  public V1EnvVarSourceBuilder(V1EnvVarSourceFluent<?> fluent) {
    this(fluent, new V1EnvVarSource());
  }
  
  public V1EnvVarSourceBuilder(V1EnvVarSourceFluent<?> fluent,V1EnvVarSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1EnvVarSourceBuilder(V1EnvVarSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1EnvVarSourceFluent<?> fluent;
  
  public V1EnvVarSource build() {
    V1EnvVarSource buildable = new V1EnvVarSource();
    buildable.setConfigMapKeyRef(fluent.buildConfigMapKeyRef());
    buildable.setFieldRef(fluent.buildFieldRef());
    buildable.setResourceFieldRef(fluent.buildResourceFieldRef());
    buildable.setSecretKeyRef(fluent.buildSecretKeyRef());
    return buildable;
  }
  

}