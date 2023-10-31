package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1JobTemplateSpecBuilder extends V1JobTemplateSpecFluent<V1JobTemplateSpecBuilder> implements VisitableBuilder<V1JobTemplateSpec,V1JobTemplateSpecBuilder>{
  public V1JobTemplateSpecBuilder() {
    this(new V1JobTemplateSpec());
  }
  
  public V1JobTemplateSpecBuilder(V1JobTemplateSpecFluent<?> fluent) {
    this(fluent, new V1JobTemplateSpec());
  }
  
  public V1JobTemplateSpecBuilder(V1JobTemplateSpecFluent<?> fluent,V1JobTemplateSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1JobTemplateSpecBuilder(V1JobTemplateSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1JobTemplateSpecFluent<?> fluent;
  
  public V1JobTemplateSpec build() {
    V1JobTemplateSpec buildable = new V1JobTemplateSpec();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}