package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1StatusBuilder extends V1StatusFluentImpl<V1StatusBuilder> implements VisitableBuilder<V1Status,V1StatusBuilder>{
  public V1StatusBuilder() {
    this(false);
  }
  public V1StatusBuilder(Boolean validationEnabled) {
    this(new V1Status(), validationEnabled);
  }
  public V1StatusBuilder(V1StatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1StatusBuilder(V1StatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Status(), validationEnabled);
  }
  public V1StatusBuilder(V1StatusFluent<?> fluent,V1Status instance) {
    this(fluent, instance, false);
  }
  public V1StatusBuilder(V1StatusFluent<?> fluent,V1Status instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withCode(instance.getCode());

    fluent.withDetails(instance.getDetails());

    fluent.withKind(instance.getKind());

    fluent.withMessage(instance.getMessage());

    fluent.withMetadata(instance.getMetadata());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1StatusBuilder(V1Status instance) {
    this(instance,false);
  }
  public V1StatusBuilder(V1Status instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withCode(instance.getCode());

    this.withDetails(instance.getDetails());

    this.withKind(instance.getKind());

    this.withMessage(instance.getMessage());

    this.withMetadata(instance.getMetadata());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1StatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1Status build() {
    V1Status buildable = new V1Status();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setCode(fluent.getCode());
    buildable.setDetails(fluent.getDetails());
    buildable.setKind(fluent.getKind());
    buildable.setMessage(fluent.getMessage());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}