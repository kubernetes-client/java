package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3ResourcePoolBuilder extends V1alpha3ResourcePoolFluent<V1alpha3ResourcePoolBuilder> implements VisitableBuilder<V1alpha3ResourcePool,V1alpha3ResourcePoolBuilder>{
  public V1alpha3ResourcePoolBuilder() {
    this(new V1alpha3ResourcePool());
  }
  
  public V1alpha3ResourcePoolBuilder(V1alpha3ResourcePoolFluent<?> fluent) {
    this(fluent, new V1alpha3ResourcePool());
  }
  
  public V1alpha3ResourcePoolBuilder(V1alpha3ResourcePoolFluent<?> fluent,V1alpha3ResourcePool instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3ResourcePoolBuilder(V1alpha3ResourcePool instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3ResourcePoolFluent<?> fluent;
  
  public V1alpha3ResourcePool build() {
    V1alpha3ResourcePool buildable = new V1alpha3ResourcePool();
    buildable.setGeneration(fluent.getGeneration());
    buildable.setName(fluent.getName());
    buildable.setResourceSliceCount(fluent.getResourceSliceCount());
    return buildable;
  }
  

}