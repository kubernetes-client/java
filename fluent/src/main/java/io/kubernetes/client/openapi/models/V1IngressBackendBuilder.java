package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1IngressBackendBuilder extends V1IngressBackendFluentImpl<V1IngressBackendBuilder> implements VisitableBuilder<V1IngressBackend,V1IngressBackendBuilder>{
  public V1IngressBackendBuilder() {
    this(false);
  }
  public V1IngressBackendBuilder(Boolean validationEnabled) {
    this(new V1IngressBackend(), validationEnabled);
  }
  public V1IngressBackendBuilder(V1IngressBackendFluent<?> fluent) {
    this(fluent, false);
  }
  public V1IngressBackendBuilder(V1IngressBackendFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1IngressBackend(), validationEnabled);
  }
  public V1IngressBackendBuilder(V1IngressBackendFluent<?> fluent,V1IngressBackend instance) {
    this(fluent, instance, false);
  }
  public V1IngressBackendBuilder(V1IngressBackendFluent<?> fluent,V1IngressBackend instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withResource(instance.getResource());

    fluent.withService(instance.getService());

    this.validationEnabled = validationEnabled; 
  }
  public V1IngressBackendBuilder(V1IngressBackend instance) {
    this(instance,false);
  }
  public V1IngressBackendBuilder(V1IngressBackend instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withResource(instance.getResource());

    this.withService(instance.getService());

    this.validationEnabled = validationEnabled; 
  }
  V1IngressBackendFluent<?> fluent;
  Boolean validationEnabled;
  public V1IngressBackend build() {
    V1IngressBackend buildable = new V1IngressBackend();
    buildable.setResource(fluent.getResource());
    buildable.setService(fluent.getService());
    return buildable;
  }
  
}