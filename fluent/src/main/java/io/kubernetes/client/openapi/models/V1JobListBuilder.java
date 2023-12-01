package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1JobListBuilder extends V1JobListFluent<V1JobListBuilder> implements VisitableBuilder<V1JobList,V1JobListBuilder>{
  public V1JobListBuilder() {
    this(new V1JobList());
  }
  
  public V1JobListBuilder(V1JobListFluent<?> fluent) {
    this(fluent, new V1JobList());
  }
  
  public V1JobListBuilder(V1JobListFluent<?> fluent,V1JobList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1JobListBuilder(V1JobList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1JobListFluent<?> fluent;
  
  public V1JobList build() {
    V1JobList buildable = new V1JobList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}