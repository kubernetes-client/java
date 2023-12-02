package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ResourceFieldSelectorBuilder extends V1ResourceFieldSelectorFluent<V1ResourceFieldSelectorBuilder> implements VisitableBuilder<V1ResourceFieldSelector,V1ResourceFieldSelectorBuilder>{
  public V1ResourceFieldSelectorBuilder() {
    this(new V1ResourceFieldSelector());
  }
  
  public V1ResourceFieldSelectorBuilder(V1ResourceFieldSelectorFluent<?> fluent) {
    this(fluent, new V1ResourceFieldSelector());
  }
  
  public V1ResourceFieldSelectorBuilder(V1ResourceFieldSelectorFluent<?> fluent,V1ResourceFieldSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ResourceFieldSelectorBuilder(V1ResourceFieldSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ResourceFieldSelectorFluent<?> fluent;
  
  public V1ResourceFieldSelector build() {
    V1ResourceFieldSelector buildable = new V1ResourceFieldSelector();
    buildable.setContainerName(fluent.getContainerName());
    buildable.setDivisor(fluent.getDivisor());
    buildable.setResource(fluent.getResource());
    return buildable;
  }
  

}