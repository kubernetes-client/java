package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1IngressServiceBackendBuilder extends V1IngressServiceBackendFluentImpl<V1IngressServiceBackendBuilder> implements VisitableBuilder<V1IngressServiceBackend,V1IngressServiceBackendBuilder>{
  public V1IngressServiceBackendBuilder() {
    this(false);
  }
  public V1IngressServiceBackendBuilder(Boolean validationEnabled) {
    this(new V1IngressServiceBackend(), validationEnabled);
  }
  public V1IngressServiceBackendBuilder(V1IngressServiceBackendFluent<?> fluent) {
    this(fluent, false);
  }
  public V1IngressServiceBackendBuilder(V1IngressServiceBackendFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1IngressServiceBackend(), validationEnabled);
  }
  public V1IngressServiceBackendBuilder(V1IngressServiceBackendFluent<?> fluent,V1IngressServiceBackend instance) {
    this(fluent, instance, false);
  }
  public V1IngressServiceBackendBuilder(V1IngressServiceBackendFluent<?> fluent,V1IngressServiceBackend instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    fluent.withPort(instance.getPort());

    this.validationEnabled = validationEnabled; 
  }
  public V1IngressServiceBackendBuilder(V1IngressServiceBackend instance) {
    this(instance,false);
  }
  public V1IngressServiceBackendBuilder(V1IngressServiceBackend instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.withPort(instance.getPort());

    this.validationEnabled = validationEnabled; 
  }
  V1IngressServiceBackendFluent<?> fluent;
  Boolean validationEnabled;
  public V1IngressServiceBackend build() {
    V1IngressServiceBackend buildable = new V1IngressServiceBackend();
    buildable.setName(fluent.getName());
    buildable.setPort(fluent.getPort());
    return buildable;
  }
  
}