package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3CounterSetBuilder extends V1alpha3CounterSetFluent<V1alpha3CounterSetBuilder> implements VisitableBuilder<V1alpha3CounterSet,V1alpha3CounterSetBuilder>{
  public V1alpha3CounterSetBuilder() {
    this(new V1alpha3CounterSet());
  }
  
  public V1alpha3CounterSetBuilder(V1alpha3CounterSetFluent<?> fluent) {
    this(fluent, new V1alpha3CounterSet());
  }
  
  public V1alpha3CounterSetBuilder(V1alpha3CounterSetFluent<?> fluent,V1alpha3CounterSet instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3CounterSetBuilder(V1alpha3CounterSet instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3CounterSetFluent<?> fluent;
  
  public V1alpha3CounterSet build() {
    V1alpha3CounterSet buildable = new V1alpha3CounterSet();
    buildable.setCounters(fluent.getCounters());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}