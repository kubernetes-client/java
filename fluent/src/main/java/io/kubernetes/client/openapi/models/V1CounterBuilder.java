package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1CounterBuilder extends V1CounterFluent<V1CounterBuilder> implements VisitableBuilder<V1Counter,V1CounterBuilder>{

  V1CounterFluent<?> fluent;

  public V1CounterBuilder() {
    this(new V1Counter());
  }
  
  public V1CounterBuilder(V1CounterFluent<?> fluent) {
    this(fluent, new V1Counter());
  }
  
  public V1CounterBuilder(V1Counter instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CounterBuilder(V1CounterFluent<?> fluent,V1Counter instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1Counter build() {
    V1Counter buildable = new V1Counter();
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}