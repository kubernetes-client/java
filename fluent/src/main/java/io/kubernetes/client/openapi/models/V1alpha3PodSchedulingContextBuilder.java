package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3PodSchedulingContextBuilder extends V1alpha3PodSchedulingContextFluent<V1alpha3PodSchedulingContextBuilder> implements VisitableBuilder<V1alpha3PodSchedulingContext,V1alpha3PodSchedulingContextBuilder>{
  public V1alpha3PodSchedulingContextBuilder() {
    this(new V1alpha3PodSchedulingContext());
  }
  
  public V1alpha3PodSchedulingContextBuilder(V1alpha3PodSchedulingContextFluent<?> fluent) {
    this(fluent, new V1alpha3PodSchedulingContext());
  }
  
  public V1alpha3PodSchedulingContextBuilder(V1alpha3PodSchedulingContextFluent<?> fluent,V1alpha3PodSchedulingContext instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3PodSchedulingContextBuilder(V1alpha3PodSchedulingContext instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3PodSchedulingContextFluent<?> fluent;
  
  public V1alpha3PodSchedulingContext build() {
    V1alpha3PodSchedulingContext buildable = new V1alpha3PodSchedulingContext();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}