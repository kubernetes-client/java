package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1DeviceRequestBuilder extends V1beta1DeviceRequestFluent<V1beta1DeviceRequestBuilder> implements VisitableBuilder<V1beta1DeviceRequest,V1beta1DeviceRequestBuilder>{
  public V1beta1DeviceRequestBuilder() {
    this(new V1beta1DeviceRequest());
  }
  
  public V1beta1DeviceRequestBuilder(V1beta1DeviceRequestFluent<?> fluent) {
    this(fluent, new V1beta1DeviceRequest());
  }
  
  public V1beta1DeviceRequestBuilder(V1beta1DeviceRequestFluent<?> fluent,V1beta1DeviceRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1DeviceRequestBuilder(V1beta1DeviceRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1DeviceRequestFluent<?> fluent;
  
  public V1beta1DeviceRequest build() {
    V1beta1DeviceRequest buildable = new V1beta1DeviceRequest();
    buildable.setAdminAccess(fluent.getAdminAccess());
    buildable.setAllocationMode(fluent.getAllocationMode());
    buildable.setCount(fluent.getCount());
    buildable.setDeviceClassName(fluent.getDeviceClassName());
    buildable.setName(fluent.getName());
    buildable.setSelectors(fluent.buildSelectors());
    return buildable;
  }
  

}