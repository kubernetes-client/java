package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1IngressStatusBuilder extends V1IngressStatusFluentImpl<V1IngressStatusBuilder> implements VisitableBuilder<V1IngressStatus,V1IngressStatusBuilder>{
  public V1IngressStatusBuilder() {
    this(false);
  }
  public V1IngressStatusBuilder(Boolean validationEnabled) {
    this(new V1IngressStatus(), validationEnabled);
  }
  public V1IngressStatusBuilder(V1IngressStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1IngressStatusBuilder(V1IngressStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1IngressStatus(), validationEnabled);
  }
  public V1IngressStatusBuilder(V1IngressStatusFluent<?> fluent,V1IngressStatus instance) {
    this(fluent, instance, false);
  }
  public V1IngressStatusBuilder(V1IngressStatusFluent<?> fluent,V1IngressStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLoadBalancer(instance.getLoadBalancer());

    this.validationEnabled = validationEnabled; 
  }
  public V1IngressStatusBuilder(V1IngressStatus instance) {
    this(instance,false);
  }
  public V1IngressStatusBuilder(V1IngressStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLoadBalancer(instance.getLoadBalancer());

    this.validationEnabled = validationEnabled; 
  }
  V1IngressStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1IngressStatus build() {
    V1IngressStatus buildable = new V1IngressStatus();
    buildable.setLoadBalancer(fluent.getLoadBalancer());
    return buildable;
  }
  
}