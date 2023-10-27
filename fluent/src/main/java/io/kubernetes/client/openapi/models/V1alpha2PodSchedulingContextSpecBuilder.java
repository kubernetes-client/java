package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2PodSchedulingContextSpecBuilder extends V1alpha2PodSchedulingContextSpecFluent<V1alpha2PodSchedulingContextSpecBuilder> implements VisitableBuilder<V1alpha2PodSchedulingContextSpec,V1alpha2PodSchedulingContextSpecBuilder>{
  public V1alpha2PodSchedulingContextSpecBuilder() {
    this(new V1alpha2PodSchedulingContextSpec());
  }
  
  public V1alpha2PodSchedulingContextSpecBuilder(V1alpha2PodSchedulingContextSpecFluent<?> fluent) {
    this(fluent, new V1alpha2PodSchedulingContextSpec());
  }
  
  public V1alpha2PodSchedulingContextSpecBuilder(V1alpha2PodSchedulingContextSpecFluent<?> fluent,V1alpha2PodSchedulingContextSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2PodSchedulingContextSpecBuilder(V1alpha2PodSchedulingContextSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2PodSchedulingContextSpecFluent<?> fluent;
  
  public V1alpha2PodSchedulingContextSpec build() {
    V1alpha2PodSchedulingContextSpec buildable = new V1alpha2PodSchedulingContextSpec();
    buildable.setPotentialNodes(fluent.getPotentialNodes());
    buildable.setSelectedNode(fluent.getSelectedNode());
    return buildable;
  }
  

}