package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1JobTemplateSpecBuilder extends V1JobTemplateSpecFluentImpl<V1JobTemplateSpecBuilder> implements VisitableBuilder<V1JobTemplateSpec,V1JobTemplateSpecBuilder>{
  public V1JobTemplateSpecBuilder() {
    this(false);
  }
  public V1JobTemplateSpecBuilder(Boolean validationEnabled) {
    this(new V1JobTemplateSpec(), validationEnabled);
  }
  public V1JobTemplateSpecBuilder(V1JobTemplateSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1JobTemplateSpecBuilder(V1JobTemplateSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1JobTemplateSpec(), validationEnabled);
  }
  public V1JobTemplateSpecBuilder(V1JobTemplateSpecFluent<?> fluent,V1JobTemplateSpec instance) {
    this(fluent, instance, false);
  }
  public V1JobTemplateSpecBuilder(V1JobTemplateSpecFluent<?> fluent,V1JobTemplateSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled; 
  }
  public V1JobTemplateSpecBuilder(V1JobTemplateSpec instance) {
    this(instance,false);
  }
  public V1JobTemplateSpecBuilder(V1JobTemplateSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled; 
  }
  V1JobTemplateSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1JobTemplateSpec build() {
    V1JobTemplateSpec buildable = new V1JobTemplateSpec();
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }
  
}