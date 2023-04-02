package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1EndpointBuilder extends V1EndpointFluentImpl<V1EndpointBuilder> implements VisitableBuilder<V1Endpoint,V1EndpointBuilder>{
  public V1EndpointBuilder() {
    this(false);
  }
  public V1EndpointBuilder(Boolean validationEnabled) {
    this(new V1Endpoint(), validationEnabled);
  }
  public V1EndpointBuilder(V1EndpointFluent<?> fluent) {
    this(fluent, false);
  }
  public V1EndpointBuilder(V1EndpointFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Endpoint(), validationEnabled);
  }
  public V1EndpointBuilder(V1EndpointFluent<?> fluent,V1Endpoint instance) {
    this(fluent, instance, false);
  }
  public V1EndpointBuilder(V1EndpointFluent<?> fluent,V1Endpoint instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAddresses(instance.getAddresses());

    fluent.withConditions(instance.getConditions());

    fluent.withDeprecatedTopology(instance.getDeprecatedTopology());

    fluent.withHints(instance.getHints());

    fluent.withHostname(instance.getHostname());

    fluent.withNodeName(instance.getNodeName());

    fluent.withTargetRef(instance.getTargetRef());

    fluent.withZone(instance.getZone());

    this.validationEnabled = validationEnabled; 
  }
  public V1EndpointBuilder(V1Endpoint instance) {
    this(instance,false);
  }
  public V1EndpointBuilder(V1Endpoint instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAddresses(instance.getAddresses());

    this.withConditions(instance.getConditions());

    this.withDeprecatedTopology(instance.getDeprecatedTopology());

    this.withHints(instance.getHints());

    this.withHostname(instance.getHostname());

    this.withNodeName(instance.getNodeName());

    this.withTargetRef(instance.getTargetRef());

    this.withZone(instance.getZone());

    this.validationEnabled = validationEnabled; 
  }
  V1EndpointFluent<?> fluent;
  Boolean validationEnabled;
  public V1Endpoint build() {
    V1Endpoint buildable = new V1Endpoint();
    buildable.setAddresses(fluent.getAddresses());
    buildable.setConditions(fluent.getConditions());
    buildable.setDeprecatedTopology(fluent.getDeprecatedTopology());
    buildable.setHints(fluent.getHints());
    buildable.setHostname(fluent.getHostname());
    buildable.setNodeName(fluent.getNodeName());
    buildable.setTargetRef(fluent.getTargetRef());
    buildable.setZone(fluent.getZone());
    return buildable;
  }
  
}