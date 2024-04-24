package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceSliceListBuilder extends V1alpha2ResourceSliceListFluent<V1alpha2ResourceSliceListBuilder> implements VisitableBuilder<V1alpha2ResourceSliceList,V1alpha2ResourceSliceListBuilder>{
  public V1alpha2ResourceSliceListBuilder() {
    this(new V1alpha2ResourceSliceList());
  }
  
  public V1alpha2ResourceSliceListBuilder(V1alpha2ResourceSliceListFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceSliceList());
  }
  
  public V1alpha2ResourceSliceListBuilder(V1alpha2ResourceSliceListFluent<?> fluent,V1alpha2ResourceSliceList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceSliceListBuilder(V1alpha2ResourceSliceList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceSliceListFluent<?> fluent;
  
  public V1alpha2ResourceSliceList build() {
    V1alpha2ResourceSliceList buildable = new V1alpha2ResourceSliceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}