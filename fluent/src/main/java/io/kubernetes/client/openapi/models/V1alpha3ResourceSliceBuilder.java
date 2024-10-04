package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3ResourceSliceBuilder extends V1alpha3ResourceSliceFluent<V1alpha3ResourceSliceBuilder> implements VisitableBuilder<V1alpha3ResourceSlice,V1alpha3ResourceSliceBuilder>{
  public V1alpha3ResourceSliceBuilder() {
    this(new V1alpha3ResourceSlice());
  }
  
  public V1alpha3ResourceSliceBuilder(V1alpha3ResourceSliceFluent<?> fluent) {
    this(fluent, new V1alpha3ResourceSlice());
  }
  
  public V1alpha3ResourceSliceBuilder(V1alpha3ResourceSliceFluent<?> fluent,V1alpha3ResourceSlice instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3ResourceSliceBuilder(V1alpha3ResourceSlice instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3ResourceSliceFluent<?> fluent;
  
  public V1alpha3ResourceSlice build() {
    V1alpha3ResourceSlice buildable = new V1alpha3ResourceSlice();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}