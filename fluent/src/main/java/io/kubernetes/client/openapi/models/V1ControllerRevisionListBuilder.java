package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ControllerRevisionListBuilder extends V1ControllerRevisionListFluent<V1ControllerRevisionListBuilder> implements VisitableBuilder<V1ControllerRevisionList,V1ControllerRevisionListBuilder>{
  public V1ControllerRevisionListBuilder() {
    this(new V1ControllerRevisionList());
  }
  
  public V1ControllerRevisionListBuilder(V1ControllerRevisionListFluent<?> fluent) {
    this(fluent, new V1ControllerRevisionList());
  }
  
  public V1ControllerRevisionListBuilder(V1ControllerRevisionListFluent<?> fluent,V1ControllerRevisionList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ControllerRevisionListBuilder(V1ControllerRevisionList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ControllerRevisionListFluent<?> fluent;
  
  public V1ControllerRevisionList build() {
    V1ControllerRevisionList buildable = new V1ControllerRevisionList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}