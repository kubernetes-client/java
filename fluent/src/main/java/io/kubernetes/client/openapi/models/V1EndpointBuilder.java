package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1EndpointBuilder extends V1EndpointFluent<V1EndpointBuilder> implements VisitableBuilder<V1Endpoint,V1EndpointBuilder>{
  public V1EndpointBuilder() {
    this(new V1Endpoint());
  }
  
  public V1EndpointBuilder(V1EndpointFluent<?> fluent) {
    this(fluent, new V1Endpoint());
  }
  
  public V1EndpointBuilder(V1EndpointFluent<?> fluent,V1Endpoint instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1EndpointBuilder(V1Endpoint instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1EndpointFluent<?> fluent;
  
  public V1Endpoint build() {
    V1Endpoint buildable = new V1Endpoint();
    buildable.setAddresses(fluent.getAddresses());
    buildable.setConditions(fluent.buildConditions());
    buildable.setDeprecatedTopology(fluent.getDeprecatedTopology());
    buildable.setHints(fluent.buildHints());
    buildable.setHostname(fluent.getHostname());
    buildable.setNodeName(fluent.getNodeName());
    buildable.setTargetRef(fluent.buildTargetRef());
    buildable.setZone(fluent.getZone());
    return buildable;
  }
  

}