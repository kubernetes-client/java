package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1CounterSetBuilder extends V1beta1CounterSetFluent<V1beta1CounterSetBuilder> implements VisitableBuilder<V1beta1CounterSet,V1beta1CounterSetBuilder>{

  V1beta1CounterSetFluent<?> fluent;

  public V1beta1CounterSetBuilder() {
    this(new V1beta1CounterSet());
  }
  
  public V1beta1CounterSetBuilder(V1beta1CounterSetFluent<?> fluent) {
    this(fluent, new V1beta1CounterSet());
  }
  
  public V1beta1CounterSetBuilder(V1beta1CounterSet instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1CounterSetBuilder(V1beta1CounterSetFluent<?> fluent,V1beta1CounterSet instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1CounterSet build() {
    V1beta1CounterSet buildable = new V1beta1CounterSet();
    buildable.setCounters(fluent.getCounters());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}