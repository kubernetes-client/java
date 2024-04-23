package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2DriverRequestsBuilder extends V1alpha2DriverRequestsFluent<V1alpha2DriverRequestsBuilder> implements VisitableBuilder<V1alpha2DriverRequests,V1alpha2DriverRequestsBuilder>{
  public V1alpha2DriverRequestsBuilder() {
    this(new V1alpha2DriverRequests());
  }
  
  public V1alpha2DriverRequestsBuilder(V1alpha2DriverRequestsFluent<?> fluent) {
    this(fluent, new V1alpha2DriverRequests());
  }
  
  public V1alpha2DriverRequestsBuilder(V1alpha2DriverRequestsFluent<?> fluent,V1alpha2DriverRequests instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2DriverRequestsBuilder(V1alpha2DriverRequests instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2DriverRequestsFluent<?> fluent;
  
  public V1alpha2DriverRequests build() {
    V1alpha2DriverRequests buildable = new V1alpha2DriverRequests();
    buildable.setDriverName(fluent.getDriverName());
    buildable.setRequests(fluent.buildRequests());
    buildable.setVendorParameters(fluent.getVendorParameters());
    return buildable;
  }
  

}