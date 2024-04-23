package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1VolumeMountStatusBuilder extends V1VolumeMountStatusFluent<V1VolumeMountStatusBuilder> implements VisitableBuilder<V1VolumeMountStatus,V1VolumeMountStatusBuilder>{
  public V1VolumeMountStatusBuilder() {
    this(new V1VolumeMountStatus());
  }
  
  public V1VolumeMountStatusBuilder(V1VolumeMountStatusFluent<?> fluent) {
    this(fluent, new V1VolumeMountStatus());
  }
  
  public V1VolumeMountStatusBuilder(V1VolumeMountStatusFluent<?> fluent,V1VolumeMountStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1VolumeMountStatusBuilder(V1VolumeMountStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1VolumeMountStatusFluent<?> fluent;
  
  public V1VolumeMountStatus build() {
    V1VolumeMountStatus buildable = new V1VolumeMountStatus();
    buildable.setMountPath(fluent.getMountPath());
    buildable.setName(fluent.getName());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setRecursiveReadOnly(fluent.getRecursiveReadOnly());
    return buildable;
  }
  

}