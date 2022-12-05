package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2MetricIdentifierBuilder extends V2MetricIdentifierFluentImpl<V2MetricIdentifierBuilder> implements VisitableBuilder<V2MetricIdentifier,V2MetricIdentifierBuilder>{
  public V2MetricIdentifierBuilder() {
    this(false);
  }
  public V2MetricIdentifierBuilder(Boolean validationEnabled) {
    this(new V2MetricIdentifier(), validationEnabled);
  }
  public V2MetricIdentifierBuilder(V2MetricIdentifierFluent<?> fluent) {
    this(fluent, false);
  }
  public V2MetricIdentifierBuilder(V2MetricIdentifierFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2MetricIdentifier(), validationEnabled);
  }
  public V2MetricIdentifierBuilder(V2MetricIdentifierFluent<?> fluent,V2MetricIdentifier instance) {
    this(fluent, instance, false);
  }
  public V2MetricIdentifierBuilder(V2MetricIdentifierFluent<?> fluent,V2MetricIdentifier instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    fluent.withSelector(instance.getSelector());

    this.validationEnabled = validationEnabled; 
  }
  public V2MetricIdentifierBuilder(V2MetricIdentifier instance) {
    this(instance,false);
  }
  public V2MetricIdentifierBuilder(V2MetricIdentifier instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.withSelector(instance.getSelector());

    this.validationEnabled = validationEnabled; 
  }
  V2MetricIdentifierFluent<?> fluent;
  Boolean validationEnabled;
  public V2MetricIdentifier build() {
    V2MetricIdentifier buildable = new V2MetricIdentifier();
    buildable.setName(fluent.getName());
    buildable.setSelector(fluent.getSelector());
    return buildable;
  }
  
}