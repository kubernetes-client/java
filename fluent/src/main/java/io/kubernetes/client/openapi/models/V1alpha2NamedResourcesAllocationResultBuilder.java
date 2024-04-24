package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2NamedResourcesAllocationResultBuilder extends V1alpha2NamedResourcesAllocationResultFluent<V1alpha2NamedResourcesAllocationResultBuilder> implements VisitableBuilder<V1alpha2NamedResourcesAllocationResult,V1alpha2NamedResourcesAllocationResultBuilder>{
  public V1alpha2NamedResourcesAllocationResultBuilder() {
    this(new V1alpha2NamedResourcesAllocationResult());
  }
  
  public V1alpha2NamedResourcesAllocationResultBuilder(V1alpha2NamedResourcesAllocationResultFluent<?> fluent) {
    this(fluent, new V1alpha2NamedResourcesAllocationResult());
  }
  
  public V1alpha2NamedResourcesAllocationResultBuilder(V1alpha2NamedResourcesAllocationResultFluent<?> fluent,V1alpha2NamedResourcesAllocationResult instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2NamedResourcesAllocationResultBuilder(V1alpha2NamedResourcesAllocationResult instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2NamedResourcesAllocationResultFluent<?> fluent;
  
  public V1alpha2NamedResourcesAllocationResult build() {
    V1alpha2NamedResourcesAllocationResult buildable = new V1alpha2NamedResourcesAllocationResult();
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}