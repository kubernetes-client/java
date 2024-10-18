package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3PodSchedulingContextSpecBuilder extends V1alpha3PodSchedulingContextSpecFluent<V1alpha3PodSchedulingContextSpecBuilder> implements VisitableBuilder<V1alpha3PodSchedulingContextSpec,V1alpha3PodSchedulingContextSpecBuilder>{
  public V1alpha3PodSchedulingContextSpecBuilder() {
    this(new V1alpha3PodSchedulingContextSpec());
  }
  
  public V1alpha3PodSchedulingContextSpecBuilder(V1alpha3PodSchedulingContextSpecFluent<?> fluent) {
    this(fluent, new V1alpha3PodSchedulingContextSpec());
  }
  
  public V1alpha3PodSchedulingContextSpecBuilder(V1alpha3PodSchedulingContextSpecFluent<?> fluent,V1alpha3PodSchedulingContextSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3PodSchedulingContextSpecBuilder(V1alpha3PodSchedulingContextSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3PodSchedulingContextSpecFluent<?> fluent;
  
  public V1alpha3PodSchedulingContextSpec build() {
    V1alpha3PodSchedulingContextSpec buildable = new V1alpha3PodSchedulingContextSpec();
    buildable.setPotentialNodes(fluent.getPotentialNodes());
    buildable.setSelectedNode(fluent.getSelectedNode());
    return buildable;
  }
  

}