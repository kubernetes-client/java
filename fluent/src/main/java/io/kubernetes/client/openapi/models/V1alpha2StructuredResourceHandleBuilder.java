package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2StructuredResourceHandleBuilder extends V1alpha2StructuredResourceHandleFluent<V1alpha2StructuredResourceHandleBuilder> implements VisitableBuilder<V1alpha2StructuredResourceHandle,V1alpha2StructuredResourceHandleBuilder>{
  public V1alpha2StructuredResourceHandleBuilder() {
    this(new V1alpha2StructuredResourceHandle());
  }
  
  public V1alpha2StructuredResourceHandleBuilder(V1alpha2StructuredResourceHandleFluent<?> fluent) {
    this(fluent, new V1alpha2StructuredResourceHandle());
  }
  
  public V1alpha2StructuredResourceHandleBuilder(V1alpha2StructuredResourceHandleFluent<?> fluent,V1alpha2StructuredResourceHandle instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2StructuredResourceHandleBuilder(V1alpha2StructuredResourceHandle instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2StructuredResourceHandleFluent<?> fluent;
  
  public V1alpha2StructuredResourceHandle build() {
    V1alpha2StructuredResourceHandle buildable = new V1alpha2StructuredResourceHandle();
    buildable.setNodeName(fluent.getNodeName());
    buildable.setResults(fluent.buildResults());
    buildable.setVendorClaimParameters(fluent.getVendorClaimParameters());
    buildable.setVendorClassParameters(fluent.getVendorClassParameters());
    return buildable;
  }
  

}