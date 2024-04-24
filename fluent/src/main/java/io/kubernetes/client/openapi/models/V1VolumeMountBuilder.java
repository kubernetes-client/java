package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1VolumeMountBuilder extends V1VolumeMountFluent<V1VolumeMountBuilder> implements VisitableBuilder<V1VolumeMount,V1VolumeMountBuilder>{
  public V1VolumeMountBuilder() {
    this(new V1VolumeMount());
  }
  
  public V1VolumeMountBuilder(V1VolumeMountFluent<?> fluent) {
    this(fluent, new V1VolumeMount());
  }
  
  public V1VolumeMountBuilder(V1VolumeMountFluent<?> fluent,V1VolumeMount instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1VolumeMountBuilder(V1VolumeMount instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1VolumeMountFluent<?> fluent;
  
  public V1VolumeMount build() {
    V1VolumeMount buildable = new V1VolumeMount();
    buildable.setMountPath(fluent.getMountPath());
    buildable.setMountPropagation(fluent.getMountPropagation());
    buildable.setName(fluent.getName());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setRecursiveReadOnly(fluent.getRecursiveReadOnly());
    buildable.setSubPath(fluent.getSubPath());
    buildable.setSubPathExpr(fluent.getSubPathExpr());
    return buildable;
  }
  

}