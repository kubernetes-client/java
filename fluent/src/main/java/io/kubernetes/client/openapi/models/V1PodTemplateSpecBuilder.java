package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodTemplateSpecBuilder extends V1PodTemplateSpecFluent<V1PodTemplateSpecBuilder> implements VisitableBuilder<V1PodTemplateSpec,V1PodTemplateSpecBuilder>{
  public V1PodTemplateSpecBuilder() {
    this(new V1PodTemplateSpec());
  }
  
  public V1PodTemplateSpecBuilder(V1PodTemplateSpecFluent<?> fluent) {
    this(fluent, new V1PodTemplateSpec());
  }
  
  public V1PodTemplateSpecBuilder(V1PodTemplateSpecFluent<?> fluent,V1PodTemplateSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodTemplateSpecBuilder(V1PodTemplateSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodTemplateSpecFluent<?> fluent;
  
  public V1PodTemplateSpec build() {
    V1PodTemplateSpec buildable = new V1PodTemplateSpec();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}