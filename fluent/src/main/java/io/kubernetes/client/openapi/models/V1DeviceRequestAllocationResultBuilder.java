package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1DeviceRequestAllocationResultBuilder extends V1DeviceRequestAllocationResultFluent<V1DeviceRequestAllocationResultBuilder> implements VisitableBuilder<V1DeviceRequestAllocationResult,V1DeviceRequestAllocationResultBuilder>{
  public V1DeviceRequestAllocationResultBuilder() {
    this(new V1DeviceRequestAllocationResult());
  }
  
  public V1DeviceRequestAllocationResultBuilder(V1DeviceRequestAllocationResultFluent<?> fluent) {
    this(fluent, new V1DeviceRequestAllocationResult());
  }
  
  public V1DeviceRequestAllocationResultBuilder(V1DeviceRequestAllocationResultFluent<?> fluent,V1DeviceRequestAllocationResult instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DeviceRequestAllocationResultBuilder(V1DeviceRequestAllocationResult instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DeviceRequestAllocationResultFluent<?> fluent;
  
  public V1DeviceRequestAllocationResult build() {
    V1DeviceRequestAllocationResult buildable = new V1DeviceRequestAllocationResult();
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