package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ServiceBuilder extends V1ServiceFluentImpl<V1ServiceBuilder> implements VisitableBuilder<V1Service,V1ServiceBuilder>{
  public V1ServiceBuilder() {
    this(false);
  }
  public V1ServiceBuilder(Boolean validationEnabled) {
    this(new V1Service(), validationEnabled);
  }
  public V1ServiceBuilder(V1ServiceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ServiceBuilder(V1ServiceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Service(), validationEnabled);
  }
  public V1ServiceBuilder(V1ServiceFluent<?> fluent,V1Service instance) {
    this(fluent, instance, false);
  }
  public V1ServiceBuilder(V1ServiceFluent<?> fluent,V1Service instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1ServiceBuilder(V1Service instance) {
    this(instance,false);
  }
  public V1ServiceBuilder(V1Service instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1ServiceFluent<?> fluent;
  Boolean validationEnabled;
  public V1Service build() {
    V1Service buildable = new V1Service();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}