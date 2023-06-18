package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha2ResourceClaimSpecBuilder extends V1alpha2ResourceClaimSpecFluentImpl<V1alpha2ResourceClaimSpecBuilder> implements VisitableBuilder<V1alpha2ResourceClaimSpec,V1alpha2ResourceClaimSpecBuilder>{
  public V1alpha2ResourceClaimSpecBuilder() {
    this(false);
  }
  public V1alpha2ResourceClaimSpecBuilder(Boolean validationEnabled) {
    this(new V1alpha2ResourceClaimSpec(), validationEnabled);
  }
  public V1alpha2ResourceClaimSpecBuilder(V1alpha2ResourceClaimSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha2ResourceClaimSpecBuilder(V1alpha2ResourceClaimSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha2ResourceClaimSpec(), validationEnabled);
  }
  public V1alpha2ResourceClaimSpecBuilder(V1alpha2ResourceClaimSpecFluent<?> fluent,V1alpha2ResourceClaimSpec instance) {
    this(fluent, instance, false);
  }
  public V1alpha2ResourceClaimSpecBuilder(V1alpha2ResourceClaimSpecFluent<?> fluent,V1alpha2ResourceClaimSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withAllocationMode(instance.getAllocationMode());
      fluent.withParametersRef(instance.getParametersRef());
      fluent.withResourceClassName(instance.getResourceClassName());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha2ResourceClaimSpecBuilder(V1alpha2ResourceClaimSpec instance) {
    this(instance,false);
  }
  public V1alpha2ResourceClaimSpecBuilder(V1alpha2ResourceClaimSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withAllocationMode(instance.getAllocationMode());
      this.withParametersRef(instance.getParametersRef());
      this.withResourceClassName(instance.getResourceClassName());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha2ResourceClaimSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha2ResourceClaimSpec build() {
    V1alpha2ResourceClaimSpec buildable = new V1alpha2ResourceClaimSpec();
    buildable.setAllocationMode(fluent.getAllocationMode());
    buildable.setParametersRef(fluent.getParametersRef());
    buildable.setResourceClassName(fluent.getResourceClassName());
    return buildable;
  }
  
}