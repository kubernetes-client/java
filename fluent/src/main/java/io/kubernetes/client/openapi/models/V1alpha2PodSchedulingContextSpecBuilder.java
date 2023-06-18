package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha2PodSchedulingContextSpecBuilder extends V1alpha2PodSchedulingContextSpecFluentImpl<V1alpha2PodSchedulingContextSpecBuilder> implements VisitableBuilder<V1alpha2PodSchedulingContextSpec,V1alpha2PodSchedulingContextSpecBuilder>{
  public V1alpha2PodSchedulingContextSpecBuilder() {
    this(false);
  }
  public V1alpha2PodSchedulingContextSpecBuilder(Boolean validationEnabled) {
    this(new V1alpha2PodSchedulingContextSpec(), validationEnabled);
  }
  public V1alpha2PodSchedulingContextSpecBuilder(V1alpha2PodSchedulingContextSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha2PodSchedulingContextSpecBuilder(V1alpha2PodSchedulingContextSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha2PodSchedulingContextSpec(), validationEnabled);
  }
  public V1alpha2PodSchedulingContextSpecBuilder(V1alpha2PodSchedulingContextSpecFluent<?> fluent,V1alpha2PodSchedulingContextSpec instance) {
    this(fluent, instance, false);
  }
  public V1alpha2PodSchedulingContextSpecBuilder(V1alpha2PodSchedulingContextSpecFluent<?> fluent,V1alpha2PodSchedulingContextSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withPotentialNodes(instance.getPotentialNodes());
      fluent.withSelectedNode(instance.getSelectedNode());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha2PodSchedulingContextSpecBuilder(V1alpha2PodSchedulingContextSpec instance) {
    this(instance,false);
  }
  public V1alpha2PodSchedulingContextSpecBuilder(V1alpha2PodSchedulingContextSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withPotentialNodes(instance.getPotentialNodes());
      this.withSelectedNode(instance.getSelectedNode());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha2PodSchedulingContextSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha2PodSchedulingContextSpec build() {
    V1alpha2PodSchedulingContextSpec buildable = new V1alpha2PodSchedulingContextSpec();
    buildable.setPotentialNodes(fluent.getPotentialNodes());
    buildable.setSelectedNode(fluent.getSelectedNode());
    return buildable;
  }
  
}