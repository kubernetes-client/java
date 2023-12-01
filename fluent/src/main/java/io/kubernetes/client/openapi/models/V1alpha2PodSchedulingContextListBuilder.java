package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2PodSchedulingContextListBuilder extends V1alpha2PodSchedulingContextListFluent<V1alpha2PodSchedulingContextListBuilder> implements VisitableBuilder<V1alpha2PodSchedulingContextList,V1alpha2PodSchedulingContextListBuilder>{
  public V1alpha2PodSchedulingContextListBuilder() {
    this(new V1alpha2PodSchedulingContextList());
  }
  
  public V1alpha2PodSchedulingContextListBuilder(V1alpha2PodSchedulingContextListFluent<?> fluent) {
    this(fluent, new V1alpha2PodSchedulingContextList());
  }
  
  public V1alpha2PodSchedulingContextListBuilder(V1alpha2PodSchedulingContextListFluent<?> fluent,V1alpha2PodSchedulingContextList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2PodSchedulingContextListBuilder(V1alpha2PodSchedulingContextList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2PodSchedulingContextListFluent<?> fluent;
  
  public V1alpha2PodSchedulingContextList build() {
    V1alpha2PodSchedulingContextList buildable = new V1alpha2PodSchedulingContextList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}