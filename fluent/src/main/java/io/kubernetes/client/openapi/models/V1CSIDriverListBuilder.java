package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CSIDriverListBuilder extends V1CSIDriverListFluent<V1CSIDriverListBuilder> implements VisitableBuilder<V1CSIDriverList,V1CSIDriverListBuilder>{
  public V1CSIDriverListBuilder() {
    this(new V1CSIDriverList());
  }
  
  public V1CSIDriverListBuilder(V1CSIDriverListFluent<?> fluent) {
    this(fluent, new V1CSIDriverList());
  }
  
  public V1CSIDriverListBuilder(V1CSIDriverListFluent<?> fluent,V1CSIDriverList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CSIDriverListBuilder(V1CSIDriverList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CSIDriverListFluent<?> fluent;
  
  public V1CSIDriverList build() {
    V1CSIDriverList buildable = new V1CSIDriverList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}