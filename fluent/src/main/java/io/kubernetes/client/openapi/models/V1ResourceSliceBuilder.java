package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1ResourceSliceBuilder extends V1ResourceSliceFluent<V1ResourceSliceBuilder> implements VisitableBuilder<V1ResourceSlice,V1ResourceSliceBuilder>{

  V1ResourceSliceFluent<?> fluent;

  public V1ResourceSliceBuilder() {
    this(new V1ResourceSlice());
  }
  
  public V1ResourceSliceBuilder(V1ResourceSliceFluent<?> fluent) {
    this(fluent, new V1ResourceSlice());
  }
  
  public V1ResourceSliceBuilder(V1ResourceSlice instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ResourceSliceBuilder(V1ResourceSliceFluent<?> fluent,V1ResourceSlice instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ResourceSlice build() {
    V1ResourceSlice buildable = new V1ResourceSlice();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  
}