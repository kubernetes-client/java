package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1IPBlockBuilder extends V1IPBlockFluent<V1IPBlockBuilder> implements VisitableBuilder<V1IPBlock,V1IPBlockBuilder>{
  public V1IPBlockBuilder() {
    this(new V1IPBlock());
  }
  
  public V1IPBlockBuilder(V1IPBlockFluent<?> fluent) {
    this(fluent, new V1IPBlock());
  }
  
  public V1IPBlockBuilder(V1IPBlockFluent<?> fluent,V1IPBlock instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1IPBlockBuilder(V1IPBlock instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1IPBlockFluent<?> fluent;
  
  public V1IPBlock build() {
    V1IPBlock buildable = new V1IPBlock();
    buildable.setCidr(fluent.getCidr());
    buildable.setExcept(fluent.getExcept());
    return buildable;
  }
  

}