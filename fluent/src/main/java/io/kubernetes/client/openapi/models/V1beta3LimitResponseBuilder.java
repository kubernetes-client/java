package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3LimitResponseBuilder extends V1beta3LimitResponseFluent<V1beta3LimitResponseBuilder> implements VisitableBuilder<V1beta3LimitResponse,V1beta3LimitResponseBuilder>{
  public V1beta3LimitResponseBuilder() {
    this(new V1beta3LimitResponse());
  }
  
  public V1beta3LimitResponseBuilder(V1beta3LimitResponseFluent<?> fluent) {
    this(fluent, new V1beta3LimitResponse());
  }
  
  public V1beta3LimitResponseBuilder(V1beta3LimitResponseFluent<?> fluent,V1beta3LimitResponse instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3LimitResponseBuilder(V1beta3LimitResponse instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3LimitResponseFluent<?> fluent;
  
  public V1beta3LimitResponse build() {
    V1beta3LimitResponse buildable = new V1beta3LimitResponse();
    buildable.setQueuing(fluent.buildQueuing());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}