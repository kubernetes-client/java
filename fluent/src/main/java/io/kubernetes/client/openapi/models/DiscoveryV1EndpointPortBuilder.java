package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class DiscoveryV1EndpointPortBuilder extends DiscoveryV1EndpointPortFluent<DiscoveryV1EndpointPortBuilder> implements VisitableBuilder<DiscoveryV1EndpointPort,DiscoveryV1EndpointPortBuilder>{
  public DiscoveryV1EndpointPortBuilder() {
    this(new DiscoveryV1EndpointPort());
  }
  
  public DiscoveryV1EndpointPortBuilder(DiscoveryV1EndpointPortFluent<?> fluent) {
    this(fluent, new DiscoveryV1EndpointPort());
  }
  
  public DiscoveryV1EndpointPortBuilder(DiscoveryV1EndpointPortFluent<?> fluent,DiscoveryV1EndpointPort instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public DiscoveryV1EndpointPortBuilder(DiscoveryV1EndpointPort instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  DiscoveryV1EndpointPortFluent<?> fluent;
  
  public DiscoveryV1EndpointPort build() {
    DiscoveryV1EndpointPort buildable = new DiscoveryV1EndpointPort();
    buildable.setAppProtocol(fluent.getAppProtocol());
    buildable.setName(fluent.getName());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
  

}