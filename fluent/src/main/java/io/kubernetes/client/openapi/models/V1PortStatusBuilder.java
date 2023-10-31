package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PortStatusBuilder extends V1PortStatusFluent<V1PortStatusBuilder> implements VisitableBuilder<V1PortStatus,V1PortStatusBuilder>{
  public V1PortStatusBuilder() {
    this(new V1PortStatus());
  }
  
  public V1PortStatusBuilder(V1PortStatusFluent<?> fluent) {
    this(fluent, new V1PortStatus());
  }
  
  public V1PortStatusBuilder(V1PortStatusFluent<?> fluent,V1PortStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PortStatusBuilder(V1PortStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PortStatusFluent<?> fluent;
  
  public V1PortStatus build() {
    V1PortStatus buildable = new V1PortStatus();
    buildable.setError(fluent.getError());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
  

}