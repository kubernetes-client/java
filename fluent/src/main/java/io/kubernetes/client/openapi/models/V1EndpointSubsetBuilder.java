package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1EndpointSubsetBuilder extends V1EndpointSubsetFluent<V1EndpointSubsetBuilder> implements VisitableBuilder<V1EndpointSubset,V1EndpointSubsetBuilder>{

  V1EndpointSubsetFluent<?> fluent;

  public V1EndpointSubsetBuilder() {
    this(new V1EndpointSubset());
  }
  
  public V1EndpointSubsetBuilder(V1EndpointSubsetFluent<?> fluent) {
    this(fluent, new V1EndpointSubset());
  }
  
  public V1EndpointSubsetBuilder(V1EndpointSubset instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1EndpointSubsetBuilder(V1EndpointSubsetFluent<?> fluent,V1EndpointSubset instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1EndpointSubset build() {
    V1EndpointSubset buildable = new V1EndpointSubset();
    buildable.setAddresses(fluent.buildAddresses());
    buildable.setNotReadyAddresses(fluent.buildNotReadyAddresses());
    buildable.setPorts(fluent.buildPorts());
    return buildable;
  }
  
}