package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1DaemonEndpointBuilder extends V1DaemonEndpointFluent<V1DaemonEndpointBuilder> implements VisitableBuilder<V1DaemonEndpoint,V1DaemonEndpointBuilder>{
  public V1DaemonEndpointBuilder() {
    this(new V1DaemonEndpoint());
  }
  
  public V1DaemonEndpointBuilder(V1DaemonEndpointFluent<?> fluent) {
    this(fluent, new V1DaemonEndpoint());
  }
  
  public V1DaemonEndpointBuilder(V1DaemonEndpointFluent<?> fluent,V1DaemonEndpoint instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DaemonEndpointBuilder(V1DaemonEndpoint instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DaemonEndpointFluent<?> fluent;
  
  public V1DaemonEndpoint build() {
    V1DaemonEndpoint buildable = new V1DaemonEndpoint();
    buildable.setPort(fluent.getPort());
    return buildable;
  }
  

}