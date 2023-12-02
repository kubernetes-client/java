package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1EndpointSliceBuilder extends V1EndpointSliceFluent<V1EndpointSliceBuilder> implements VisitableBuilder<V1EndpointSlice,V1EndpointSliceBuilder>{
  public V1EndpointSliceBuilder() {
    this(new V1EndpointSlice());
  }
  
  public V1EndpointSliceBuilder(V1EndpointSliceFluent<?> fluent) {
    this(fluent, new V1EndpointSlice());
  }
  
  public V1EndpointSliceBuilder(V1EndpointSliceFluent<?> fluent,V1EndpointSlice instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1EndpointSliceBuilder(V1EndpointSlice instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1EndpointSliceFluent<?> fluent;
  
  public V1EndpointSlice build() {
    V1EndpointSlice buildable = new V1EndpointSlice();
    buildable.setAddressType(fluent.getAddressType());
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setEndpoints(fluent.buildEndpoints());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setPorts(fluent.buildPorts());
    return buildable;
  }
  

}