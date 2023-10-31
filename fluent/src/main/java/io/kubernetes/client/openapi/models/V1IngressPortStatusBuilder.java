package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1IngressPortStatusBuilder extends V1IngressPortStatusFluent<V1IngressPortStatusBuilder> implements VisitableBuilder<V1IngressPortStatus,V1IngressPortStatusBuilder>{
  public V1IngressPortStatusBuilder() {
    this(new V1IngressPortStatus());
  }
  
  public V1IngressPortStatusBuilder(V1IngressPortStatusFluent<?> fluent) {
    this(fluent, new V1IngressPortStatus());
  }
  
  public V1IngressPortStatusBuilder(V1IngressPortStatusFluent<?> fluent,V1IngressPortStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1IngressPortStatusBuilder(V1IngressPortStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1IngressPortStatusFluent<?> fluent;
  
  public V1IngressPortStatus build() {
    V1IngressPortStatus buildable = new V1IngressPortStatus();
    buildable.setError(fluent.getError());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
  

}