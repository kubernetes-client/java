package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3DeviceRequestBuilder extends V1alpha3DeviceRequestFluent<V1alpha3DeviceRequestBuilder> implements VisitableBuilder<V1alpha3DeviceRequest,V1alpha3DeviceRequestBuilder>{
  public V1alpha3DeviceRequestBuilder() {
    this(new V1alpha3DeviceRequest());
  }
  
  public V1alpha3DeviceRequestBuilder(V1alpha3DeviceRequestFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceRequest());
  }
  
  public V1alpha3DeviceRequestBuilder(V1alpha3DeviceRequestFluent<?> fluent,V1alpha3DeviceRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3DeviceRequestBuilder(V1alpha3DeviceRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3DeviceRequestFluent<?> fluent;
  
  public V1alpha3DeviceRequest build() {
    V1alpha3DeviceRequest buildable = new V1alpha3DeviceRequest();
    buildable.setAdminAccess(fluent.getAdminAccess());
    buildable.setAllocationMode(fluent.getAllocationMode());
    buildable.setCount(fluent.getCount());
    buildable.setDeviceClassName(fluent.getDeviceClassName());
    buildable.setName(fluent.getName());
    buildable.setSelectors(fluent.buildSelectors());
    return buildable;
  }
  

}