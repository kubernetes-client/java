package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2beta2ContainerResourceMetricStatusBuilder extends V2beta2ContainerResourceMetricStatusFluentImpl<V2beta2ContainerResourceMetricStatusBuilder> implements VisitableBuilder<V2beta2ContainerResourceMetricStatus,V2beta2ContainerResourceMetricStatusBuilder>{
  public V2beta2ContainerResourceMetricStatusBuilder() {
    this(false);
  }
  public V2beta2ContainerResourceMetricStatusBuilder(Boolean validationEnabled) {
    this(new V2beta2ContainerResourceMetricStatus(), validationEnabled);
  }
  public V2beta2ContainerResourceMetricStatusBuilder(V2beta2ContainerResourceMetricStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V2beta2ContainerResourceMetricStatusBuilder(V2beta2ContainerResourceMetricStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2beta2ContainerResourceMetricStatus(), validationEnabled);
  }
  public V2beta2ContainerResourceMetricStatusBuilder(V2beta2ContainerResourceMetricStatusFluent<?> fluent,V2beta2ContainerResourceMetricStatus instance) {
    this(fluent, instance, false);
  }
  public V2beta2ContainerResourceMetricStatusBuilder(V2beta2ContainerResourceMetricStatusFluent<?> fluent,V2beta2ContainerResourceMetricStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withContainer(instance.getContainer());

    fluent.withCurrent(instance.getCurrent());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V2beta2ContainerResourceMetricStatusBuilder(V2beta2ContainerResourceMetricStatus instance) {
    this(instance,false);
  }
  public V2beta2ContainerResourceMetricStatusBuilder(V2beta2ContainerResourceMetricStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withContainer(instance.getContainer());

    this.withCurrent(instance.getCurrent());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  V2beta2ContainerResourceMetricStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V2beta2ContainerResourceMetricStatus build() {
    V2beta2ContainerResourceMetricStatus buildable = new V2beta2ContainerResourceMetricStatus();
    buildable.setContainer(fluent.getContainer());
    buildable.setCurrent(fluent.getCurrent());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}