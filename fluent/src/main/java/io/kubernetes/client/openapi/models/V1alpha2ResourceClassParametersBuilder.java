package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceClassParametersBuilder extends V1alpha2ResourceClassParametersFluent<V1alpha2ResourceClassParametersBuilder> implements VisitableBuilder<V1alpha2ResourceClassParameters,V1alpha2ResourceClassParametersBuilder>{
  public V1alpha2ResourceClassParametersBuilder() {
    this(new V1alpha2ResourceClassParameters());
  }
  
  public V1alpha2ResourceClassParametersBuilder(V1alpha2ResourceClassParametersFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceClassParameters());
  }
  
  public V1alpha2ResourceClassParametersBuilder(V1alpha2ResourceClassParametersFluent<?> fluent,V1alpha2ResourceClassParameters instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceClassParametersBuilder(V1alpha2ResourceClassParameters instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceClassParametersFluent<?> fluent;
  
  public V1alpha2ResourceClassParameters build() {
    V1alpha2ResourceClassParameters buildable = new V1alpha2ResourceClassParameters();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setFilters(fluent.buildFilters());
    buildable.setGeneratedFrom(fluent.buildGeneratedFrom());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setVendorParameters(fluent.buildVendorParameters());
    return buildable;
  }
  

}