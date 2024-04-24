package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2NamedResourcesFilterBuilder extends V1alpha2NamedResourcesFilterFluent<V1alpha2NamedResourcesFilterBuilder> implements VisitableBuilder<V1alpha2NamedResourcesFilter,V1alpha2NamedResourcesFilterBuilder>{
  public V1alpha2NamedResourcesFilterBuilder() {
    this(new V1alpha2NamedResourcesFilter());
  }
  
  public V1alpha2NamedResourcesFilterBuilder(V1alpha2NamedResourcesFilterFluent<?> fluent) {
    this(fluent, new V1alpha2NamedResourcesFilter());
  }
  
  public V1alpha2NamedResourcesFilterBuilder(V1alpha2NamedResourcesFilterFluent<?> fluent,V1alpha2NamedResourcesFilter instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2NamedResourcesFilterBuilder(V1alpha2NamedResourcesFilter instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2NamedResourcesFilterFluent<?> fluent;
  
  public V1alpha2NamedResourcesFilter build() {
    V1alpha2NamedResourcesFilter buildable = new V1alpha2NamedResourcesFilter();
    buildable.setSelector(fluent.getSelector());
    return buildable;
  }
  

}