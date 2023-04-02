package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2beta2MetricStatusBuilder extends V2beta2MetricStatusFluentImpl<V2beta2MetricStatusBuilder> implements VisitableBuilder<V2beta2MetricStatus,V2beta2MetricStatusBuilder>{
  public V2beta2MetricStatusBuilder() {
    this(false);
  }
  public V2beta2MetricStatusBuilder(Boolean validationEnabled) {
    this(new V2beta2MetricStatus(), validationEnabled);
  }
  public V2beta2MetricStatusBuilder(V2beta2MetricStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V2beta2MetricStatusBuilder(V2beta2MetricStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2beta2MetricStatus(), validationEnabled);
  }
  public V2beta2MetricStatusBuilder(V2beta2MetricStatusFluent<?> fluent,V2beta2MetricStatus instance) {
    this(fluent, instance, false);
  }
  public V2beta2MetricStatusBuilder(V2beta2MetricStatusFluent<?> fluent,V2beta2MetricStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withContainerResource(instance.getContainerResource());

    fluent.withExternal(instance.getExternal());

    fluent.withObject(instance.getObject());

    fluent.withPods(instance.getPods());

    fluent.withResource(instance.getResource());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V2beta2MetricStatusBuilder(V2beta2MetricStatus instance) {
    this(instance,false);
  }
  public V2beta2MetricStatusBuilder(V2beta2MetricStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withContainerResource(instance.getContainerResource());

    this.withExternal(instance.getExternal());

    this.withObject(instance.getObject());

    this.withPods(instance.getPods());

    this.withResource(instance.getResource());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V2beta2MetricStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V2beta2MetricStatus build() {
    V2beta2MetricStatus buildable = new V2beta2MetricStatus();
    buildable.setContainerResource(fluent.getContainerResource());
    buildable.setExternal(fluent.getExternal());
    buildable.setObject(fluent.getObject());
    buildable.setPods(fluent.getPods());
    buildable.setResource(fluent.getResource());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}