package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1JobBuilder extends V1JobFluentImpl<V1JobBuilder> implements VisitableBuilder<V1Job,V1JobBuilder>{
  public V1JobBuilder() {
    this(false);
  }
  public V1JobBuilder(Boolean validationEnabled) {
    this(new V1Job(), validationEnabled);
  }
  public V1JobBuilder(V1JobFluent<?> fluent) {
    this(fluent, false);
  }
  public V1JobBuilder(V1JobFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Job(), validationEnabled);
  }
  public V1JobBuilder(V1JobFluent<?> fluent,V1Job instance) {
    this(fluent, instance, false);
  }
  public V1JobBuilder(V1JobFluent<?> fluent,V1Job instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1JobBuilder(V1Job instance) {
    this(instance,false);
  }
  public V1JobBuilder(V1Job instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1JobFluent<?> fluent;
  Boolean validationEnabled;
  public V1Job build() {
    V1Job buildable = new V1Job();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}