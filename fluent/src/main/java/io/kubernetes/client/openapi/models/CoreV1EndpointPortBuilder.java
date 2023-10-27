package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class CoreV1EndpointPortBuilder extends CoreV1EndpointPortFluent<CoreV1EndpointPortBuilder> implements VisitableBuilder<CoreV1EndpointPort,CoreV1EndpointPortBuilder>{
  public CoreV1EndpointPortBuilder() {
    this(new CoreV1EndpointPort());
  }
  
  public CoreV1EndpointPortBuilder(CoreV1EndpointPortFluent<?> fluent) {
    this(fluent, new CoreV1EndpointPort());
  }
  
  public CoreV1EndpointPortBuilder(CoreV1EndpointPortFluent<?> fluent,CoreV1EndpointPort instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public CoreV1EndpointPortBuilder(CoreV1EndpointPort instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  CoreV1EndpointPortFluent<?> fluent;
  
  public CoreV1EndpointPort build() {
    CoreV1EndpointPort buildable = new CoreV1EndpointPort();
    buildable.setAppProtocol(fluent.getAppProtocol());
    buildable.setName(fluent.getName());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
  

}