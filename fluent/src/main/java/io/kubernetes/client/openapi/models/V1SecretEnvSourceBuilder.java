package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SecretEnvSourceBuilder extends V1SecretEnvSourceFluent<V1SecretEnvSourceBuilder> implements VisitableBuilder<V1SecretEnvSource,V1SecretEnvSourceBuilder>{
  public V1SecretEnvSourceBuilder() {
    this(new V1SecretEnvSource());
  }
  
  public V1SecretEnvSourceBuilder(V1SecretEnvSourceFluent<?> fluent) {
    this(fluent, new V1SecretEnvSource());
  }
  
  public V1SecretEnvSourceBuilder(V1SecretEnvSourceFluent<?> fluent,V1SecretEnvSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SecretEnvSourceBuilder(V1SecretEnvSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SecretEnvSourceFluent<?> fluent;
  
  public V1SecretEnvSource build() {
    V1SecretEnvSource buildable = new V1SecretEnvSource();
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  

}