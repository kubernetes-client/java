package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ServiceCIDRStatusBuilder extends V1beta1ServiceCIDRStatusFluent<V1beta1ServiceCIDRStatusBuilder> implements VisitableBuilder<V1beta1ServiceCIDRStatus,V1beta1ServiceCIDRStatusBuilder>{
  public V1beta1ServiceCIDRStatusBuilder() {
    this(new V1beta1ServiceCIDRStatus());
  }
  
  public V1beta1ServiceCIDRStatusBuilder(V1beta1ServiceCIDRStatusFluent<?> fluent) {
    this(fluent, new V1beta1ServiceCIDRStatus());
  }
  
  public V1beta1ServiceCIDRStatusBuilder(V1beta1ServiceCIDRStatusFluent<?> fluent,V1beta1ServiceCIDRStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ServiceCIDRStatusBuilder(V1beta1ServiceCIDRStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ServiceCIDRStatusFluent<?> fluent;
  
  public V1beta1ServiceCIDRStatus build() {
    V1beta1ServiceCIDRStatus buildable = new V1beta1ServiceCIDRStatus();
    buildable.setConditions(fluent.buildConditions());
    return buildable;
  }
  

}