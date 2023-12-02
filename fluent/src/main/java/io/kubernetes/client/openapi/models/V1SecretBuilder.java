package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SecretBuilder extends V1SecretFluent<V1SecretBuilder> implements VisitableBuilder<V1Secret,V1SecretBuilder>{
  public V1SecretBuilder() {
    this(new V1Secret());
  }
  
  public V1SecretBuilder(V1SecretFluent<?> fluent) {
    this(fluent, new V1Secret());
  }
  
  public V1SecretBuilder(V1SecretFluent<?> fluent,V1Secret instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SecretBuilder(V1Secret instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SecretFluent<?> fluent;
  
  public V1Secret build() {
    V1Secret buildable = new V1Secret();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setData(fluent.getData());
    buildable.setImmutable(fluent.getImmutable());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setStringData(fluent.getStringData());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}