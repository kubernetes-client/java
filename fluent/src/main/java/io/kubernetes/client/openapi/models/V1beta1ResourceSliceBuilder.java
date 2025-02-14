package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ResourceSliceBuilder extends V1beta1ResourceSliceFluent<V1beta1ResourceSliceBuilder> implements VisitableBuilder<V1beta1ResourceSlice,V1beta1ResourceSliceBuilder>{
  public V1beta1ResourceSliceBuilder() {
    this(new V1beta1ResourceSlice());
  }
  
  public V1beta1ResourceSliceBuilder(V1beta1ResourceSliceFluent<?> fluent) {
    this(fluent, new V1beta1ResourceSlice());
  }
  
  public V1beta1ResourceSliceBuilder(V1beta1ResourceSliceFluent<?> fluent,V1beta1ResourceSlice instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ResourceSliceBuilder(V1beta1ResourceSlice instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ResourceSliceFluent<?> fluent;
  
  public V1beta1ResourceSlice build() {
    V1beta1ResourceSlice buildable = new V1beta1ResourceSlice();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}