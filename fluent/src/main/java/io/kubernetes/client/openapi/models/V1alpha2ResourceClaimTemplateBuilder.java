package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceClaimTemplateBuilder extends V1alpha2ResourceClaimTemplateFluent<V1alpha2ResourceClaimTemplateBuilder> implements VisitableBuilder<V1alpha2ResourceClaimTemplate,V1alpha2ResourceClaimTemplateBuilder>{
  public V1alpha2ResourceClaimTemplateBuilder() {
    this(new V1alpha2ResourceClaimTemplate());
  }
  
  public V1alpha2ResourceClaimTemplateBuilder(V1alpha2ResourceClaimTemplateFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceClaimTemplate());
  }
  
  public V1alpha2ResourceClaimTemplateBuilder(V1alpha2ResourceClaimTemplateFluent<?> fluent,V1alpha2ResourceClaimTemplate instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceClaimTemplateBuilder(V1alpha2ResourceClaimTemplate instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceClaimTemplateFluent<?> fluent;
  
  public V1alpha2ResourceClaimTemplate build() {
    V1alpha2ResourceClaimTemplate buildable = new V1alpha2ResourceClaimTemplate();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}