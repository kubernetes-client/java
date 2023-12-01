package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CSIStorageCapacityListBuilder extends V1CSIStorageCapacityListFluent<V1CSIStorageCapacityListBuilder> implements VisitableBuilder<V1CSIStorageCapacityList,V1CSIStorageCapacityListBuilder>{
  public V1CSIStorageCapacityListBuilder() {
    this(new V1CSIStorageCapacityList());
  }
  
  public V1CSIStorageCapacityListBuilder(V1CSIStorageCapacityListFluent<?> fluent) {
    this(fluent, new V1CSIStorageCapacityList());
  }
  
  public V1CSIStorageCapacityListBuilder(V1CSIStorageCapacityListFluent<?> fluent,V1CSIStorageCapacityList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CSIStorageCapacityListBuilder(V1CSIStorageCapacityList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CSIStorageCapacityListFluent<?> fluent;
  
  public V1CSIStorageCapacityList build() {
    V1CSIStorageCapacityList buildable = new V1CSIStorageCapacityList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}