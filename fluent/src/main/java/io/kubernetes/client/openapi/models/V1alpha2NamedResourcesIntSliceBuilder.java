package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2NamedResourcesIntSliceBuilder extends V1alpha2NamedResourcesIntSliceFluent<V1alpha2NamedResourcesIntSliceBuilder> implements VisitableBuilder<V1alpha2NamedResourcesIntSlice,V1alpha2NamedResourcesIntSliceBuilder>{
  public V1alpha2NamedResourcesIntSliceBuilder() {
    this(new V1alpha2NamedResourcesIntSlice());
  }
  
  public V1alpha2NamedResourcesIntSliceBuilder(V1alpha2NamedResourcesIntSliceFluent<?> fluent) {
    this(fluent, new V1alpha2NamedResourcesIntSlice());
  }
  
  public V1alpha2NamedResourcesIntSliceBuilder(V1alpha2NamedResourcesIntSliceFluent<?> fluent,V1alpha2NamedResourcesIntSlice instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2NamedResourcesIntSliceBuilder(V1alpha2NamedResourcesIntSlice instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2NamedResourcesIntSliceFluent<?> fluent;
  
  public V1alpha2NamedResourcesIntSlice build() {
    V1alpha2NamedResourcesIntSlice buildable = new V1alpha2NamedResourcesIntSlice();
    buildable.setInts(fluent.getInts());
    return buildable;
  }
  

}