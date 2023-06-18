package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ClaimSourceBuilder extends V1ClaimSourceFluentImpl<V1ClaimSourceBuilder> implements VisitableBuilder<V1ClaimSource,V1ClaimSourceBuilder>{
  public V1ClaimSourceBuilder() {
    this(false);
  }
  public V1ClaimSourceBuilder(Boolean validationEnabled) {
    this(new V1ClaimSource(), validationEnabled);
  }
  public V1ClaimSourceBuilder(V1ClaimSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ClaimSourceBuilder(V1ClaimSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ClaimSource(), validationEnabled);
  }
  public V1ClaimSourceBuilder(V1ClaimSourceFluent<?> fluent,V1ClaimSource instance) {
    this(fluent, instance, false);
  }
  public V1ClaimSourceBuilder(V1ClaimSourceFluent<?> fluent,V1ClaimSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withResourceClaimName(instance.getResourceClaimName());
      fluent.withResourceClaimTemplateName(instance.getResourceClaimTemplateName());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1ClaimSourceBuilder(V1ClaimSource instance) {
    this(instance,false);
  }
  public V1ClaimSourceBuilder(V1ClaimSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withResourceClaimName(instance.getResourceClaimName());
      this.withResourceClaimTemplateName(instance.getResourceClaimTemplateName());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1ClaimSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1ClaimSource build() {
    V1ClaimSource buildable = new V1ClaimSource();
    buildable.setResourceClaimName(fluent.getResourceClaimName());
    buildable.setResourceClaimTemplateName(fluent.getResourceClaimTemplateName());
    return buildable;
  }
  
}