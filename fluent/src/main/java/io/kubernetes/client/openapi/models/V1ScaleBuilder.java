package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ScaleBuilder extends V1ScaleFluentImpl<V1ScaleBuilder> implements VisitableBuilder<V1Scale,V1ScaleBuilder>{
  public V1ScaleBuilder() {
    this(false);
  }
  public V1ScaleBuilder(Boolean validationEnabled) {
    this(new V1Scale(), validationEnabled);
  }
  public V1ScaleBuilder(V1ScaleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ScaleBuilder(V1ScaleFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Scale(), validationEnabled);
  }
  public V1ScaleBuilder(V1ScaleFluent<?> fluent,V1Scale instance) {
    this(fluent, instance, false);
  }
  public V1ScaleBuilder(V1ScaleFluent<?> fluent,V1Scale instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1ScaleBuilder(V1Scale instance) {
    this(instance,false);
  }
  public V1ScaleBuilder(V1Scale instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1ScaleFluent<?> fluent;
  Boolean validationEnabled;
  public V1Scale build() {
    V1Scale buildable = new V1Scale();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}