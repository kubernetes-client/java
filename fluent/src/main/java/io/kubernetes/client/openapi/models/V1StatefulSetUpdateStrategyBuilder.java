package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1StatefulSetUpdateStrategyBuilder extends V1StatefulSetUpdateStrategyFluentImpl<V1StatefulSetUpdateStrategyBuilder> implements VisitableBuilder<V1StatefulSetUpdateStrategy,V1StatefulSetUpdateStrategyBuilder>{
  public V1StatefulSetUpdateStrategyBuilder() {
    this(false);
  }
  public V1StatefulSetUpdateStrategyBuilder(Boolean validationEnabled) {
    this(new V1StatefulSetUpdateStrategy(), validationEnabled);
  }
  public V1StatefulSetUpdateStrategyBuilder(V1StatefulSetUpdateStrategyFluent<?> fluent) {
    this(fluent, false);
  }
  public V1StatefulSetUpdateStrategyBuilder(V1StatefulSetUpdateStrategyFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1StatefulSetUpdateStrategy(), validationEnabled);
  }
  public V1StatefulSetUpdateStrategyBuilder(V1StatefulSetUpdateStrategyFluent<?> fluent,V1StatefulSetUpdateStrategy instance) {
    this(fluent, instance, false);
  }
  public V1StatefulSetUpdateStrategyBuilder(V1StatefulSetUpdateStrategyFluent<?> fluent,V1StatefulSetUpdateStrategy instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withRollingUpdate(instance.getRollingUpdate());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1StatefulSetUpdateStrategyBuilder(V1StatefulSetUpdateStrategy instance) {
    this(instance,false);
  }
  public V1StatefulSetUpdateStrategyBuilder(V1StatefulSetUpdateStrategy instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withRollingUpdate(instance.getRollingUpdate());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1StatefulSetUpdateStrategyFluent<?> fluent;
  Boolean validationEnabled;
  public V1StatefulSetUpdateStrategy build() {
    V1StatefulSetUpdateStrategy buildable = new V1StatefulSetUpdateStrategy();
    buildable.setRollingUpdate(fluent.getRollingUpdate());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}