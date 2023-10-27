package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2LimitResponseBuilder extends V1beta2LimitResponseFluent<V1beta2LimitResponseBuilder> implements VisitableBuilder<V1beta2LimitResponse,V1beta2LimitResponseBuilder>{
  public V1beta2LimitResponseBuilder() {
    this(new V1beta2LimitResponse());
  }
  
  public V1beta2LimitResponseBuilder(V1beta2LimitResponseFluent<?> fluent) {
    this(fluent, new V1beta2LimitResponse());
  }
  
  public V1beta2LimitResponseBuilder(V1beta2LimitResponseFluent<?> fluent,V1beta2LimitResponse instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2LimitResponseBuilder(V1beta2LimitResponse instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2LimitResponseFluent<?> fluent;
  
  public V1beta2LimitResponse build() {
    V1beta2LimitResponse buildable = new V1beta2LimitResponse();
    buildable.setQueuing(fluent.buildQueuing());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}