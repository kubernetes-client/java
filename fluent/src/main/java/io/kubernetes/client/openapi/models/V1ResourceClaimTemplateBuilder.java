package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1ResourceClaimTemplateBuilder extends V1ResourceClaimTemplateFluent<V1ResourceClaimTemplateBuilder> implements VisitableBuilder<V1ResourceClaimTemplate,V1ResourceClaimTemplateBuilder>{
  public V1ResourceClaimTemplateBuilder() {
    this(new V1ResourceClaimTemplate());
  }
  
  public V1ResourceClaimTemplateBuilder(V1ResourceClaimTemplateFluent<?> fluent) {
    this(fluent, new V1ResourceClaimTemplate());
  }
  
  public V1ResourceClaimTemplateBuilder(V1ResourceClaimTemplateFluent<?> fluent,V1ResourceClaimTemplate instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ResourceClaimTemplateBuilder(V1ResourceClaimTemplate instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ResourceClaimTemplateFluent<?> fluent;
  
  public V1ResourceClaimTemplate build() {
    V1ResourceClaimTemplate buildable = new V1ResourceClaimTemplate();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}