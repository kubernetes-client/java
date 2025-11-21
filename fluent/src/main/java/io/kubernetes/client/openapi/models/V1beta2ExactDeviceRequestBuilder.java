package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2ExactDeviceRequestBuilder extends V1beta2ExactDeviceRequestFluent<V1beta2ExactDeviceRequestBuilder> implements VisitableBuilder<V1beta2ExactDeviceRequest,V1beta2ExactDeviceRequestBuilder>{

  V1beta2ExactDeviceRequestFluent<?> fluent;

  public V1beta2ExactDeviceRequestBuilder() {
    this(new V1beta2ExactDeviceRequest());
  }
  
  public V1beta2ExactDeviceRequestBuilder(V1beta2ExactDeviceRequestFluent<?> fluent) {
    this(fluent, new V1beta2ExactDeviceRequest());
  }
  
  public V1beta2ExactDeviceRequestBuilder(V1beta2ExactDeviceRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2ExactDeviceRequestBuilder(V1beta2ExactDeviceRequestFluent<?> fluent,V1beta2ExactDeviceRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2ExactDeviceRequest build() {
    V1beta2ExactDeviceRequest buildable = new V1beta2ExactDeviceRequest();
    buildable.setAdminAccess(fluent.getAdminAccess());
    buildable.setAllocationMode(fluent.getAllocationMode());
    buildable.setCapacity(fluent.buildCapacity());
    buildable.setCount(fluent.getCount());
    buildable.setDeviceClassName(fluent.getDeviceClassName());
    buildable.setSelectors(fluent.buildSelectors());
    buildable.setTolerations(fluent.buildTolerations());
    return buildable;
  }
  
}