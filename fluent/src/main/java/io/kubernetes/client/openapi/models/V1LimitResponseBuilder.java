package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1LimitResponseBuilder extends V1LimitResponseFluent<V1LimitResponseBuilder> implements VisitableBuilder<V1LimitResponse,V1LimitResponseBuilder>{
  public V1LimitResponseBuilder() {
    this(new V1LimitResponse());
  }
  
  public V1LimitResponseBuilder(V1LimitResponseFluent<?> fluent) {
    this(fluent, new V1LimitResponse());
  }
  
  public V1LimitResponseBuilder(V1LimitResponseFluent<?> fluent,V1LimitResponse instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1LimitResponseBuilder(V1LimitResponse instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1LimitResponseFluent<?> fluent;
  
  public V1LimitResponse build() {
    V1LimitResponse buildable = new V1LimitResponse();
    buildable.setQueuing(fluent.buildQueuing());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}