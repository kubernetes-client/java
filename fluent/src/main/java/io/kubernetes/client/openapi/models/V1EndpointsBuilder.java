package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1EndpointsBuilder extends V1EndpointsFluentImpl<V1EndpointsBuilder> implements VisitableBuilder<V1Endpoints,V1EndpointsBuilder>{
  public V1EndpointsBuilder() {
    this(false);
  }
  public V1EndpointsBuilder(Boolean validationEnabled) {
    this(new V1Endpoints(), validationEnabled);
  }
  public V1EndpointsBuilder(V1EndpointsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1EndpointsBuilder(V1EndpointsFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Endpoints(), validationEnabled);
  }
  public V1EndpointsBuilder(V1EndpointsFluent<?> fluent,V1Endpoints instance) {
    this(fluent, instance, false);
  }
  public V1EndpointsBuilder(V1EndpointsFluent<?> fluent,V1Endpoints instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSubsets(instance.getSubsets());

    this.validationEnabled = validationEnabled; 
  }
  public V1EndpointsBuilder(V1Endpoints instance) {
    this(instance,false);
  }
  public V1EndpointsBuilder(V1Endpoints instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSubsets(instance.getSubsets());

    this.validationEnabled = validationEnabled; 
  }
  V1EndpointsFluent<?> fluent;
  Boolean validationEnabled;
  public V1Endpoints build() {
    V1Endpoints buildable = new V1Endpoints();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSubsets(fluent.getSubsets());
    return buildable;
  }
  
}