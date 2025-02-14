package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ResourcePoolBuilder extends V1beta1ResourcePoolFluent<V1beta1ResourcePoolBuilder> implements VisitableBuilder<V1beta1ResourcePool,V1beta1ResourcePoolBuilder>{
  public V1beta1ResourcePoolBuilder() {
    this(new V1beta1ResourcePool());
  }
  
  public V1beta1ResourcePoolBuilder(V1beta1ResourcePoolFluent<?> fluent) {
    this(fluent, new V1beta1ResourcePool());
  }
  
  public V1beta1ResourcePoolBuilder(V1beta1ResourcePoolFluent<?> fluent,V1beta1ResourcePool instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ResourcePoolBuilder(V1beta1ResourcePool instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ResourcePoolFluent<?> fluent;
  
  public V1beta1ResourcePool build() {
    V1beta1ResourcePool buildable = new V1beta1ResourcePool();
    buildable.setGeneration(fluent.getGeneration());
    buildable.setName(fluent.getName());
    buildable.setResourceSliceCount(fluent.getResourceSliceCount());
    return buildable;
  }
  

}