package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1ServiceCIDRStatusBuilder extends V1ServiceCIDRStatusFluent<V1ServiceCIDRStatusBuilder> implements VisitableBuilder<V1ServiceCIDRStatus,V1ServiceCIDRStatusBuilder>{
  public V1ServiceCIDRStatusBuilder() {
    this(new V1ServiceCIDRStatus());
  }
  
  public V1ServiceCIDRStatusBuilder(V1ServiceCIDRStatusFluent<?> fluent) {
    this(fluent, new V1ServiceCIDRStatus());
  }
  
  public V1ServiceCIDRStatusBuilder(V1ServiceCIDRStatusFluent<?> fluent,V1ServiceCIDRStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ServiceCIDRStatusBuilder(V1ServiceCIDRStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ServiceCIDRStatusFluent<?> fluent;
  
  public V1ServiceCIDRStatus build() {
    V1ServiceCIDRStatus buildable = new V1ServiceCIDRStatus();
    buildable.setConditions(fluent.buildConditions());
    return buildable;
  }
  

}