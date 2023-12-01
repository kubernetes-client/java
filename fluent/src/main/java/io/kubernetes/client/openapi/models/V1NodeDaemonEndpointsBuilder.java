package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NodeDaemonEndpointsBuilder extends V1NodeDaemonEndpointsFluent<V1NodeDaemonEndpointsBuilder> implements VisitableBuilder<V1NodeDaemonEndpoints,V1NodeDaemonEndpointsBuilder>{
  public V1NodeDaemonEndpointsBuilder() {
    this(new V1NodeDaemonEndpoints());
  }
  
  public V1NodeDaemonEndpointsBuilder(V1NodeDaemonEndpointsFluent<?> fluent) {
    this(fluent, new V1NodeDaemonEndpoints());
  }
  
  public V1NodeDaemonEndpointsBuilder(V1NodeDaemonEndpointsFluent<?> fluent,V1NodeDaemonEndpoints instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NodeDaemonEndpointsBuilder(V1NodeDaemonEndpoints instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NodeDaemonEndpointsFluent<?> fluent;
  
  public V1NodeDaemonEndpoints build() {
    V1NodeDaemonEndpoints buildable = new V1NodeDaemonEndpoints();
    buildable.setKubeletEndpoint(fluent.buildKubeletEndpoint());
    return buildable;
  }
  

}