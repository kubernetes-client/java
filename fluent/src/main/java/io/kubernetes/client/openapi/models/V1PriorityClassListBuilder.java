package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PriorityClassListBuilder extends V1PriorityClassListFluent<V1PriorityClassListBuilder> implements VisitableBuilder<V1PriorityClassList,V1PriorityClassListBuilder>{
  public V1PriorityClassListBuilder() {
    this(new V1PriorityClassList());
  }
  
  public V1PriorityClassListBuilder(V1PriorityClassListFluent<?> fluent) {
    this(fluent, new V1PriorityClassList());
  }
  
  public V1PriorityClassListBuilder(V1PriorityClassListFluent<?> fluent,V1PriorityClassList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PriorityClassListBuilder(V1PriorityClassList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PriorityClassListFluent<?> fluent;
  
  public V1PriorityClassList build() {
    V1PriorityClassList buildable = new V1PriorityClassList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}