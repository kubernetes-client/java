package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ConfigMapListBuilder extends V1ConfigMapListFluent<V1ConfigMapListBuilder> implements VisitableBuilder<V1ConfigMapList,V1ConfigMapListBuilder>{
  public V1ConfigMapListBuilder() {
    this(new V1ConfigMapList());
  }
  
  public V1ConfigMapListBuilder(V1ConfigMapListFluent<?> fluent) {
    this(fluent, new V1ConfigMapList());
  }
  
  public V1ConfigMapListBuilder(V1ConfigMapListFluent<?> fluent,V1ConfigMapList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ConfigMapListBuilder(V1ConfigMapList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ConfigMapListFluent<?> fluent;
  
  public V1ConfigMapList build() {
    V1ConfigMapList buildable = new V1ConfigMapList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}