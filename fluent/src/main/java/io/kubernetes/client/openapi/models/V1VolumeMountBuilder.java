package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1VolumeMountBuilder extends V1VolumeMountFluentImpl<V1VolumeMountBuilder> implements VisitableBuilder<V1VolumeMount,V1VolumeMountBuilder>{
  public V1VolumeMountBuilder() {
    this(false);
  }
  public V1VolumeMountBuilder(Boolean validationEnabled) {
    this(new V1VolumeMount(), validationEnabled);
  }
  public V1VolumeMountBuilder(V1VolumeMountFluent<?> fluent) {
    this(fluent, false);
  }
  public V1VolumeMountBuilder(V1VolumeMountFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1VolumeMount(), validationEnabled);
  }
  public V1VolumeMountBuilder(V1VolumeMountFluent<?> fluent,V1VolumeMount instance) {
    this(fluent, instance, false);
  }
  public V1VolumeMountBuilder(V1VolumeMountFluent<?> fluent,V1VolumeMount instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMountPath(instance.getMountPath());

    fluent.withMountPropagation(instance.getMountPropagation());

    fluent.withName(instance.getName());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSubPath(instance.getSubPath());

    fluent.withSubPathExpr(instance.getSubPathExpr());

    this.validationEnabled = validationEnabled; 
  }
  public V1VolumeMountBuilder(V1VolumeMount instance) {
    this(instance,false);
  }
  public V1VolumeMountBuilder(V1VolumeMount instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withMountPath(instance.getMountPath());

    this.withMountPropagation(instance.getMountPropagation());

    this.withName(instance.getName());

    this.withReadOnly(instance.getReadOnly());

    this.withSubPath(instance.getSubPath());

    this.withSubPathExpr(instance.getSubPathExpr());

    this.validationEnabled = validationEnabled; 
  }
  V1VolumeMountFluent<?> fluent;
  Boolean validationEnabled;
  public V1VolumeMount build() {
    V1VolumeMount buildable = new V1VolumeMount();
    buildable.setMountPath(fluent.getMountPath());
    buildable.setMountPropagation(fluent.getMountPropagation());
    buildable.setName(fluent.getName());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSubPath(fluent.getSubPath());
    buildable.setSubPathExpr(fluent.getSubPathExpr());
    return buildable;
  }
  
}