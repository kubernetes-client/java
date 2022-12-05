package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ExecActionBuilder extends V1ExecActionFluentImpl<V1ExecActionBuilder> implements VisitableBuilder<V1ExecAction,V1ExecActionBuilder>{
  public V1ExecActionBuilder() {
    this(false);
  }
  public V1ExecActionBuilder(Boolean validationEnabled) {
    this(new V1ExecAction(), validationEnabled);
  }
  public V1ExecActionBuilder(V1ExecActionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ExecActionBuilder(V1ExecActionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ExecAction(), validationEnabled);
  }
  public V1ExecActionBuilder(V1ExecActionFluent<?> fluent,V1ExecAction instance) {
    this(fluent, instance, false);
  }
  public V1ExecActionBuilder(V1ExecActionFluent<?> fluent,V1ExecAction instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCommand(instance.getCommand());

    this.validationEnabled = validationEnabled; 
  }
  public V1ExecActionBuilder(V1ExecAction instance) {
    this(instance,false);
  }
  public V1ExecActionBuilder(V1ExecAction instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withCommand(instance.getCommand());

    this.validationEnabled = validationEnabled; 
  }
  V1ExecActionFluent<?> fluent;
  Boolean validationEnabled;
  public V1ExecAction build() {
    V1ExecAction buildable = new V1ExecAction();
    buildable.setCommand(fluent.getCommand());
    return buildable;
  }
  
}