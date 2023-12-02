package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1EventSourceBuilder extends V1EventSourceFluent<V1EventSourceBuilder> implements VisitableBuilder<V1EventSource,V1EventSourceBuilder>{
  public V1EventSourceBuilder() {
    this(new V1EventSource());
  }
  
  public V1EventSourceBuilder(V1EventSourceFluent<?> fluent) {
    this(fluent, new V1EventSource());
  }
  
  public V1EventSourceBuilder(V1EventSourceFluent<?> fluent,V1EventSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1EventSourceBuilder(V1EventSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1EventSourceFluent<?> fluent;
  
  public V1EventSource build() {
    V1EventSource buildable = new V1EventSource();
    buildable.setComponent(fluent.getComponent());
    buildable.setHost(fluent.getHost());
    return buildable;
  }
  

}