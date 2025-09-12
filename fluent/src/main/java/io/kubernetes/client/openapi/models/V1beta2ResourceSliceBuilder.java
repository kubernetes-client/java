package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2ResourceSliceBuilder extends V1beta2ResourceSliceFluent<V1beta2ResourceSliceBuilder> implements VisitableBuilder<V1beta2ResourceSlice,V1beta2ResourceSliceBuilder>{
  public V1beta2ResourceSliceBuilder() {
    this(new V1beta2ResourceSlice());
  }
  
  public V1beta2ResourceSliceBuilder(V1beta2ResourceSliceFluent<?> fluent) {
    this(fluent, new V1beta2ResourceSlice());
  }
  
  public V1beta2ResourceSliceBuilder(V1beta2ResourceSliceFluent<?> fluent,V1beta2ResourceSlice instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2ResourceSliceBuilder(V1beta2ResourceSlice instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2ResourceSliceFluent<?> fluent;
  
  public V1beta2ResourceSlice build() {
    V1beta2ResourceSlice buildable = new V1beta2ResourceSlice();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}