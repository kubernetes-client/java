package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1VolumeNodeResourcesBuilder extends V1VolumeNodeResourcesFluentImpl<V1VolumeNodeResourcesBuilder> implements VisitableBuilder<V1VolumeNodeResources,V1VolumeNodeResourcesBuilder>{
  public V1VolumeNodeResourcesBuilder() {
    this(false);
  }
  public V1VolumeNodeResourcesBuilder(Boolean validationEnabled) {
    this(new V1VolumeNodeResources(), validationEnabled);
  }
  public V1VolumeNodeResourcesBuilder(V1VolumeNodeResourcesFluent<?> fluent) {
    this(fluent, false);
  }
  public V1VolumeNodeResourcesBuilder(V1VolumeNodeResourcesFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1VolumeNodeResources(), validationEnabled);
  }
  public V1VolumeNodeResourcesBuilder(V1VolumeNodeResourcesFluent<?> fluent,V1VolumeNodeResources instance) {
    this(fluent, instance, false);
  }
  public V1VolumeNodeResourcesBuilder(V1VolumeNodeResourcesFluent<?> fluent,V1VolumeNodeResources instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCount(instance.getCount());

    this.validationEnabled = validationEnabled; 
  }
  public V1VolumeNodeResourcesBuilder(V1VolumeNodeResources instance) {
    this(instance,false);
  }
  public V1VolumeNodeResourcesBuilder(V1VolumeNodeResources instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withCount(instance.getCount());

    this.validationEnabled = validationEnabled; 
  }
  V1VolumeNodeResourcesFluent<?> fluent;
  Boolean validationEnabled;
  public V1VolumeNodeResources build() {
    V1VolumeNodeResources buildable = new V1VolumeNodeResources();
    buildable.setCount(fluent.getCount());
    return buildable;
  }
  
}