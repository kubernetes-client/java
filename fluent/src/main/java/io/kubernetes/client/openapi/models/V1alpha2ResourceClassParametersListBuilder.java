package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceClassParametersListBuilder extends V1alpha2ResourceClassParametersListFluent<V1alpha2ResourceClassParametersListBuilder> implements VisitableBuilder<V1alpha2ResourceClassParametersList,V1alpha2ResourceClassParametersListBuilder>{
  public V1alpha2ResourceClassParametersListBuilder() {
    this(new V1alpha2ResourceClassParametersList());
  }
  
  public V1alpha2ResourceClassParametersListBuilder(V1alpha2ResourceClassParametersListFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceClassParametersList());
  }
  
  public V1alpha2ResourceClassParametersListBuilder(V1alpha2ResourceClassParametersListFluent<?> fluent,V1alpha2ResourceClassParametersList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceClassParametersListBuilder(V1alpha2ResourceClassParametersList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceClassParametersListFluent<?> fluent;
  
  public V1alpha2ResourceClassParametersList build() {
    V1alpha2ResourceClassParametersList buildable = new V1alpha2ResourceClassParametersList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}