package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodTemplateSpecBuilder extends V1PodTemplateSpecFluentImpl<V1PodTemplateSpecBuilder> implements VisitableBuilder<V1PodTemplateSpec,V1PodTemplateSpecBuilder>{
  public V1PodTemplateSpecBuilder() {
    this(false);
  }
  public V1PodTemplateSpecBuilder(Boolean validationEnabled) {
    this(new V1PodTemplateSpec(), validationEnabled);
  }
  public V1PodTemplateSpecBuilder(V1PodTemplateSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodTemplateSpecBuilder(V1PodTemplateSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodTemplateSpec(), validationEnabled);
  }
  public V1PodTemplateSpecBuilder(V1PodTemplateSpecFluent<?> fluent,V1PodTemplateSpec instance) {
    this(fluent, instance, false);
  }
  public V1PodTemplateSpecBuilder(V1PodTemplateSpecFluent<?> fluent,V1PodTemplateSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodTemplateSpecBuilder(V1PodTemplateSpec instance) {
    this(instance,false);
  }
  public V1PodTemplateSpecBuilder(V1PodTemplateSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled; 
  }
  V1PodTemplateSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodTemplateSpec build() {
    V1PodTemplateSpec buildable = new V1PodTemplateSpec();
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }
  
}