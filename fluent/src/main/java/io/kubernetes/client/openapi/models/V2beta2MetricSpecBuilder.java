package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2beta2MetricSpecBuilder extends V2beta2MetricSpecFluentImpl<V2beta2MetricSpecBuilder> implements VisitableBuilder<V2beta2MetricSpec,V2beta2MetricSpecBuilder>{
  public V2beta2MetricSpecBuilder() {
    this(false);
  }
  public V2beta2MetricSpecBuilder(Boolean validationEnabled) {
    this(new V2beta2MetricSpec(), validationEnabled);
  }
  public V2beta2MetricSpecBuilder(V2beta2MetricSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V2beta2MetricSpecBuilder(V2beta2MetricSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2beta2MetricSpec(), validationEnabled);
  }
  public V2beta2MetricSpecBuilder(V2beta2MetricSpecFluent<?> fluent,V2beta2MetricSpec instance) {
    this(fluent, instance, false);
  }
  public V2beta2MetricSpecBuilder(V2beta2MetricSpecFluent<?> fluent,V2beta2MetricSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withContainerResource(instance.getContainerResource());

    fluent.withExternal(instance.getExternal());

    fluent.withObject(instance.getObject());

    fluent.withPods(instance.getPods());

    fluent.withResource(instance.getResource());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V2beta2MetricSpecBuilder(V2beta2MetricSpec instance) {
    this(instance,false);
  }
  public V2beta2MetricSpecBuilder(V2beta2MetricSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withContainerResource(instance.getContainerResource());

    this.withExternal(instance.getExternal());

    this.withObject(instance.getObject());

    this.withPods(instance.getPods());

    this.withResource(instance.getResource());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V2beta2MetricSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V2beta2MetricSpec build() {
    V2beta2MetricSpec buildable = new V2beta2MetricSpec();
    buildable.setContainerResource(fluent.getContainerResource());
    buildable.setExternal(fluent.getExternal());
    buildable.setObject(fluent.getObject());
    buildable.setPods(fluent.getPods());
    buildable.setResource(fluent.getResource());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}