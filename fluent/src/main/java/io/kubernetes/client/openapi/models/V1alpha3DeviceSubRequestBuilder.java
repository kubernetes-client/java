package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3DeviceSubRequestBuilder extends V1alpha3DeviceSubRequestFluent<V1alpha3DeviceSubRequestBuilder> implements VisitableBuilder<V1alpha3DeviceSubRequest,V1alpha3DeviceSubRequestBuilder>{
  public V1alpha3DeviceSubRequestBuilder() {
    this(new V1alpha3DeviceSubRequest());
  }
  
  public V1alpha3DeviceSubRequestBuilder(V1alpha3DeviceSubRequestFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceSubRequest());
  }
  
  public V1alpha3DeviceSubRequestBuilder(V1alpha3DeviceSubRequestFluent<?> fluent,V1alpha3DeviceSubRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3DeviceSubRequestBuilder(V1alpha3DeviceSubRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3DeviceSubRequestFluent<?> fluent;
  
  public V1alpha3DeviceSubRequest build() {
    V1alpha3DeviceSubRequest buildable = new V1alpha3DeviceSubRequest();
    buildable.setAllocationMode(fluent.getAllocationMode());
    buildable.setCount(fluent.getCount());
    buildable.setDeviceClassName(fluent.getDeviceClassName());
    buildable.setName(fluent.getName());
    buildable.setSelectors(fluent.buildSelectors());
    buildable.setTolerations(fluent.buildTolerations());
    return buildable;
  }
  

}