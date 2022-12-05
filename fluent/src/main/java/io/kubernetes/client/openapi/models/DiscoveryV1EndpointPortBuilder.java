package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class DiscoveryV1EndpointPortBuilder extends DiscoveryV1EndpointPortFluentImpl<DiscoveryV1EndpointPortBuilder> implements VisitableBuilder<DiscoveryV1EndpointPort,DiscoveryV1EndpointPortBuilder>{
  public DiscoveryV1EndpointPortBuilder() {
    this(false);
  }
  public DiscoveryV1EndpointPortBuilder(Boolean validationEnabled) {
    this(new DiscoveryV1EndpointPort(), validationEnabled);
  }
  public DiscoveryV1EndpointPortBuilder(DiscoveryV1EndpointPortFluent<?> fluent) {
    this(fluent, false);
  }
  public DiscoveryV1EndpointPortBuilder(DiscoveryV1EndpointPortFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new DiscoveryV1EndpointPort(), validationEnabled);
  }
  public DiscoveryV1EndpointPortBuilder(DiscoveryV1EndpointPortFluent<?> fluent,DiscoveryV1EndpointPort instance) {
    this(fluent, instance, false);
  }
  public DiscoveryV1EndpointPortBuilder(DiscoveryV1EndpointPortFluent<?> fluent,DiscoveryV1EndpointPort instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAppProtocol(instance.getAppProtocol());

    fluent.withName(instance.getName());

    fluent.withPort(instance.getPort());

    fluent.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled; 
  }
  public DiscoveryV1EndpointPortBuilder(DiscoveryV1EndpointPort instance) {
    this(instance,false);
  }
  public DiscoveryV1EndpointPortBuilder(DiscoveryV1EndpointPort instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAppProtocol(instance.getAppProtocol());

    this.withName(instance.getName());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled; 
  }
  DiscoveryV1EndpointPortFluent<?> fluent;
  Boolean validationEnabled;
  public DiscoveryV1EndpointPort build() {
    DiscoveryV1EndpointPort buildable = new DiscoveryV1EndpointPort();
    buildable.setAppProtocol(fluent.getAppProtocol());
    buildable.setName(fluent.getName());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
  
}