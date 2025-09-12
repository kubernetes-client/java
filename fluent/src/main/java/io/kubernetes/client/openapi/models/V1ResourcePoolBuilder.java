package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1ResourcePoolBuilder extends V1ResourcePoolFluent<V1ResourcePoolBuilder> implements VisitableBuilder<V1ResourcePool,V1ResourcePoolBuilder>{
  public V1ResourcePoolBuilder() {
    this(new V1ResourcePool());
  }
  
  public V1ResourcePoolBuilder(V1ResourcePoolFluent<?> fluent) {
    this(fluent, new V1ResourcePool());
  }
  
  public V1ResourcePoolBuilder(V1ResourcePoolFluent<?> fluent,V1ResourcePool instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ResourcePoolBuilder(V1ResourcePool instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ResourcePoolFluent<?> fluent;
  
  public V1ResourcePool build() {
    V1ResourcePool buildable = new V1ResourcePool();
    buildable.setGeneration(fluent.getGeneration());
    buildable.setName(fluent.getName());
    buildable.setResourceSliceCount(fluent.getResourceSliceCount());
    return buildable;
  }
  

}