package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2ResourceClaimTemplateBuilder extends V1beta2ResourceClaimTemplateFluent<V1beta2ResourceClaimTemplateBuilder> implements VisitableBuilder<V1beta2ResourceClaimTemplate,V1beta2ResourceClaimTemplateBuilder>{
  public V1beta2ResourceClaimTemplateBuilder() {
    this(new V1beta2ResourceClaimTemplate());
  }
  
  public V1beta2ResourceClaimTemplateBuilder(V1beta2ResourceClaimTemplateFluent<?> fluent) {
    this(fluent, new V1beta2ResourceClaimTemplate());
  }
  
  public V1beta2ResourceClaimTemplateBuilder(V1beta2ResourceClaimTemplateFluent<?> fluent,V1beta2ResourceClaimTemplate instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2ResourceClaimTemplateBuilder(V1beta2ResourceClaimTemplate instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2ResourceClaimTemplateFluent<?> fluent;
  
  public V1beta2ResourceClaimTemplate build() {
    V1beta2ResourceClaimTemplate buildable = new V1beta2ResourceClaimTemplate();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}