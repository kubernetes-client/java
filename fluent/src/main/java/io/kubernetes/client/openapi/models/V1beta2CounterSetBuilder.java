package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2CounterSetBuilder extends V1beta2CounterSetFluent<V1beta2CounterSetBuilder> implements VisitableBuilder<V1beta2CounterSet,V1beta2CounterSetBuilder>{

  V1beta2CounterSetFluent<?> fluent;

  public V1beta2CounterSetBuilder() {
    this(new V1beta2CounterSet());
  }
  
  public V1beta2CounterSetBuilder(V1beta2CounterSetFluent<?> fluent) {
    this(fluent, new V1beta2CounterSet());
  }
  
  public V1beta2CounterSetBuilder(V1beta2CounterSet instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2CounterSetBuilder(V1beta2CounterSetFluent<?> fluent,V1beta2CounterSet instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2CounterSet build() {
    V1beta2CounterSet buildable = new V1beta2CounterSet();
    buildable.setCounters(fluent.getCounters());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}