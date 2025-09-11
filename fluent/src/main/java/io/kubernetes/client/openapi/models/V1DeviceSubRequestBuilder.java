package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1DeviceSubRequestBuilder extends V1DeviceSubRequestFluent<V1DeviceSubRequestBuilder> implements VisitableBuilder<V1DeviceSubRequest,V1DeviceSubRequestBuilder>{
  public V1DeviceSubRequestBuilder() {
    this(new V1DeviceSubRequest());
  }
  
  public V1DeviceSubRequestBuilder(V1DeviceSubRequestFluent<?> fluent) {
    this(fluent, new V1DeviceSubRequest());
  }
  
  public V1DeviceSubRequestBuilder(V1DeviceSubRequestFluent<?> fluent,V1DeviceSubRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DeviceSubRequestBuilder(V1DeviceSubRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DeviceSubRequestFluent<?> fluent;
  
  public V1DeviceSubRequest build() {
    V1DeviceSubRequest buildable = new V1DeviceSubRequest();
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