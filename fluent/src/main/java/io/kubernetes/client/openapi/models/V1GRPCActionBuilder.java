package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1GRPCActionBuilder extends V1GRPCActionFluentImpl<V1GRPCActionBuilder> implements VisitableBuilder<V1GRPCAction,V1GRPCActionBuilder>{
  public V1GRPCActionBuilder() {
    this(false);
  }
  public V1GRPCActionBuilder(Boolean validationEnabled) {
    this(new V1GRPCAction(), validationEnabled);
  }
  public V1GRPCActionBuilder(V1GRPCActionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1GRPCActionBuilder(V1GRPCActionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1GRPCAction(), validationEnabled);
  }
  public V1GRPCActionBuilder(V1GRPCActionFluent<?> fluent,V1GRPCAction instance) {
    this(fluent, instance, false);
  }
  public V1GRPCActionBuilder(V1GRPCActionFluent<?> fluent,V1GRPCAction instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withPort(instance.getPort());

    fluent.withService(instance.getService());

    this.validationEnabled = validationEnabled; 
  }
  public V1GRPCActionBuilder(V1GRPCAction instance) {
    this(instance,false);
  }
  public V1GRPCActionBuilder(V1GRPCAction instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withPort(instance.getPort());

    this.withService(instance.getService());

    this.validationEnabled = validationEnabled; 
  }
  V1GRPCActionFluent<?> fluent;
  Boolean validationEnabled;
  public V1GRPCAction build() {
    V1GRPCAction buildable = new V1GRPCAction();
    buildable.setPort(fluent.getPort());
    buildable.setService(fluent.getService());
    return buildable;
  }
  
}