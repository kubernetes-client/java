package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1DeviceClassListBuilder extends V1beta1DeviceClassListFluent<V1beta1DeviceClassListBuilder> implements VisitableBuilder<V1beta1DeviceClassList,V1beta1DeviceClassListBuilder>{
  public V1beta1DeviceClassListBuilder() {
    this(new V1beta1DeviceClassList());
  }
  
  public V1beta1DeviceClassListBuilder(V1beta1DeviceClassListFluent<?> fluent) {
    this(fluent, new V1beta1DeviceClassList());
  }
  
  public V1beta1DeviceClassListBuilder(V1beta1DeviceClassListFluent<?> fluent,V1beta1DeviceClassList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1DeviceClassListBuilder(V1beta1DeviceClassList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1DeviceClassListFluent<?> fluent;
  
  public V1beta1DeviceClassList build() {
    V1beta1DeviceClassList buildable = new V1beta1DeviceClassList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}