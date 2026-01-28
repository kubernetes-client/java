package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2DeviceClassListBuilder extends V1beta2DeviceClassListFluent<V1beta2DeviceClassListBuilder> implements VisitableBuilder<V1beta2DeviceClassList,V1beta2DeviceClassListBuilder>{

  V1beta2DeviceClassListFluent<?> fluent;

  public V1beta2DeviceClassListBuilder() {
    this(new V1beta2DeviceClassList());
  }
  
  public V1beta2DeviceClassListBuilder(V1beta2DeviceClassListFluent<?> fluent) {
    this(fluent, new V1beta2DeviceClassList());
  }
  
  public V1beta2DeviceClassListBuilder(V1beta2DeviceClassList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2DeviceClassListBuilder(V1beta2DeviceClassListFluent<?> fluent,V1beta2DeviceClassList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2DeviceClassList build() {
    V1beta2DeviceClassList buildable = new V1beta2DeviceClassList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}