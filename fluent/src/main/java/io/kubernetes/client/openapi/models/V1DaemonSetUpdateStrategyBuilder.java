package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1DaemonSetUpdateStrategyBuilder extends V1DaemonSetUpdateStrategyFluentImpl<V1DaemonSetUpdateStrategyBuilder> implements VisitableBuilder<V1DaemonSetUpdateStrategy,V1DaemonSetUpdateStrategyBuilder>{
  public V1DaemonSetUpdateStrategyBuilder() {
    this(false);
  }
  public V1DaemonSetUpdateStrategyBuilder(Boolean validationEnabled) {
    this(new V1DaemonSetUpdateStrategy(), validationEnabled);
  }
  public V1DaemonSetUpdateStrategyBuilder(V1DaemonSetUpdateStrategyFluent<?> fluent) {
    this(fluent, false);
  }
  public V1DaemonSetUpdateStrategyBuilder(V1DaemonSetUpdateStrategyFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1DaemonSetUpdateStrategy(), validationEnabled);
  }
  public V1DaemonSetUpdateStrategyBuilder(V1DaemonSetUpdateStrategyFluent<?> fluent,V1DaemonSetUpdateStrategy instance) {
    this(fluent, instance, false);
  }
  public V1DaemonSetUpdateStrategyBuilder(V1DaemonSetUpdateStrategyFluent<?> fluent,V1DaemonSetUpdateStrategy instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withRollingUpdate(instance.getRollingUpdate());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1DaemonSetUpdateStrategyBuilder(V1DaemonSetUpdateStrategy instance) {
    this(instance,false);
  }
  public V1DaemonSetUpdateStrategyBuilder(V1DaemonSetUpdateStrategy instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withRollingUpdate(instance.getRollingUpdate());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1DaemonSetUpdateStrategyFluent<?> fluent;
  Boolean validationEnabled;
  public V1DaemonSetUpdateStrategy build() {
    V1DaemonSetUpdateStrategy buildable = new V1DaemonSetUpdateStrategy();
    buildable.setRollingUpdate(fluent.getRollingUpdate());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}