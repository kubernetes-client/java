package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha2ResourceClaimParametersReferenceBuilder extends V1alpha2ResourceClaimParametersReferenceFluentImpl<V1alpha2ResourceClaimParametersReferenceBuilder> implements VisitableBuilder<V1alpha2ResourceClaimParametersReference,V1alpha2ResourceClaimParametersReferenceBuilder>{
  public V1alpha2ResourceClaimParametersReferenceBuilder() {
    this(false);
  }
  public V1alpha2ResourceClaimParametersReferenceBuilder(Boolean validationEnabled) {
    this(new V1alpha2ResourceClaimParametersReference(), validationEnabled);
  }
  public V1alpha2ResourceClaimParametersReferenceBuilder(V1alpha2ResourceClaimParametersReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha2ResourceClaimParametersReferenceBuilder(V1alpha2ResourceClaimParametersReferenceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha2ResourceClaimParametersReference(), validationEnabled);
  }
  public V1alpha2ResourceClaimParametersReferenceBuilder(V1alpha2ResourceClaimParametersReferenceFluent<?> fluent,V1alpha2ResourceClaimParametersReference instance) {
    this(fluent, instance, false);
  }
  public V1alpha2ResourceClaimParametersReferenceBuilder(V1alpha2ResourceClaimParametersReferenceFluent<?> fluent,V1alpha2ResourceClaimParametersReference instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiGroup(instance.getApiGroup());
      fluent.withKind(instance.getKind());
      fluent.withName(instance.getName());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha2ResourceClaimParametersReferenceBuilder(V1alpha2ResourceClaimParametersReference instance) {
    this(instance,false);
  }
  public V1alpha2ResourceClaimParametersReferenceBuilder(V1alpha2ResourceClaimParametersReference instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiGroup(instance.getApiGroup());
      this.withKind(instance.getKind());
      this.withName(instance.getName());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha2ResourceClaimParametersReferenceFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha2ResourceClaimParametersReference build() {
    V1alpha2ResourceClaimParametersReference buildable = new V1alpha2ResourceClaimParametersReference();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}