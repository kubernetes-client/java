package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1EndpointsBuilder extends V1EndpointsFluent<V1EndpointsBuilder> implements VisitableBuilder<V1Endpoints,V1EndpointsBuilder>{
  public V1EndpointsBuilder() {
    this(new V1Endpoints());
  }
  
  public V1EndpointsBuilder(V1EndpointsFluent<?> fluent) {
    this(fluent, new V1Endpoints());
  }
  
  public V1EndpointsBuilder(V1EndpointsFluent<?> fluent,V1Endpoints instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1EndpointsBuilder(V1Endpoints instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1EndpointsFluent<?> fluent;
  
  public V1Endpoints build() {
    V1Endpoints buildable = new V1Endpoints();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSubsets(fluent.buildSubsets());
    return buildable;
  }
  

}