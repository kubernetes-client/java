package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1VolumeNodeResourcesBuilder extends V1VolumeNodeResourcesFluent<V1VolumeNodeResourcesBuilder> implements VisitableBuilder<V1VolumeNodeResources,V1VolumeNodeResourcesBuilder>{
  public V1VolumeNodeResourcesBuilder() {
    this(new V1VolumeNodeResources());
  }
  
  public V1VolumeNodeResourcesBuilder(V1VolumeNodeResourcesFluent<?> fluent) {
    this(fluent, new V1VolumeNodeResources());
  }
  
  public V1VolumeNodeResourcesBuilder(V1VolumeNodeResourcesFluent<?> fluent,V1VolumeNodeResources instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1VolumeNodeResourcesBuilder(V1VolumeNodeResources instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1VolumeNodeResourcesFluent<?> fluent;
  
  public V1VolumeNodeResources build() {
    V1VolumeNodeResources buildable = new V1VolumeNodeResources();
    buildable.setCount(fluent.getCount());
    return buildable;
  }
  

}