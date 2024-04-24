package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2NamedResourcesStringSliceBuilder extends V1alpha2NamedResourcesStringSliceFluent<V1alpha2NamedResourcesStringSliceBuilder> implements VisitableBuilder<V1alpha2NamedResourcesStringSlice,V1alpha2NamedResourcesStringSliceBuilder>{
  public V1alpha2NamedResourcesStringSliceBuilder() {
    this(new V1alpha2NamedResourcesStringSlice());
  }
  
  public V1alpha2NamedResourcesStringSliceBuilder(V1alpha2NamedResourcesStringSliceFluent<?> fluent) {
    this(fluent, new V1alpha2NamedResourcesStringSlice());
  }
  
  public V1alpha2NamedResourcesStringSliceBuilder(V1alpha2NamedResourcesStringSliceFluent<?> fluent,V1alpha2NamedResourcesStringSlice instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2NamedResourcesStringSliceBuilder(V1alpha2NamedResourcesStringSlice instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2NamedResourcesStringSliceFluent<?> fluent;
  
  public V1alpha2NamedResourcesStringSlice build() {
    V1alpha2NamedResourcesStringSlice buildable = new V1alpha2NamedResourcesStringSlice();
    buildable.setStrings(fluent.getStrings());
    return buildable;
  }
  

}