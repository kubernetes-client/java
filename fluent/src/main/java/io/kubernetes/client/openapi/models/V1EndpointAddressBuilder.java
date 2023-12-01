package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1EndpointAddressBuilder extends V1EndpointAddressFluent<V1EndpointAddressBuilder> implements VisitableBuilder<V1EndpointAddress,V1EndpointAddressBuilder>{
  public V1EndpointAddressBuilder() {
    this(new V1EndpointAddress());
  }
  
  public V1EndpointAddressBuilder(V1EndpointAddressFluent<?> fluent) {
    this(fluent, new V1EndpointAddress());
  }
  
  public V1EndpointAddressBuilder(V1EndpointAddressFluent<?> fluent,V1EndpointAddress instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1EndpointAddressBuilder(V1EndpointAddress instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1EndpointAddressFluent<?> fluent;
  
  public V1EndpointAddress build() {
    V1EndpointAddress buildable = new V1EndpointAddress();
    buildable.setHostname(fluent.getHostname());
    buildable.setIp(fluent.getIp());
    buildable.setNodeName(fluent.getNodeName());
    buildable.setTargetRef(fluent.buildTargetRef());
    return buildable;
  }
  

}