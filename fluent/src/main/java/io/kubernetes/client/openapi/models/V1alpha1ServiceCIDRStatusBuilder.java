package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ServiceCIDRStatusBuilder extends V1alpha1ServiceCIDRStatusFluent<V1alpha1ServiceCIDRStatusBuilder> implements VisitableBuilder<V1alpha1ServiceCIDRStatus,V1alpha1ServiceCIDRStatusBuilder>{
  public V1alpha1ServiceCIDRStatusBuilder() {
    this(new V1alpha1ServiceCIDRStatus());
  }
  
  public V1alpha1ServiceCIDRStatusBuilder(V1alpha1ServiceCIDRStatusFluent<?> fluent) {
    this(fluent, new V1alpha1ServiceCIDRStatus());
  }
  
  public V1alpha1ServiceCIDRStatusBuilder(V1alpha1ServiceCIDRStatusFluent<?> fluent,V1alpha1ServiceCIDRStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ServiceCIDRStatusBuilder(V1alpha1ServiceCIDRStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ServiceCIDRStatusFluent<?> fluent;
  
  public V1alpha1ServiceCIDRStatus build() {
    V1alpha1ServiceCIDRStatus buildable = new V1alpha1ServiceCIDRStatus();
    buildable.setConditions(fluent.buildConditions());
    return buildable;
  }
  

}