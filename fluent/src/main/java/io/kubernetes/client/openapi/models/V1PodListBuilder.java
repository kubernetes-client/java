package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodListBuilder extends V1PodListFluent<V1PodListBuilder> implements VisitableBuilder<V1PodList,V1PodListBuilder>{
  public V1PodListBuilder() {
    this(new V1PodList());
  }
  
  public V1PodListBuilder(V1PodListFluent<?> fluent) {
    this(fluent, new V1PodList());
  }
  
  public V1PodListBuilder(V1PodListFluent<?> fluent,V1PodList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodListBuilder(V1PodList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodListFluent<?> fluent;
  
  public V1PodList build() {
    V1PodList buildable = new V1PodList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}