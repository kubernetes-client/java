package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1CounterBuilder extends V1beta1CounterFluent<V1beta1CounterBuilder> implements VisitableBuilder<V1beta1Counter,V1beta1CounterBuilder>{

  V1beta1CounterFluent<?> fluent;

  public V1beta1CounterBuilder() {
    this(new V1beta1Counter());
  }
  
  public V1beta1CounterBuilder(V1beta1CounterFluent<?> fluent) {
    this(fluent, new V1beta1Counter());
  }
  
  public V1beta1CounterBuilder(V1beta1Counter instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1CounterBuilder(V1beta1CounterFluent<?> fluent,V1beta1Counter instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1Counter build() {
    V1beta1Counter buildable = new V1beta1Counter();
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}