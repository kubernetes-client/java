package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ServiceStatusBuilder extends V1ServiceStatusFluentImpl<V1ServiceStatusBuilder> implements VisitableBuilder<V1ServiceStatus,V1ServiceStatusBuilder>{
  public V1ServiceStatusBuilder() {
    this(false);
  }
  public V1ServiceStatusBuilder(Boolean validationEnabled) {
    this(new V1ServiceStatus(), validationEnabled);
  }
  public V1ServiceStatusBuilder(V1ServiceStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ServiceStatusBuilder(V1ServiceStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ServiceStatus(), validationEnabled);
  }
  public V1ServiceStatusBuilder(V1ServiceStatusFluent<?> fluent,V1ServiceStatus instance) {
    this(fluent, instance, false);
  }
  public V1ServiceStatusBuilder(V1ServiceStatusFluent<?> fluent,V1ServiceStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConditions(instance.getConditions());

    fluent.withLoadBalancer(instance.getLoadBalancer());

    this.validationEnabled = validationEnabled; 
  }
  public V1ServiceStatusBuilder(V1ServiceStatus instance) {
    this(instance,false);
  }
  public V1ServiceStatusBuilder(V1ServiceStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withConditions(instance.getConditions());

    this.withLoadBalancer(instance.getLoadBalancer());

    this.validationEnabled = validationEnabled; 
  }
  V1ServiceStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1ServiceStatus build() {
    V1ServiceStatus buildable = new V1ServiceStatus();
    buildable.setConditions(fluent.getConditions());
    buildable.setLoadBalancer(fluent.getLoadBalancer());
    return buildable;
  }
  
}