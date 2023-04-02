package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1EndpointAddressBuilder extends V1EndpointAddressFluentImpl<V1EndpointAddressBuilder> implements VisitableBuilder<V1EndpointAddress,V1EndpointAddressBuilder>{
  public V1EndpointAddressBuilder() {
    this(false);
  }
  public V1EndpointAddressBuilder(Boolean validationEnabled) {
    this(new V1EndpointAddress(), validationEnabled);
  }
  public V1EndpointAddressBuilder(V1EndpointAddressFluent<?> fluent) {
    this(fluent, false);
  }
  public V1EndpointAddressBuilder(V1EndpointAddressFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1EndpointAddress(), validationEnabled);
  }
  public V1EndpointAddressBuilder(V1EndpointAddressFluent<?> fluent,V1EndpointAddress instance) {
    this(fluent, instance, false);
  }
  public V1EndpointAddressBuilder(V1EndpointAddressFluent<?> fluent,V1EndpointAddress instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withHostname(instance.getHostname());

    fluent.withIp(instance.getIp());

    fluent.withNodeName(instance.getNodeName());

    fluent.withTargetRef(instance.getTargetRef());

    this.validationEnabled = validationEnabled; 
  }
  public V1EndpointAddressBuilder(V1EndpointAddress instance) {
    this(instance,false);
  }
  public V1EndpointAddressBuilder(V1EndpointAddress instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withHostname(instance.getHostname());

    this.withIp(instance.getIp());

    this.withNodeName(instance.getNodeName());

    this.withTargetRef(instance.getTargetRef());

    this.validationEnabled = validationEnabled; 
  }
  V1EndpointAddressFluent<?> fluent;
  Boolean validationEnabled;
  public V1EndpointAddress build() {
    V1EndpointAddress buildable = new V1EndpointAddress();
    buildable.setHostname(fluent.getHostname());
    buildable.setIp(fluent.getIp());
    buildable.setNodeName(fluent.getNodeName());
    buildable.setTargetRef(fluent.getTargetRef());
    return buildable;
  }
  
}