package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2MetricSpecBuilder extends V2MetricSpecFluentImpl<V2MetricSpecBuilder> implements VisitableBuilder<V2MetricSpec,V2MetricSpecBuilder>{
  public V2MetricSpecBuilder() {
    this(false);
  }
  public V2MetricSpecBuilder(Boolean validationEnabled) {
    this(new V2MetricSpec(), validationEnabled);
  }
  public V2MetricSpecBuilder(V2MetricSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V2MetricSpecBuilder(V2MetricSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2MetricSpec(), validationEnabled);
  }
  public V2MetricSpecBuilder(V2MetricSpecFluent<?> fluent,V2MetricSpec instance) {
    this(fluent, instance, false);
  }
  public V2MetricSpecBuilder(V2MetricSpecFluent<?> fluent,V2MetricSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withContainerResource(instance.getContainerResource());

    fluent.withExternal(instance.getExternal());

    fluent.withObject(instance.getObject());

    fluent.withPods(instance.getPods());

    fluent.withResource(instance.getResource());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V2MetricSpecBuilder(V2MetricSpec instance) {
    this(instance,false);
  }
  public V2MetricSpecBuilder(V2MetricSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withContainerResource(instance.getContainerResource());

    this.withExternal(instance.getExternal());

    this.withObject(instance.getObject());

    this.withPods(instance.getPods());

    this.withResource(instance.getResource());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V2MetricSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V2MetricSpec build() {
    V2MetricSpec buildable = new V2MetricSpec();
    buildable.setContainerResource(fluent.getContainerResource());
    buildable.setExternal(fluent.getExternal());
    buildable.setObject(fluent.getObject());
    buildable.setPods(fluent.getPods());
    buildable.setResource(fluent.getResource());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}