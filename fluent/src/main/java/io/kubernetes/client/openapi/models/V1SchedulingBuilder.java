package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1SchedulingBuilder extends V1SchedulingFluentImpl<V1SchedulingBuilder> implements VisitableBuilder<V1Scheduling,V1SchedulingBuilder>{
  public V1SchedulingBuilder() {
    this(false);
  }
  public V1SchedulingBuilder(Boolean validationEnabled) {
    this(new V1Scheduling(), validationEnabled);
  }
  public V1SchedulingBuilder(V1SchedulingFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SchedulingBuilder(V1SchedulingFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Scheduling(), validationEnabled);
  }
  public V1SchedulingBuilder(V1SchedulingFluent<?> fluent,V1Scheduling instance) {
    this(fluent, instance, false);
  }
  public V1SchedulingBuilder(V1SchedulingFluent<?> fluent,V1Scheduling instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withNodeSelector(instance.getNodeSelector());

    fluent.withTolerations(instance.getTolerations());

    this.validationEnabled = validationEnabled; 
  }
  public V1SchedulingBuilder(V1Scheduling instance) {
    this(instance,false);
  }
  public V1SchedulingBuilder(V1Scheduling instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withNodeSelector(instance.getNodeSelector());

    this.withTolerations(instance.getTolerations());

    this.validationEnabled = validationEnabled; 
  }
  V1SchedulingFluent<?> fluent;
  Boolean validationEnabled;
  public V1Scheduling build() {
    V1Scheduling buildable = new V1Scheduling();
    buildable.setNodeSelector(fluent.getNodeSelector());
    buildable.setTolerations(fluent.getTolerations());
    return buildable;
  }
  
}