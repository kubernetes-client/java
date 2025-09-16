package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1ResourceSliceListBuilder extends V1ResourceSliceListFluent<V1ResourceSliceListBuilder> implements VisitableBuilder<V1ResourceSliceList,V1ResourceSliceListBuilder>{
  public V1ResourceSliceListBuilder() {
    this(new V1ResourceSliceList());
  }
  
  public V1ResourceSliceListBuilder(V1ResourceSliceListFluent<?> fluent) {
    this(fluent, new V1ResourceSliceList());
  }
  
  public V1ResourceSliceListBuilder(V1ResourceSliceListFluent<?> fluent,V1ResourceSliceList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ResourceSliceListBuilder(V1ResourceSliceList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ResourceSliceListFluent<?> fluent;
  
  public V1ResourceSliceList build() {
    V1ResourceSliceList buildable = new V1ResourceSliceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}