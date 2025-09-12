package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2CounterBuilder extends V1beta2CounterFluent<V1beta2CounterBuilder> implements VisitableBuilder<V1beta2Counter,V1beta2CounterBuilder>{
  public V1beta2CounterBuilder() {
    this(new V1beta2Counter());
  }
  
  public V1beta2CounterBuilder(V1beta2CounterFluent<?> fluent) {
    this(fluent, new V1beta2Counter());
  }
  
  public V1beta2CounterBuilder(V1beta2CounterFluent<?> fluent,V1beta2Counter instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2CounterBuilder(V1beta2Counter instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2CounterFluent<?> fluent;
  
  public V1beta2Counter build() {
    V1beta2Counter buildable = new V1beta2Counter();
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  

}