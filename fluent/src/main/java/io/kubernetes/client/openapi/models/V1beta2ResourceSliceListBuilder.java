package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2ResourceSliceListBuilder extends V1beta2ResourceSliceListFluent<V1beta2ResourceSliceListBuilder> implements VisitableBuilder<V1beta2ResourceSliceList,V1beta2ResourceSliceListBuilder>{
  public V1beta2ResourceSliceListBuilder() {
    this(new V1beta2ResourceSliceList());
  }
  
  public V1beta2ResourceSliceListBuilder(V1beta2ResourceSliceListFluent<?> fluent) {
    this(fluent, new V1beta2ResourceSliceList());
  }
  
  public V1beta2ResourceSliceListBuilder(V1beta2ResourceSliceListFluent<?> fluent,V1beta2ResourceSliceList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2ResourceSliceListBuilder(V1beta2ResourceSliceList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2ResourceSliceListFluent<?> fluent;
  
  public V1beta2ResourceSliceList build() {
    V1beta2ResourceSliceList buildable = new V1beta2ResourceSliceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}