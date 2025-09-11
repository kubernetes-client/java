package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1DeviceRequestAllocationResultBuilder extends V1beta1DeviceRequestAllocationResultFluent<V1beta1DeviceRequestAllocationResultBuilder> implements VisitableBuilder<V1beta1DeviceRequestAllocationResult,V1beta1DeviceRequestAllocationResultBuilder>{
  public V1beta1DeviceRequestAllocationResultBuilder() {
    this(new V1beta1DeviceRequestAllocationResult());
  }
  
  public V1beta1DeviceRequestAllocationResultBuilder(V1beta1DeviceRequestAllocationResultFluent<?> fluent) {
    this(fluent, new V1beta1DeviceRequestAllocationResult());
  }
  
  public V1beta1DeviceRequestAllocationResultBuilder(V1beta1DeviceRequestAllocationResultFluent<?> fluent,V1beta1DeviceRequestAllocationResult instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1DeviceRequestAllocationResultBuilder(V1beta1DeviceRequestAllocationResult instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1DeviceRequestAllocationResultFluent<?> fluent;
  
  public V1beta1DeviceRequestAllocationResult build() {
    V1beta1DeviceRequestAllocationResult buildable = new V1beta1DeviceRequestAllocationResult();
    buildable.setAdminAccess(fluent.getAdminAccess());
    buildable.setBindingConditions(fluent.getBindingConditions());
    buildable.setBindingFailureConditions(fluent.getBindingFailureConditions());
    buildable.setConsumedCapacity(fluent.getConsumedCapacity());
    buildable.setDevice(fluent.getDevice());
    buildable.setDriver(fluent.getDriver());
    buildable.setPool(fluent.getPool());
    buildable.setRequest(fluent.getRequest());
    buildable.setShareID(fluent.getShareID());
    buildable.setTolerations(fluent.buildTolerations());
    return buildable;
  }
  

}