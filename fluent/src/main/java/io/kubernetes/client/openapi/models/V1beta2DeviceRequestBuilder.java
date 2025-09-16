package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2DeviceRequestBuilder extends V1beta2DeviceRequestFluent<V1beta2DeviceRequestBuilder> implements VisitableBuilder<V1beta2DeviceRequest,V1beta2DeviceRequestBuilder>{
  public V1beta2DeviceRequestBuilder() {
    this(new V1beta2DeviceRequest());
  }
  
  public V1beta2DeviceRequestBuilder(V1beta2DeviceRequestFluent<?> fluent) {
    this(fluent, new V1beta2DeviceRequest());
  }
  
  public V1beta2DeviceRequestBuilder(V1beta2DeviceRequestFluent<?> fluent,V1beta2DeviceRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2DeviceRequestBuilder(V1beta2DeviceRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2DeviceRequestFluent<?> fluent;
  
  public V1beta2DeviceRequest build() {
    V1beta2DeviceRequest buildable = new V1beta2DeviceRequest();
    buildable.setExactly(fluent.buildExactly());
    buildable.setFirstAvailable(fluent.buildFirstAvailable());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}