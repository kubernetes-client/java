package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2DeviceAllocationResultBuilder extends V1beta2DeviceAllocationResultFluent<V1beta2DeviceAllocationResultBuilder> implements VisitableBuilder<V1beta2DeviceAllocationResult,V1beta2DeviceAllocationResultBuilder>{

  V1beta2DeviceAllocationResultFluent<?> fluent;

  public V1beta2DeviceAllocationResultBuilder() {
    this(new V1beta2DeviceAllocationResult());
  }
  
  public V1beta2DeviceAllocationResultBuilder(V1beta2DeviceAllocationResultFluent<?> fluent) {
    this(fluent, new V1beta2DeviceAllocationResult());
  }
  
  public V1beta2DeviceAllocationResultBuilder(V1beta2DeviceAllocationResult instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2DeviceAllocationResultBuilder(V1beta2DeviceAllocationResultFluent<?> fluent,V1beta2DeviceAllocationResult instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2DeviceAllocationResult build() {
    V1beta2DeviceAllocationResult buildable = new V1beta2DeviceAllocationResult();
    buildable.setConfig(fluent.buildConfig());
    buildable.setResults(fluent.buildResults());
    return buildable;
  }
  
}