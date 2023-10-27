package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2PodSchedulingContextStatusBuilder extends V1alpha2PodSchedulingContextStatusFluent<V1alpha2PodSchedulingContextStatusBuilder> implements VisitableBuilder<V1alpha2PodSchedulingContextStatus,V1alpha2PodSchedulingContextStatusBuilder>{
  public V1alpha2PodSchedulingContextStatusBuilder() {
    this(new V1alpha2PodSchedulingContextStatus());
  }
  
  public V1alpha2PodSchedulingContextStatusBuilder(V1alpha2PodSchedulingContextStatusFluent<?> fluent) {
    this(fluent, new V1alpha2PodSchedulingContextStatus());
  }
  
  public V1alpha2PodSchedulingContextStatusBuilder(V1alpha2PodSchedulingContextStatusFluent<?> fluent,V1alpha2PodSchedulingContextStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2PodSchedulingContextStatusBuilder(V1alpha2PodSchedulingContextStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2PodSchedulingContextStatusFluent<?> fluent;
  
  public V1alpha2PodSchedulingContextStatus build() {
    V1alpha2PodSchedulingContextStatus buildable = new V1alpha2PodSchedulingContextStatus();
    buildable.setResourceClaims(fluent.buildResourceClaims());
    return buildable;
  }
  

}