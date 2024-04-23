package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceHandleBuilder extends V1alpha2ResourceHandleFluent<V1alpha2ResourceHandleBuilder> implements VisitableBuilder<V1alpha2ResourceHandle,V1alpha2ResourceHandleBuilder>{
  public V1alpha2ResourceHandleBuilder() {
    this(new V1alpha2ResourceHandle());
  }
  
  public V1alpha2ResourceHandleBuilder(V1alpha2ResourceHandleFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceHandle());
  }
  
  public V1alpha2ResourceHandleBuilder(V1alpha2ResourceHandleFluent<?> fluent,V1alpha2ResourceHandle instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceHandleBuilder(V1alpha2ResourceHandle instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceHandleFluent<?> fluent;
  
  public V1alpha2ResourceHandle build() {
    V1alpha2ResourceHandle buildable = new V1alpha2ResourceHandle();
    buildable.setData(fluent.getData());
    buildable.setDriverName(fluent.getDriverName());
    buildable.setStructuredData(fluent.buildStructuredData());
    return buildable;
  }
  

}