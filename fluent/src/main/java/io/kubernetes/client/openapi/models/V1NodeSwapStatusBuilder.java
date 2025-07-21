package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NodeSwapStatusBuilder extends V1NodeSwapStatusFluent<V1NodeSwapStatusBuilder> implements VisitableBuilder<V1NodeSwapStatus,V1NodeSwapStatusBuilder>{
  public V1NodeSwapStatusBuilder() {
    this(new V1NodeSwapStatus());
  }
  
  public V1NodeSwapStatusBuilder(V1NodeSwapStatusFluent<?> fluent) {
    this(fluent, new V1NodeSwapStatus());
  }
  
  public V1NodeSwapStatusBuilder(V1NodeSwapStatusFluent<?> fluent,V1NodeSwapStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NodeSwapStatusBuilder(V1NodeSwapStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NodeSwapStatusFluent<?> fluent;
  
  public V1NodeSwapStatus build() {
    V1NodeSwapStatus buildable = new V1NodeSwapStatus();
    buildable.setCapacity(fluent.getCapacity());
    return buildable;
  }
  

}