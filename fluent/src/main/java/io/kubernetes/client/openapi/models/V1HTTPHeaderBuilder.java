package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1HTTPHeaderBuilder extends V1HTTPHeaderFluent<V1HTTPHeaderBuilder> implements VisitableBuilder<V1HTTPHeader,V1HTTPHeaderBuilder>{
  public V1HTTPHeaderBuilder() {
    this(new V1HTTPHeader());
  }
  
  public V1HTTPHeaderBuilder(V1HTTPHeaderFluent<?> fluent) {
    this(fluent, new V1HTTPHeader());
  }
  
  public V1HTTPHeaderBuilder(V1HTTPHeaderFluent<?> fluent,V1HTTPHeader instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1HTTPHeaderBuilder(V1HTTPHeader instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1HTTPHeaderFluent<?> fluent;
  
  public V1HTTPHeader build() {
    V1HTTPHeader buildable = new V1HTTPHeader();
    buildable.setName(fluent.getName());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  

}