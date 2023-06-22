package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1IngressLoadBalancerStatusBuilder extends V1IngressLoadBalancerStatusFluentImpl<V1IngressLoadBalancerStatusBuilder> implements VisitableBuilder<V1IngressLoadBalancerStatus,V1IngressLoadBalancerStatusBuilder>{
  public V1IngressLoadBalancerStatusBuilder() {
    this(false);
  }
  public V1IngressLoadBalancerStatusBuilder(Boolean validationEnabled) {
    this(new V1IngressLoadBalancerStatus(), validationEnabled);
  }
  public V1IngressLoadBalancerStatusBuilder(V1IngressLoadBalancerStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1IngressLoadBalancerStatusBuilder(V1IngressLoadBalancerStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1IngressLoadBalancerStatus(), validationEnabled);
  }
  public V1IngressLoadBalancerStatusBuilder(V1IngressLoadBalancerStatusFluent<?> fluent,V1IngressLoadBalancerStatus instance) {
    this(fluent, instance, false);
  }
  public V1IngressLoadBalancerStatusBuilder(V1IngressLoadBalancerStatusFluent<?> fluent,V1IngressLoadBalancerStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withIngress(instance.getIngress());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1IngressLoadBalancerStatusBuilder(V1IngressLoadBalancerStatus instance) {
    this(instance,false);
  }
  public V1IngressLoadBalancerStatusBuilder(V1IngressLoadBalancerStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withIngress(instance.getIngress());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1IngressLoadBalancerStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1IngressLoadBalancerStatus build() {
    V1IngressLoadBalancerStatus buildable = new V1IngressLoadBalancerStatus();
    buildable.setIngress(fluent.getIngress());
    return buildable;
  }
  
}