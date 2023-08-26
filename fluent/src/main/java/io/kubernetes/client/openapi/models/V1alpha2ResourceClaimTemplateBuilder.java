package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha2ResourceClaimTemplateBuilder extends V1alpha2ResourceClaimTemplateFluentImpl<V1alpha2ResourceClaimTemplateBuilder> implements VisitableBuilder<V1alpha2ResourceClaimTemplate,V1alpha2ResourceClaimTemplateBuilder>{
  public V1alpha2ResourceClaimTemplateBuilder() {
    this(false);
  }
  public V1alpha2ResourceClaimTemplateBuilder(Boolean validationEnabled) {
    this(new V1alpha2ResourceClaimTemplate(), validationEnabled);
  }
  public V1alpha2ResourceClaimTemplateBuilder(V1alpha2ResourceClaimTemplateFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha2ResourceClaimTemplateBuilder(V1alpha2ResourceClaimTemplateFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha2ResourceClaimTemplate(), validationEnabled);
  }
  public V1alpha2ResourceClaimTemplateBuilder(V1alpha2ResourceClaimTemplateFluent<?> fluent,V1alpha2ResourceClaimTemplate instance) {
    this(fluent, instance, false);
  }
  public V1alpha2ResourceClaimTemplateBuilder(V1alpha2ResourceClaimTemplateFluent<?> fluent,V1alpha2ResourceClaimTemplate instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
      fluent.withSpec(instance.getSpec());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha2ResourceClaimTemplateBuilder(V1alpha2ResourceClaimTemplate instance) {
    this(instance,false);
  }
  public V1alpha2ResourceClaimTemplateBuilder(V1alpha2ResourceClaimTemplate instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withSpec(instance.getSpec());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha2ResourceClaimTemplateFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha2ResourceClaimTemplate build() {
    V1alpha2ResourceClaimTemplate buildable = new V1alpha2ResourceClaimTemplate();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }
  
}