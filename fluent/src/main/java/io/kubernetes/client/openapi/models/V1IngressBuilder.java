package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1IngressBuilder extends V1IngressFluentImpl<V1IngressBuilder> implements VisitableBuilder<V1Ingress,V1IngressBuilder>{
  public V1IngressBuilder() {
    this(false);
  }
  public V1IngressBuilder(Boolean validationEnabled) {
    this(new V1Ingress(), validationEnabled);
  }
  public V1IngressBuilder(V1IngressFluent<?> fluent) {
    this(fluent, false);
  }
  public V1IngressBuilder(V1IngressFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Ingress(), validationEnabled);
  }
  public V1IngressBuilder(V1IngressFluent<?> fluent,V1Ingress instance) {
    this(fluent, instance, false);
  }
  public V1IngressBuilder(V1IngressFluent<?> fluent,V1Ingress instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1IngressBuilder(V1Ingress instance) {
    this(instance,false);
  }
  public V1IngressBuilder(V1Ingress instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1IngressFluent<?> fluent;
  Boolean validationEnabled;
  public V1Ingress build() {
    V1Ingress buildable = new V1Ingress();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}