package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodBuilder extends V1PodFluentImpl<V1PodBuilder> implements VisitableBuilder<V1Pod,V1PodBuilder>{
  public V1PodBuilder() {
    this(false);
  }
  public V1PodBuilder(Boolean validationEnabled) {
    this(new V1Pod(), validationEnabled);
  }
  public V1PodBuilder(V1PodFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodBuilder(V1PodFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Pod(), validationEnabled);
  }
  public V1PodBuilder(V1PodFluent<?> fluent,V1Pod instance) {
    this(fluent, instance, false);
  }
  public V1PodBuilder(V1PodFluent<?> fluent,V1Pod instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodBuilder(V1Pod instance) {
    this(instance,false);
  }
  public V1PodBuilder(V1Pod instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1PodFluent<?> fluent;
  Boolean validationEnabled;
  public V1Pod build() {
    V1Pod buildable = new V1Pod();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}