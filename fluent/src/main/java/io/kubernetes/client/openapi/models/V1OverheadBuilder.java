package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1OverheadBuilder extends V1OverheadFluent<V1OverheadBuilder> implements VisitableBuilder<V1Overhead,V1OverheadBuilder>{
  public V1OverheadBuilder() {
    this(new V1Overhead());
  }
  
  public V1OverheadBuilder(V1OverheadFluent<?> fluent) {
    this(fluent, new V1Overhead());
  }
  
  public V1OverheadBuilder(V1OverheadFluent<?> fluent,V1Overhead instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1OverheadBuilder(V1Overhead instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1OverheadFluent<?> fluent;
  
  public V1Overhead build() {
    V1Overhead buildable = new V1Overhead();
    buildable.setPodFixed(fluent.getPodFixed());
    return buildable;
  }
  

}