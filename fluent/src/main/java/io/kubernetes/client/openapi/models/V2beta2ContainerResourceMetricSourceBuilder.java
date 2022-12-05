package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2beta2ContainerResourceMetricSourceBuilder extends V2beta2ContainerResourceMetricSourceFluentImpl<V2beta2ContainerResourceMetricSourceBuilder> implements VisitableBuilder<V2beta2ContainerResourceMetricSource,V2beta2ContainerResourceMetricSourceBuilder>{
  public V2beta2ContainerResourceMetricSourceBuilder() {
    this(false);
  }
  public V2beta2ContainerResourceMetricSourceBuilder(Boolean validationEnabled) {
    this(new V2beta2ContainerResourceMetricSource(), validationEnabled);
  }
  public V2beta2ContainerResourceMetricSourceBuilder(V2beta2ContainerResourceMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V2beta2ContainerResourceMetricSourceBuilder(V2beta2ContainerResourceMetricSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2beta2ContainerResourceMetricSource(), validationEnabled);
  }
  public V2beta2ContainerResourceMetricSourceBuilder(V2beta2ContainerResourceMetricSourceFluent<?> fluent,V2beta2ContainerResourceMetricSource instance) {
    this(fluent, instance, false);
  }
  public V2beta2ContainerResourceMetricSourceBuilder(V2beta2ContainerResourceMetricSourceFluent<?> fluent,V2beta2ContainerResourceMetricSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withContainer(instance.getContainer());

    fluent.withName(instance.getName());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  public V2beta2ContainerResourceMetricSourceBuilder(V2beta2ContainerResourceMetricSource instance) {
    this(instance,false);
  }
  public V2beta2ContainerResourceMetricSourceBuilder(V2beta2ContainerResourceMetricSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withContainer(instance.getContainer());

    this.withName(instance.getName());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  V2beta2ContainerResourceMetricSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V2beta2ContainerResourceMetricSource build() {
    V2beta2ContainerResourceMetricSource buildable = new V2beta2ContainerResourceMetricSource();
    buildable.setContainer(fluent.getContainer());
    buildable.setName(fluent.getName());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
  
}