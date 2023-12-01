package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1DaemonSetListBuilder extends V1DaemonSetListFluent<V1DaemonSetListBuilder> implements VisitableBuilder<V1DaemonSetList,V1DaemonSetListBuilder>{
  public V1DaemonSetListBuilder() {
    this(new V1DaemonSetList());
  }
  
  public V1DaemonSetListBuilder(V1DaemonSetListFluent<?> fluent) {
    this(fluent, new V1DaemonSetList());
  }
  
  public V1DaemonSetListBuilder(V1DaemonSetListFluent<?> fluent,V1DaemonSetList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DaemonSetListBuilder(V1DaemonSetList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DaemonSetListFluent<?> fluent;
  
  public V1DaemonSetList build() {
    V1DaemonSetList buildable = new V1DaemonSetList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}