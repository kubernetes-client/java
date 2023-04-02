package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2ContainerResourceMetricSourceBuilder extends V2ContainerResourceMetricSourceFluentImpl<V2ContainerResourceMetricSourceBuilder> implements VisitableBuilder<V2ContainerResourceMetricSource,V2ContainerResourceMetricSourceBuilder>{
  public V2ContainerResourceMetricSourceBuilder() {
    this(false);
  }
  public V2ContainerResourceMetricSourceBuilder(Boolean validationEnabled) {
    this(new V2ContainerResourceMetricSource(), validationEnabled);
  }
  public V2ContainerResourceMetricSourceBuilder(V2ContainerResourceMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V2ContainerResourceMetricSourceBuilder(V2ContainerResourceMetricSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2ContainerResourceMetricSource(), validationEnabled);
  }
  public V2ContainerResourceMetricSourceBuilder(V2ContainerResourceMetricSourceFluent<?> fluent,V2ContainerResourceMetricSource instance) {
    this(fluent, instance, false);
  }
  public V2ContainerResourceMetricSourceBuilder(V2ContainerResourceMetricSourceFluent<?> fluent,V2ContainerResourceMetricSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withContainer(instance.getContainer());

    fluent.withName(instance.getName());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  public V2ContainerResourceMetricSourceBuilder(V2ContainerResourceMetricSource instance) {
    this(instance,false);
  }
  public V2ContainerResourceMetricSourceBuilder(V2ContainerResourceMetricSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withContainer(instance.getContainer());

    this.withName(instance.getName());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  V2ContainerResourceMetricSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V2ContainerResourceMetricSource build() {
    V2ContainerResourceMetricSource buildable = new V2ContainerResourceMetricSource();
    buildable.setContainer(fluent.getContainer());
    buildable.setName(fluent.getName());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
  
}