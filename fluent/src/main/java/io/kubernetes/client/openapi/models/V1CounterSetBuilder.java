package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1CounterSetBuilder extends V1CounterSetFluent<V1CounterSetBuilder> implements VisitableBuilder<V1CounterSet,V1CounterSetBuilder>{
  public V1CounterSetBuilder() {
    this(new V1CounterSet());
  }
  
  public V1CounterSetBuilder(V1CounterSetFluent<?> fluent) {
    this(fluent, new V1CounterSet());
  }
  
  public V1CounterSetBuilder(V1CounterSetFluent<?> fluent,V1CounterSet instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CounterSetBuilder(V1CounterSet instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CounterSetFluent<?> fluent;
  
  public V1CounterSet build() {
    V1CounterSet buildable = new V1CounterSet();
    buildable.setCounters(fluent.getCounters());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}