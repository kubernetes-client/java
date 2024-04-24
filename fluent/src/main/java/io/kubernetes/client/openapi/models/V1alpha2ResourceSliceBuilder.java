package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceSliceBuilder extends V1alpha2ResourceSliceFluent<V1alpha2ResourceSliceBuilder> implements VisitableBuilder<V1alpha2ResourceSlice,V1alpha2ResourceSliceBuilder>{
  public V1alpha2ResourceSliceBuilder() {
    this(new V1alpha2ResourceSlice());
  }
  
  public V1alpha2ResourceSliceBuilder(V1alpha2ResourceSliceFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceSlice());
  }
  
  public V1alpha2ResourceSliceBuilder(V1alpha2ResourceSliceFluent<?> fluent,V1alpha2ResourceSlice instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceSliceBuilder(V1alpha2ResourceSlice instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceSliceFluent<?> fluent;
  
  public V1alpha2ResourceSlice build() {
    V1alpha2ResourceSlice buildable = new V1alpha2ResourceSlice();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDriverName(fluent.getDriverName());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setNamedResources(fluent.buildNamedResources());
    buildable.setNodeName(fluent.getNodeName());
    return buildable;
  }
  

}