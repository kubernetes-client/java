package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1LoadBalancerStatusBuilder extends V1LoadBalancerStatusFluentImpl<V1LoadBalancerStatusBuilder> implements VisitableBuilder<V1LoadBalancerStatus,V1LoadBalancerStatusBuilder>{
  public V1LoadBalancerStatusBuilder() {
    this(false);
  }
  public V1LoadBalancerStatusBuilder(Boolean validationEnabled) {
    this(new V1LoadBalancerStatus(), validationEnabled);
  }
  public V1LoadBalancerStatusBuilder(V1LoadBalancerStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1LoadBalancerStatusBuilder(V1LoadBalancerStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1LoadBalancerStatus(), validationEnabled);
  }
  public V1LoadBalancerStatusBuilder(V1LoadBalancerStatusFluent<?> fluent,V1LoadBalancerStatus instance) {
    this(fluent, instance, false);
  }
  public V1LoadBalancerStatusBuilder(V1LoadBalancerStatusFluent<?> fluent,V1LoadBalancerStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withIngress(instance.getIngress());

    this.validationEnabled = validationEnabled; 
  }
  public V1LoadBalancerStatusBuilder(V1LoadBalancerStatus instance) {
    this(instance,false);
  }
  public V1LoadBalancerStatusBuilder(V1LoadBalancerStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withIngress(instance.getIngress());

    this.validationEnabled = validationEnabled; 
  }
  V1LoadBalancerStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1LoadBalancerStatus build() {
    V1LoadBalancerStatus buildable = new V1LoadBalancerStatus();
    buildable.setIngress(fluent.getIngress());
    return buildable;
  }
  
}