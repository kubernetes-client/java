package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1DeviceRequestBuilder extends V1DeviceRequestFluent<V1DeviceRequestBuilder> implements VisitableBuilder<V1DeviceRequest,V1DeviceRequestBuilder>{

  V1DeviceRequestFluent<?> fluent;

  public V1DeviceRequestBuilder() {
    this(new V1DeviceRequest());
  }
  
  public V1DeviceRequestBuilder(V1DeviceRequestFluent<?> fluent) {
    this(fluent, new V1DeviceRequest());
  }
  
  public V1DeviceRequestBuilder(V1DeviceRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DeviceRequestBuilder(V1DeviceRequestFluent<?> fluent,V1DeviceRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DeviceRequest build() {
    V1DeviceRequest buildable = new V1DeviceRequest();
    buildable.setExactly(fluent.buildExactly());
    buildable.setFirstAvailable(fluent.buildFirstAvailable());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}