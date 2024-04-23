package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ModifyVolumeStatusBuilder extends V1ModifyVolumeStatusFluent<V1ModifyVolumeStatusBuilder> implements VisitableBuilder<V1ModifyVolumeStatus,V1ModifyVolumeStatusBuilder>{
  public V1ModifyVolumeStatusBuilder() {
    this(new V1ModifyVolumeStatus());
  }
  
  public V1ModifyVolumeStatusBuilder(V1ModifyVolumeStatusFluent<?> fluent) {
    this(fluent, new V1ModifyVolumeStatus());
  }
  
  public V1ModifyVolumeStatusBuilder(V1ModifyVolumeStatusFluent<?> fluent,V1ModifyVolumeStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ModifyVolumeStatusBuilder(V1ModifyVolumeStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ModifyVolumeStatusFluent<?> fluent;
  
  public V1ModifyVolumeStatus build() {
    V1ModifyVolumeStatus buildable = new V1ModifyVolumeStatus();
    buildable.setStatus(fluent.getStatus());
    buildable.setTargetVolumeAttributesClassName(fluent.getTargetVolumeAttributesClassName());
    return buildable;
  }
  

}