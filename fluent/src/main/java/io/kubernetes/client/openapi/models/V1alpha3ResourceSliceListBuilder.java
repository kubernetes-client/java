package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3ResourceSliceListBuilder extends V1alpha3ResourceSliceListFluent<V1alpha3ResourceSliceListBuilder> implements VisitableBuilder<V1alpha3ResourceSliceList,V1alpha3ResourceSliceListBuilder>{
  public V1alpha3ResourceSliceListBuilder() {
    this(new V1alpha3ResourceSliceList());
  }
  
  public V1alpha3ResourceSliceListBuilder(V1alpha3ResourceSliceListFluent<?> fluent) {
    this(fluent, new V1alpha3ResourceSliceList());
  }
  
  public V1alpha3ResourceSliceListBuilder(V1alpha3ResourceSliceListFluent<?> fluent,V1alpha3ResourceSliceList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3ResourceSliceListBuilder(V1alpha3ResourceSliceList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3ResourceSliceListFluent<?> fluent;
  
  public V1alpha3ResourceSliceList build() {
    V1alpha3ResourceSliceList buildable = new V1alpha3ResourceSliceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}