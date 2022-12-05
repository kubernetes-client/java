package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ReplicationControllerBuilder extends V1ReplicationControllerFluentImpl<V1ReplicationControllerBuilder> implements VisitableBuilder<V1ReplicationController,V1ReplicationControllerBuilder>{
  public V1ReplicationControllerBuilder() {
    this(false);
  }
  public V1ReplicationControllerBuilder(Boolean validationEnabled) {
    this(new V1ReplicationController(), validationEnabled);
  }
  public V1ReplicationControllerBuilder(V1ReplicationControllerFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ReplicationControllerBuilder(V1ReplicationControllerFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ReplicationController(), validationEnabled);
  }
  public V1ReplicationControllerBuilder(V1ReplicationControllerFluent<?> fluent,V1ReplicationController instance) {
    this(fluent, instance, false);
  }
  public V1ReplicationControllerBuilder(V1ReplicationControllerFluent<?> fluent,V1ReplicationController instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1ReplicationControllerBuilder(V1ReplicationController instance) {
    this(instance,false);
  }
  public V1ReplicationControllerBuilder(V1ReplicationController instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1ReplicationControllerFluent<?> fluent;
  Boolean validationEnabled;
  public V1ReplicationController build() {
    V1ReplicationController buildable = new V1ReplicationController();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}