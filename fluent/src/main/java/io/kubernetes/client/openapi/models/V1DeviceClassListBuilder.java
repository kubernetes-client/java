package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1DeviceClassListBuilder extends V1DeviceClassListFluent<V1DeviceClassListBuilder> implements VisitableBuilder<V1DeviceClassList,V1DeviceClassListBuilder>{
  public V1DeviceClassListBuilder() {
    this(new V1DeviceClassList());
  }
  
  public V1DeviceClassListBuilder(V1DeviceClassListFluent<?> fluent) {
    this(fluent, new V1DeviceClassList());
  }
  
  public V1DeviceClassListBuilder(V1DeviceClassListFluent<?> fluent,V1DeviceClassList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DeviceClassListBuilder(V1DeviceClassList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DeviceClassListFluent<?> fluent;
  
  public V1DeviceClassList build() {
    V1DeviceClassList buildable = new V1DeviceClassList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}