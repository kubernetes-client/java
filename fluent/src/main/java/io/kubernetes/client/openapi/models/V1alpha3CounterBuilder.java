package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3CounterBuilder extends V1alpha3CounterFluent<V1alpha3CounterBuilder> implements VisitableBuilder<V1alpha3Counter,V1alpha3CounterBuilder>{
  public V1alpha3CounterBuilder() {
    this(new V1alpha3Counter());
  }
  
  public V1alpha3CounterBuilder(V1alpha3CounterFluent<?> fluent) {
    this(fluent, new V1alpha3Counter());
  }
  
  public V1alpha3CounterBuilder(V1alpha3CounterFluent<?> fluent,V1alpha3Counter instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3CounterBuilder(V1alpha3Counter instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3CounterFluent<?> fluent;
  
  public V1alpha3Counter build() {
    V1alpha3Counter buildable = new V1alpha3Counter();
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  

}