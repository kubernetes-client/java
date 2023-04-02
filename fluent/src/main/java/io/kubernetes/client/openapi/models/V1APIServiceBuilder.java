package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1APIServiceBuilder extends V1APIServiceFluentImpl<V1APIServiceBuilder> implements VisitableBuilder<V1APIService,V1APIServiceBuilder>{
  public V1APIServiceBuilder() {
    this(false);
  }
  public V1APIServiceBuilder(Boolean validationEnabled) {
    this(new V1APIService(), validationEnabled);
  }
  public V1APIServiceBuilder(V1APIServiceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1APIServiceBuilder(V1APIServiceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1APIService(), validationEnabled);
  }
  public V1APIServiceBuilder(V1APIServiceFluent<?> fluent,V1APIService instance) {
    this(fluent, instance, false);
  }
  public V1APIServiceBuilder(V1APIServiceFluent<?> fluent,V1APIService instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1APIServiceBuilder(V1APIService instance) {
    this(instance,false);
  }
  public V1APIServiceBuilder(V1APIService instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1APIServiceFluent<?> fluent;
  Boolean validationEnabled;
  public V1APIService build() {
    V1APIService buildable = new V1APIService();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}