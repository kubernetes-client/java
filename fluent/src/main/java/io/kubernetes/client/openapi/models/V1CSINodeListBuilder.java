package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CSINodeListBuilder extends V1CSINodeListFluent<V1CSINodeListBuilder> implements VisitableBuilder<V1CSINodeList,V1CSINodeListBuilder>{
  public V1CSINodeListBuilder() {
    this(new V1CSINodeList());
  }
  
  public V1CSINodeListBuilder(V1CSINodeListFluent<?> fluent) {
    this(fluent, new V1CSINodeList());
  }
  
  public V1CSINodeListBuilder(V1CSINodeListFluent<?> fluent,V1CSINodeList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CSINodeListBuilder(V1CSINodeList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CSINodeListFluent<?> fluent;
  
  public V1CSINodeList build() {
    V1CSINodeList buildable = new V1CSINodeList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}