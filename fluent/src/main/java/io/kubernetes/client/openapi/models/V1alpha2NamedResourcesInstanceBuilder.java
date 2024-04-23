package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2NamedResourcesInstanceBuilder extends V1alpha2NamedResourcesInstanceFluent<V1alpha2NamedResourcesInstanceBuilder> implements VisitableBuilder<V1alpha2NamedResourcesInstance,V1alpha2NamedResourcesInstanceBuilder>{
  public V1alpha2NamedResourcesInstanceBuilder() {
    this(new V1alpha2NamedResourcesInstance());
  }
  
  public V1alpha2NamedResourcesInstanceBuilder(V1alpha2NamedResourcesInstanceFluent<?> fluent) {
    this(fluent, new V1alpha2NamedResourcesInstance());
  }
  
  public V1alpha2NamedResourcesInstanceBuilder(V1alpha2NamedResourcesInstanceFluent<?> fluent,V1alpha2NamedResourcesInstance instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2NamedResourcesInstanceBuilder(V1alpha2NamedResourcesInstance instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2NamedResourcesInstanceFluent<?> fluent;
  
  public V1alpha2NamedResourcesInstance build() {
    V1alpha2NamedResourcesInstance buildable = new V1alpha2NamedResourcesInstance();
    buildable.setAttributes(fluent.buildAttributes());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}