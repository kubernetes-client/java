package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3ResourceClaimTemplateBuilder extends V1alpha3ResourceClaimTemplateFluent<V1alpha3ResourceClaimTemplateBuilder> implements VisitableBuilder<V1alpha3ResourceClaimTemplate,V1alpha3ResourceClaimTemplateBuilder>{
  public V1alpha3ResourceClaimTemplateBuilder() {
    this(new V1alpha3ResourceClaimTemplate());
  }
  
  public V1alpha3ResourceClaimTemplateBuilder(V1alpha3ResourceClaimTemplateFluent<?> fluent) {
    this(fluent, new V1alpha3ResourceClaimTemplate());
  }
  
  public V1alpha3ResourceClaimTemplateBuilder(V1alpha3ResourceClaimTemplateFluent<?> fluent,V1alpha3ResourceClaimTemplate instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3ResourceClaimTemplateBuilder(V1alpha3ResourceClaimTemplate instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3ResourceClaimTemplateFluent<?> fluent;
  
  public V1alpha3ResourceClaimTemplate build() {
    V1alpha3ResourceClaimTemplate buildable = new V1alpha3ResourceClaimTemplate();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}