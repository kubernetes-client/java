package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3PodSchedulingContextListBuilder extends V1alpha3PodSchedulingContextListFluent<V1alpha3PodSchedulingContextListBuilder> implements VisitableBuilder<V1alpha3PodSchedulingContextList,V1alpha3PodSchedulingContextListBuilder>{
  public V1alpha3PodSchedulingContextListBuilder() {
    this(new V1alpha3PodSchedulingContextList());
  }
  
  public V1alpha3PodSchedulingContextListBuilder(V1alpha3PodSchedulingContextListFluent<?> fluent) {
    this(fluent, new V1alpha3PodSchedulingContextList());
  }
  
  public V1alpha3PodSchedulingContextListBuilder(V1alpha3PodSchedulingContextListFluent<?> fluent,V1alpha3PodSchedulingContextList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3PodSchedulingContextListBuilder(V1alpha3PodSchedulingContextList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3PodSchedulingContextListFluent<?> fluent;
  
  public V1alpha3PodSchedulingContextList build() {
    V1alpha3PodSchedulingContextList buildable = new V1alpha3PodSchedulingContextList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}