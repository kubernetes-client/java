package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2DeviceClaimBuilder extends V1beta2DeviceClaimFluent<V1beta2DeviceClaimBuilder> implements VisitableBuilder<V1beta2DeviceClaim,V1beta2DeviceClaimBuilder>{
  public V1beta2DeviceClaimBuilder() {
    this(new V1beta2DeviceClaim());
  }
  
  public V1beta2DeviceClaimBuilder(V1beta2DeviceClaimFluent<?> fluent) {
    this(fluent, new V1beta2DeviceClaim());
  }
  
  public V1beta2DeviceClaimBuilder(V1beta2DeviceClaimFluent<?> fluent,V1beta2DeviceClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2DeviceClaimBuilder(V1beta2DeviceClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2DeviceClaimFluent<?> fluent;
  
  public V1beta2DeviceClaim build() {
    V1beta2DeviceClaim buildable = new V1beta2DeviceClaim();
    buildable.setConfig(fluent.buildConfig());
    buildable.setConstraints(fluent.buildConstraints());
    buildable.setRequests(fluent.buildRequests());
    return buildable;
  }
  

}