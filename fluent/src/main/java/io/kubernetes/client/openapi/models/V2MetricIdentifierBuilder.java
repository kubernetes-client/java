package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2MetricIdentifierBuilder extends V2MetricIdentifierFluent<V2MetricIdentifierBuilder> implements VisitableBuilder<V2MetricIdentifier,V2MetricIdentifierBuilder>{
  public V2MetricIdentifierBuilder() {
    this(new V2MetricIdentifier());
  }
  
  public V2MetricIdentifierBuilder(V2MetricIdentifierFluent<?> fluent) {
    this(fluent, new V2MetricIdentifier());
  }
  
  public V2MetricIdentifierBuilder(V2MetricIdentifierFluent<?> fluent,V2MetricIdentifier instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2MetricIdentifierBuilder(V2MetricIdentifier instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2MetricIdentifierFluent<?> fluent;
  
  public V2MetricIdentifier build() {
    V2MetricIdentifier buildable = new V2MetricIdentifier();
    buildable.setName(fluent.getName());
    buildable.setSelector(fluent.buildSelector());
    return buildable;
  }
  

}