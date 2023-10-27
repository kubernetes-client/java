package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1EnvVarBuilder extends V1EnvVarFluent<V1EnvVarBuilder> implements VisitableBuilder<V1EnvVar,V1EnvVarBuilder>{
  public V1EnvVarBuilder() {
    this(new V1EnvVar());
  }
  
  public V1EnvVarBuilder(V1EnvVarFluent<?> fluent) {
    this(fluent, new V1EnvVar());
  }
  
  public V1EnvVarBuilder(V1EnvVarFluent<?> fluent,V1EnvVar instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1EnvVarBuilder(V1EnvVar instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1EnvVarFluent<?> fluent;
  
  public V1EnvVar build() {
    V1EnvVar buildable = new V1EnvVar();
    buildable.setName(fluent.getName());
    buildable.setValue(fluent.getValue());
    buildable.setValueFrom(fluent.buildValueFrom());
    return buildable;
  }
  

}