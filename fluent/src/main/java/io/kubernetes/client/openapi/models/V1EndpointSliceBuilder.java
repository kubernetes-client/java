package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1EndpointSliceBuilder extends V1EndpointSliceFluentImpl<V1EndpointSliceBuilder> implements VisitableBuilder<V1EndpointSlice,V1EndpointSliceBuilder>{
  public V1EndpointSliceBuilder() {
    this(false);
  }
  public V1EndpointSliceBuilder(Boolean validationEnabled) {
    this(new V1EndpointSlice(), validationEnabled);
  }
  public V1EndpointSliceBuilder(V1EndpointSliceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1EndpointSliceBuilder(V1EndpointSliceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1EndpointSlice(), validationEnabled);
  }
  public V1EndpointSliceBuilder(V1EndpointSliceFluent<?> fluent,V1EndpointSlice instance) {
    this(fluent, instance, false);
  }
  public V1EndpointSliceBuilder(V1EndpointSliceFluent<?> fluent,V1EndpointSlice instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAddressType(instance.getAddressType());

    fluent.withApiVersion(instance.getApiVersion());

    fluent.withEndpoints(instance.getEndpoints());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withPorts(instance.getPorts());

    this.validationEnabled = validationEnabled; 
  }
  public V1EndpointSliceBuilder(V1EndpointSlice instance) {
    this(instance,false);
  }
  public V1EndpointSliceBuilder(V1EndpointSlice instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAddressType(instance.getAddressType());

    this.withApiVersion(instance.getApiVersion());

    this.withEndpoints(instance.getEndpoints());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withPorts(instance.getPorts());

    this.validationEnabled = validationEnabled; 
  }
  V1EndpointSliceFluent<?> fluent;
  Boolean validationEnabled;
  public V1EndpointSlice build() {
    V1EndpointSlice buildable = new V1EndpointSlice();
    buildable.setAddressType(fluent.getAddressType());
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setEndpoints(fluent.getEndpoints());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setPorts(fluent.getPorts());
    return buildable;
  }
  
}