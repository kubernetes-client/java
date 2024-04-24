package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceClaimParametersListBuilder extends V1alpha2ResourceClaimParametersListFluent<V1alpha2ResourceClaimParametersListBuilder> implements VisitableBuilder<V1alpha2ResourceClaimParametersList,V1alpha2ResourceClaimParametersListBuilder>{
  public V1alpha2ResourceClaimParametersListBuilder() {
    this(new V1alpha2ResourceClaimParametersList());
  }
  
  public V1alpha2ResourceClaimParametersListBuilder(V1alpha2ResourceClaimParametersListFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceClaimParametersList());
  }
  
  public V1alpha2ResourceClaimParametersListBuilder(V1alpha2ResourceClaimParametersListFluent<?> fluent,V1alpha2ResourceClaimParametersList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceClaimParametersListBuilder(V1alpha2ResourceClaimParametersList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceClaimParametersListFluent<?> fluent;
  
  public V1alpha2ResourceClaimParametersList build() {
    V1alpha2ResourceClaimParametersList buildable = new V1alpha2ResourceClaimParametersList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}