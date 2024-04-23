package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2NamedResourcesResourcesBuilder extends V1alpha2NamedResourcesResourcesFluent<V1alpha2NamedResourcesResourcesBuilder> implements VisitableBuilder<V1alpha2NamedResourcesResources,V1alpha2NamedResourcesResourcesBuilder>{
  public V1alpha2NamedResourcesResourcesBuilder() {
    this(new V1alpha2NamedResourcesResources());
  }
  
  public V1alpha2NamedResourcesResourcesBuilder(V1alpha2NamedResourcesResourcesFluent<?> fluent) {
    this(fluent, new V1alpha2NamedResourcesResources());
  }
  
  public V1alpha2NamedResourcesResourcesBuilder(V1alpha2NamedResourcesResourcesFluent<?> fluent,V1alpha2NamedResourcesResources instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2NamedResourcesResourcesBuilder(V1alpha2NamedResourcesResources instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2NamedResourcesResourcesFluent<?> fluent;
  
  public V1alpha2NamedResourcesResources build() {
    V1alpha2NamedResourcesResources buildable = new V1alpha2NamedResourcesResources();
    buildable.setInstances(fluent.buildInstances());
    return buildable;
  }
  

}