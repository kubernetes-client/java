package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ObjectFieldSelectorBuilder extends V1ObjectFieldSelectorFluent<V1ObjectFieldSelectorBuilder> implements VisitableBuilder<V1ObjectFieldSelector,V1ObjectFieldSelectorBuilder>{
  public V1ObjectFieldSelectorBuilder() {
    this(new V1ObjectFieldSelector());
  }
  
  public V1ObjectFieldSelectorBuilder(V1ObjectFieldSelectorFluent<?> fluent) {
    this(fluent, new V1ObjectFieldSelector());
  }
  
  public V1ObjectFieldSelectorBuilder(V1ObjectFieldSelectorFluent<?> fluent,V1ObjectFieldSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ObjectFieldSelectorBuilder(V1ObjectFieldSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ObjectFieldSelectorFluent<?> fluent;
  
  public V1ObjectFieldSelector build() {
    V1ObjectFieldSelector buildable = new V1ObjectFieldSelector();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setFieldPath(fluent.getFieldPath());
    return buildable;
  }
  

}