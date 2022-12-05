package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1StatusCauseBuilder extends V1StatusCauseFluentImpl<V1StatusCauseBuilder> implements VisitableBuilder<V1StatusCause,V1StatusCauseBuilder>{
  public V1StatusCauseBuilder() {
    this(false);
  }
  public V1StatusCauseBuilder(Boolean validationEnabled) {
    this(new V1StatusCause(), validationEnabled);
  }
  public V1StatusCauseBuilder(V1StatusCauseFluent<?> fluent) {
    this(fluent, false);
  }
  public V1StatusCauseBuilder(V1StatusCauseFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1StatusCause(), validationEnabled);
  }
  public V1StatusCauseBuilder(V1StatusCauseFluent<?> fluent,V1StatusCause instance) {
    this(fluent, instance, false);
  }
  public V1StatusCauseBuilder(V1StatusCauseFluent<?> fluent,V1StatusCause instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withField(instance.getField());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    this.validationEnabled = validationEnabled; 
  }
  public V1StatusCauseBuilder(V1StatusCause instance) {
    this(instance,false);
  }
  public V1StatusCauseBuilder(V1StatusCause instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withField(instance.getField());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.validationEnabled = validationEnabled; 
  }
  V1StatusCauseFluent<?> fluent;
  Boolean validationEnabled;
  public V1StatusCause build() {
    V1StatusCause buildable = new V1StatusCause();
    buildable.setField(fluent.getField());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    return buildable;
  }
  
}