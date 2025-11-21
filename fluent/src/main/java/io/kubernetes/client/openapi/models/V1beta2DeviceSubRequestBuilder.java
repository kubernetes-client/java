package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2DeviceSubRequestBuilder extends V1beta2DeviceSubRequestFluent<V1beta2DeviceSubRequestBuilder> implements VisitableBuilder<V1beta2DeviceSubRequest,V1beta2DeviceSubRequestBuilder>{

  V1beta2DeviceSubRequestFluent<?> fluent;

  public V1beta2DeviceSubRequestBuilder() {
    this(new V1beta2DeviceSubRequest());
  }
  
  public V1beta2DeviceSubRequestBuilder(V1beta2DeviceSubRequestFluent<?> fluent) {
    this(fluent, new V1beta2DeviceSubRequest());
  }
  
  public V1beta2DeviceSubRequestBuilder(V1beta2DeviceSubRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2DeviceSubRequestBuilder(V1beta2DeviceSubRequestFluent<?> fluent,V1beta2DeviceSubRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2DeviceSubRequest build() {
    V1beta2DeviceSubRequest buildable = new V1beta2DeviceSubRequest();
    buildable.setAllocationMode(fluent.getAllocationMode());
    buildable.setCapacity(fluent.buildCapacity());
    buildable.setCount(fluent.getCount());
    buildable.setDeviceClassName(fluent.getDeviceClassName());
    buildable.setName(fluent.getName());
    buildable.setSelectors(fluent.buildSelectors());
    buildable.setTolerations(fluent.buildTolerations());
    return buildable;
  }
  
}