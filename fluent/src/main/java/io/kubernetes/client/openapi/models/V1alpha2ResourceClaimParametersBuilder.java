package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceClaimParametersBuilder extends V1alpha2ResourceClaimParametersFluent<V1alpha2ResourceClaimParametersBuilder> implements VisitableBuilder<V1alpha2ResourceClaimParameters,V1alpha2ResourceClaimParametersBuilder>{
  public V1alpha2ResourceClaimParametersBuilder() {
    this(new V1alpha2ResourceClaimParameters());
  }
  
  public V1alpha2ResourceClaimParametersBuilder(V1alpha2ResourceClaimParametersFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceClaimParameters());
  }
  
  public V1alpha2ResourceClaimParametersBuilder(V1alpha2ResourceClaimParametersFluent<?> fluent,V1alpha2ResourceClaimParameters instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceClaimParametersBuilder(V1alpha2ResourceClaimParameters instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceClaimParametersFluent<?> fluent;
  
  public V1alpha2ResourceClaimParameters build() {
    V1alpha2ResourceClaimParameters buildable = new V1alpha2ResourceClaimParameters();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDriverRequests(fluent.buildDriverRequests());
    buildable.setGeneratedFrom(fluent.buildGeneratedFrom());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setShareable(fluent.getShareable());
    return buildable;
  }
  

}