package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceFilterBuilder extends V1alpha2ResourceFilterFluent<V1alpha2ResourceFilterBuilder> implements VisitableBuilder<V1alpha2ResourceFilter,V1alpha2ResourceFilterBuilder>{
  public V1alpha2ResourceFilterBuilder() {
    this(new V1alpha2ResourceFilter());
  }
  
  public V1alpha2ResourceFilterBuilder(V1alpha2ResourceFilterFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceFilter());
  }
  
  public V1alpha2ResourceFilterBuilder(V1alpha2ResourceFilterFluent<?> fluent,V1alpha2ResourceFilter instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceFilterBuilder(V1alpha2ResourceFilter instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceFilterFluent<?> fluent;
  
  public V1alpha2ResourceFilter build() {
    V1alpha2ResourceFilter buildable = new V1alpha2ResourceFilter();
    buildable.setDriverName(fluent.getDriverName());
    buildable.setNamedResources(fluent.buildNamedResources());
    return buildable;
  }
  

}