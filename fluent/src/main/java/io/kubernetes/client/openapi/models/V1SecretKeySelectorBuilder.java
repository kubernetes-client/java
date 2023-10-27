package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SecretKeySelectorBuilder extends V1SecretKeySelectorFluent<V1SecretKeySelectorBuilder> implements VisitableBuilder<V1SecretKeySelector,V1SecretKeySelectorBuilder>{
  public V1SecretKeySelectorBuilder() {
    this(new V1SecretKeySelector());
  }
  
  public V1SecretKeySelectorBuilder(V1SecretKeySelectorFluent<?> fluent) {
    this(fluent, new V1SecretKeySelector());
  }
  
  public V1SecretKeySelectorBuilder(V1SecretKeySelectorFluent<?> fluent,V1SecretKeySelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SecretKeySelectorBuilder(V1SecretKeySelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SecretKeySelectorFluent<?> fluent;
  
  public V1SecretKeySelector build() {
    V1SecretKeySelector buildable = new V1SecretKeySelector();
    buildable.setKey(fluent.getKey());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  

}