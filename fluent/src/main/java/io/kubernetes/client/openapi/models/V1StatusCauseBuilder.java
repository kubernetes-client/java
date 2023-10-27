package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1StatusCauseBuilder extends V1StatusCauseFluent<V1StatusCauseBuilder> implements VisitableBuilder<V1StatusCause,V1StatusCauseBuilder>{
  public V1StatusCauseBuilder() {
    this(new V1StatusCause());
  }
  
  public V1StatusCauseBuilder(V1StatusCauseFluent<?> fluent) {
    this(fluent, new V1StatusCause());
  }
  
  public V1StatusCauseBuilder(V1StatusCauseFluent<?> fluent,V1StatusCause instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1StatusCauseBuilder(V1StatusCause instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1StatusCauseFluent<?> fluent;
  
  public V1StatusCause build() {
    V1StatusCause buildable = new V1StatusCause();
    buildable.setField(fluent.getField());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    return buildable;
  }
  

}