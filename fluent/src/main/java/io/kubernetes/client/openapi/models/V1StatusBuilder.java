package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1StatusBuilder extends V1StatusFluent<V1StatusBuilder> implements VisitableBuilder<V1Status,V1StatusBuilder>{
  public V1StatusBuilder() {
    this(new V1Status());
  }
  
  public V1StatusBuilder(V1StatusFluent<?> fluent) {
    this(fluent, new V1Status());
  }
  
  public V1StatusBuilder(V1StatusFluent<?> fluent,V1Status instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1StatusBuilder(V1Status instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1StatusFluent<?> fluent;
  
  public V1Status build() {
    V1Status buildable = new V1Status();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setCode(fluent.getCode());
    buildable.setDetails(fluent.buildDetails());
    buildable.setKind(fluent.getKind());
    buildable.setMessage(fluent.getMessage());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  

}