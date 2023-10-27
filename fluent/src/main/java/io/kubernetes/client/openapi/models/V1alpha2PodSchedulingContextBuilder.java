package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2PodSchedulingContextBuilder extends V1alpha2PodSchedulingContextFluent<V1alpha2PodSchedulingContextBuilder> implements VisitableBuilder<V1alpha2PodSchedulingContext,V1alpha2PodSchedulingContextBuilder>{
  public V1alpha2PodSchedulingContextBuilder() {
    this(new V1alpha2PodSchedulingContext());
  }
  
  public V1alpha2PodSchedulingContextBuilder(V1alpha2PodSchedulingContextFluent<?> fluent) {
    this(fluent, new V1alpha2PodSchedulingContext());
  }
  
  public V1alpha2PodSchedulingContextBuilder(V1alpha2PodSchedulingContextFluent<?> fluent,V1alpha2PodSchedulingContext instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2PodSchedulingContextBuilder(V1alpha2PodSchedulingContext instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2PodSchedulingContextFluent<?> fluent;
  
  public V1alpha2PodSchedulingContext build() {
    V1alpha2PodSchedulingContext buildable = new V1alpha2PodSchedulingContext();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}