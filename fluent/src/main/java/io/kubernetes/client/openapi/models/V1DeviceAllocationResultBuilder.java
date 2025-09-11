package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1DeviceAllocationResultBuilder extends V1DeviceAllocationResultFluent<V1DeviceAllocationResultBuilder> implements VisitableBuilder<V1DeviceAllocationResult,V1DeviceAllocationResultBuilder>{
  public V1DeviceAllocationResultBuilder() {
    this(new V1DeviceAllocationResult());
  }
  
  public V1DeviceAllocationResultBuilder(V1DeviceAllocationResultFluent<?> fluent) {
    this(fluent, new V1DeviceAllocationResult());
  }
  
  public V1DeviceAllocationResultBuilder(V1DeviceAllocationResultFluent<?> fluent,V1DeviceAllocationResult instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DeviceAllocationResultBuilder(V1DeviceAllocationResult instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DeviceAllocationResultFluent<?> fluent;
  
  public V1DeviceAllocationResult build() {
    V1DeviceAllocationResult buildable = new V1DeviceAllocationResult();
    buildable.setConfig(fluent.buildConfig());
    buildable.setResults(fluent.buildResults());
    return buildable;
  }
  

}