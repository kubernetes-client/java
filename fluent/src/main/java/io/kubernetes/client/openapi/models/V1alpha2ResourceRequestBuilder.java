package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceRequestBuilder extends V1alpha2ResourceRequestFluent<V1alpha2ResourceRequestBuilder> implements VisitableBuilder<V1alpha2ResourceRequest,V1alpha2ResourceRequestBuilder>{
  public V1alpha2ResourceRequestBuilder() {
    this(new V1alpha2ResourceRequest());
  }
  
  public V1alpha2ResourceRequestBuilder(V1alpha2ResourceRequestFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceRequest());
  }
  
  public V1alpha2ResourceRequestBuilder(V1alpha2ResourceRequestFluent<?> fluent,V1alpha2ResourceRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceRequestBuilder(V1alpha2ResourceRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceRequestFluent<?> fluent;
  
  public V1alpha2ResourceRequest build() {
    V1alpha2ResourceRequest buildable = new V1alpha2ResourceRequest();
    buildable.setNamedResources(fluent.buildNamedResources());
    buildable.setVendorParameters(fluent.getVendorParameters());
    return buildable;
  }
  

}