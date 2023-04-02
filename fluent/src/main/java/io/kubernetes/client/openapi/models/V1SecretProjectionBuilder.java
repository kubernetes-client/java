package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1SecretProjectionBuilder extends V1SecretProjectionFluentImpl<V1SecretProjectionBuilder> implements VisitableBuilder<V1SecretProjection,V1SecretProjectionBuilder>{
  public V1SecretProjectionBuilder() {
    this(false);
  }
  public V1SecretProjectionBuilder(Boolean validationEnabled) {
    this(new V1SecretProjection(), validationEnabled);
  }
  public V1SecretProjectionBuilder(V1SecretProjectionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SecretProjectionBuilder(V1SecretProjectionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1SecretProjection(), validationEnabled);
  }
  public V1SecretProjectionBuilder(V1SecretProjectionFluent<?> fluent,V1SecretProjection instance) {
    this(fluent, instance, false);
  }
  public V1SecretProjectionBuilder(V1SecretProjectionFluent<?> fluent,V1SecretProjection instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withItems(instance.getItems());

    fluent.withName(instance.getName());

    fluent.withOptional(instance.getOptional());

    this.validationEnabled = validationEnabled; 
  }
  public V1SecretProjectionBuilder(V1SecretProjection instance) {
    this(instance,false);
  }
  public V1SecretProjectionBuilder(V1SecretProjection instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withItems(instance.getItems());

    this.withName(instance.getName());

    this.withOptional(instance.getOptional());

    this.validationEnabled = validationEnabled; 
  }
  V1SecretProjectionFluent<?> fluent;
  Boolean validationEnabled;
  public V1SecretProjection build() {
    V1SecretProjection buildable = new V1SecretProjection();
    buildable.setItems(fluent.getItems());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  
}