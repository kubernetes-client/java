package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2NamedResourcesRequestBuilder extends V1alpha2NamedResourcesRequestFluent<V1alpha2NamedResourcesRequestBuilder> implements VisitableBuilder<V1alpha2NamedResourcesRequest,V1alpha2NamedResourcesRequestBuilder>{
  public V1alpha2NamedResourcesRequestBuilder() {
    this(new V1alpha2NamedResourcesRequest());
  }
  
  public V1alpha2NamedResourcesRequestBuilder(V1alpha2NamedResourcesRequestFluent<?> fluent) {
    this(fluent, new V1alpha2NamedResourcesRequest());
  }
  
  public V1alpha2NamedResourcesRequestBuilder(V1alpha2NamedResourcesRequestFluent<?> fluent,V1alpha2NamedResourcesRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2NamedResourcesRequestBuilder(V1alpha2NamedResourcesRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2NamedResourcesRequestFluent<?> fluent;
  
  public V1alpha2NamedResourcesRequest build() {
    V1alpha2NamedResourcesRequest buildable = new V1alpha2NamedResourcesRequest();
    buildable.setSelector(fluent.getSelector());
    return buildable;
  }
  

}