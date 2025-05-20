package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2ResourcePoolBuilder extends V1beta2ResourcePoolFluent<V1beta2ResourcePoolBuilder> implements VisitableBuilder<V1beta2ResourcePool,V1beta2ResourcePoolBuilder>{
  public V1beta2ResourcePoolBuilder() {
    this(new V1beta2ResourcePool());
  }
  
  public V1beta2ResourcePoolBuilder(V1beta2ResourcePoolFluent<?> fluent) {
    this(fluent, new V1beta2ResourcePool());
  }
  
  public V1beta2ResourcePoolBuilder(V1beta2ResourcePoolFluent<?> fluent,V1beta2ResourcePool instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2ResourcePoolBuilder(V1beta2ResourcePool instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2ResourcePoolFluent<?> fluent;
  
  public V1beta2ResourcePool build() {
    V1beta2ResourcePool buildable = new V1beta2ResourcePool();
    buildable.setGeneration(fluent.getGeneration());
    buildable.setName(fluent.getName());
    buildable.setResourceSliceCount(fluent.getResourceSliceCount());
    return buildable;
  }
  

}