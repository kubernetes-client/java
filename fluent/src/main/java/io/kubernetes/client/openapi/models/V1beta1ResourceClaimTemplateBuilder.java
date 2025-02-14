package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ResourceClaimTemplateBuilder extends V1beta1ResourceClaimTemplateFluent<V1beta1ResourceClaimTemplateBuilder> implements VisitableBuilder<V1beta1ResourceClaimTemplate,V1beta1ResourceClaimTemplateBuilder>{
  public V1beta1ResourceClaimTemplateBuilder() {
    this(new V1beta1ResourceClaimTemplate());
  }
  
  public V1beta1ResourceClaimTemplateBuilder(V1beta1ResourceClaimTemplateFluent<?> fluent) {
    this(fluent, new V1beta1ResourceClaimTemplate());
  }
  
  public V1beta1ResourceClaimTemplateBuilder(V1beta1ResourceClaimTemplateFluent<?> fluent,V1beta1ResourceClaimTemplate instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ResourceClaimTemplateBuilder(V1beta1ResourceClaimTemplate instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ResourceClaimTemplateFluent<?> fluent;
  
  public V1beta1ResourceClaimTemplate build() {
    V1beta1ResourceClaimTemplate buildable = new V1beta1ResourceClaimTemplate();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}