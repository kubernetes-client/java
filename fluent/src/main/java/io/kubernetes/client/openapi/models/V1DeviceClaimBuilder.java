package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1DeviceClaimBuilder extends V1DeviceClaimFluent<V1DeviceClaimBuilder> implements VisitableBuilder<V1DeviceClaim,V1DeviceClaimBuilder>{
  public V1DeviceClaimBuilder() {
    this(new V1DeviceClaim());
  }
  
  public V1DeviceClaimBuilder(V1DeviceClaimFluent<?> fluent) {
    this(fluent, new V1DeviceClaim());
  }
  
  public V1DeviceClaimBuilder(V1DeviceClaimFluent<?> fluent,V1DeviceClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DeviceClaimBuilder(V1DeviceClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DeviceClaimFluent<?> fluent;
  
  public V1DeviceClaim build() {
    V1DeviceClaim buildable = new V1DeviceClaim();
    buildable.setConfig(fluent.buildConfig());
    buildable.setConstraints(fluent.buildConstraints());
    buildable.setRequests(fluent.buildRequests());
    return buildable;
  }
  

}