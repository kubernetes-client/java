package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3DeviceClaimBuilder extends V1alpha3DeviceClaimFluent<V1alpha3DeviceClaimBuilder> implements VisitableBuilder<V1alpha3DeviceClaim,V1alpha3DeviceClaimBuilder>{
  public V1alpha3DeviceClaimBuilder() {
    this(new V1alpha3DeviceClaim());
  }
  
  public V1alpha3DeviceClaimBuilder(V1alpha3DeviceClaimFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceClaim());
  }
  
  public V1alpha3DeviceClaimBuilder(V1alpha3DeviceClaimFluent<?> fluent,V1alpha3DeviceClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3DeviceClaimBuilder(V1alpha3DeviceClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3DeviceClaimFluent<?> fluent;
  
  public V1alpha3DeviceClaim build() {
    V1alpha3DeviceClaim buildable = new V1alpha3DeviceClaim();
    buildable.setConfig(fluent.buildConfig());
    buildable.setConstraints(fluent.buildConstraints());
    buildable.setRequests(fluent.buildRequests());
    return buildable;
  }
  

}