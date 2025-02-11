package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3PodSchedulingContextStatusBuilder extends V1alpha3PodSchedulingContextStatusFluent<V1alpha3PodSchedulingContextStatusBuilder> implements VisitableBuilder<V1alpha3PodSchedulingContextStatus,V1alpha3PodSchedulingContextStatusBuilder>{
  public V1alpha3PodSchedulingContextStatusBuilder() {
    this(new V1alpha3PodSchedulingContextStatus());
  }
  
  public V1alpha3PodSchedulingContextStatusBuilder(V1alpha3PodSchedulingContextStatusFluent<?> fluent) {
    this(fluent, new V1alpha3PodSchedulingContextStatus());
  }
  
  public V1alpha3PodSchedulingContextStatusBuilder(V1alpha3PodSchedulingContextStatusFluent<?> fluent,V1alpha3PodSchedulingContextStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3PodSchedulingContextStatusBuilder(V1alpha3PodSchedulingContextStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3PodSchedulingContextStatusFluent<?> fluent;
  
  public V1alpha3PodSchedulingContextStatus build() {
    V1alpha3PodSchedulingContextStatus buildable = new V1alpha3PodSchedulingContextStatus();
    buildable.setResourceClaims(fluent.buildResourceClaims());
    return buildable;
  }
  

}