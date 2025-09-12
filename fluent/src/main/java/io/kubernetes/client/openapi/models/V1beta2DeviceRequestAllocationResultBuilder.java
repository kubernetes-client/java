package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2DeviceRequestAllocationResultBuilder extends V1beta2DeviceRequestAllocationResultFluent<V1beta2DeviceRequestAllocationResultBuilder> implements VisitableBuilder<V1beta2DeviceRequestAllocationResult,V1beta2DeviceRequestAllocationResultBuilder>{
  public V1beta2DeviceRequestAllocationResultBuilder() {
    this(new V1beta2DeviceRequestAllocationResult());
  }
  
  public V1beta2DeviceRequestAllocationResultBuilder(V1beta2DeviceRequestAllocationResultFluent<?> fluent) {
    this(fluent, new V1beta2DeviceRequestAllocationResult());
  }
  
  public V1beta2DeviceRequestAllocationResultBuilder(V1beta2DeviceRequestAllocationResultFluent<?> fluent,V1beta2DeviceRequestAllocationResult instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2DeviceRequestAllocationResultBuilder(V1beta2DeviceRequestAllocationResult instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2DeviceRequestAllocationResultFluent<?> fluent;
  
  public V1beta2DeviceRequestAllocationResult build() {
    V1beta2DeviceRequestAllocationResult buildable = new V1beta2DeviceRequestAllocationResult();
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