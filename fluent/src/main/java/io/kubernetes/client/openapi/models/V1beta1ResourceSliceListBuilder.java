package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ResourceSliceListBuilder extends V1beta1ResourceSliceListFluent<V1beta1ResourceSliceListBuilder> implements VisitableBuilder<V1beta1ResourceSliceList,V1beta1ResourceSliceListBuilder>{
  public V1beta1ResourceSliceListBuilder() {
    this(new V1beta1ResourceSliceList());
  }
  
  public V1beta1ResourceSliceListBuilder(V1beta1ResourceSliceListFluent<?> fluent) {
    this(fluent, new V1beta1ResourceSliceList());
  }
  
  public V1beta1ResourceSliceListBuilder(V1beta1ResourceSliceListFluent<?> fluent,V1beta1ResourceSliceList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ResourceSliceListBuilder(V1beta1ResourceSliceList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ResourceSliceListFluent<?> fluent;
  
  public V1beta1ResourceSliceList build() {
    V1beta1ResourceSliceList buildable = new V1beta1ResourceSliceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}