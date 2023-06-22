package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha2ResourceClaimTemplateSpecBuilder extends V1alpha2ResourceClaimTemplateSpecFluentImpl<V1alpha2ResourceClaimTemplateSpecBuilder> implements VisitableBuilder<V1alpha2ResourceClaimTemplateSpec,V1alpha2ResourceClaimTemplateSpecBuilder>{
  public V1alpha2ResourceClaimTemplateSpecBuilder() {
    this(false);
  }
  public V1alpha2ResourceClaimTemplateSpecBuilder(Boolean validationEnabled) {
    this(new V1alpha2ResourceClaimTemplateSpec(), validationEnabled);
  }
  public V1alpha2ResourceClaimTemplateSpecBuilder(V1alpha2ResourceClaimTemplateSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha2ResourceClaimTemplateSpecBuilder(V1alpha2ResourceClaimTemplateSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha2ResourceClaimTemplateSpec(), validationEnabled);
  }
  public V1alpha2ResourceClaimTemplateSpecBuilder(V1alpha2ResourceClaimTemplateSpecFluent<?> fluent,V1alpha2ResourceClaimTemplateSpec instance) {
    this(fluent, instance, false);
  }
  public V1alpha2ResourceClaimTemplateSpecBuilder(V1alpha2ResourceClaimTemplateSpecFluent<?> fluent,V1alpha2ResourceClaimTemplateSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withMetadata(instance.getMetadata());
      fluent.withSpec(instance.getSpec());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha2ResourceClaimTemplateSpecBuilder(V1alpha2ResourceClaimTemplateSpec instance) {
    this(instance,false);
  }
  public V1alpha2ResourceClaimTemplateSpecBuilder(V1alpha2ResourceClaimTemplateSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withMetadata(instance.getMetadata());
      this.withSpec(instance.getSpec());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha2ResourceClaimTemplateSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha2ResourceClaimTemplateSpec build() {
    V1alpha2ResourceClaimTemplateSpec buildable = new V1alpha2ResourceClaimTemplateSpec();
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }
  
}