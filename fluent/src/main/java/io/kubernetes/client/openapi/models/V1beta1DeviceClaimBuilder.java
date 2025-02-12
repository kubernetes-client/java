package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1DeviceClaimBuilder extends V1beta1DeviceClaimFluent<V1beta1DeviceClaimBuilder> implements VisitableBuilder<V1beta1DeviceClaim,V1beta1DeviceClaimBuilder>{
  public V1beta1DeviceClaimBuilder() {
    this(new V1beta1DeviceClaim());
  }
  
  public V1beta1DeviceClaimBuilder(V1beta1DeviceClaimFluent<?> fluent) {
    this(fluent, new V1beta1DeviceClaim());
  }
  
  public V1beta1DeviceClaimBuilder(V1beta1DeviceClaimFluent<?> fluent,V1beta1DeviceClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1DeviceClaimBuilder(V1beta1DeviceClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1DeviceClaimFluent<?> fluent;
  
  public V1beta1DeviceClaim build() {
    V1beta1DeviceClaim buildable = new V1beta1DeviceClaim();
    buildable.setConfig(fluent.buildConfig());
    buildable.setConstraints(fluent.buildConstraints());
    buildable.setRequests(fluent.buildRequests());
    return buildable;
  }
  

}