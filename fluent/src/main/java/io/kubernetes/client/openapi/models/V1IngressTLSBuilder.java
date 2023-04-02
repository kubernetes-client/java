package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1IngressTLSBuilder extends V1IngressTLSFluentImpl<V1IngressTLSBuilder> implements VisitableBuilder<V1IngressTLS,V1IngressTLSBuilder>{
  public V1IngressTLSBuilder() {
    this(false);
  }
  public V1IngressTLSBuilder(Boolean validationEnabled) {
    this(new V1IngressTLS(), validationEnabled);
  }
  public V1IngressTLSBuilder(V1IngressTLSFluent<?> fluent) {
    this(fluent, false);
  }
  public V1IngressTLSBuilder(V1IngressTLSFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1IngressTLS(), validationEnabled);
  }
  public V1IngressTLSBuilder(V1IngressTLSFluent<?> fluent,V1IngressTLS instance) {
    this(fluent, instance, false);
  }
  public V1IngressTLSBuilder(V1IngressTLSFluent<?> fluent,V1IngressTLS instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withHosts(instance.getHosts());

    fluent.withSecretName(instance.getSecretName());

    this.validationEnabled = validationEnabled; 
  }
  public V1IngressTLSBuilder(V1IngressTLS instance) {
    this(instance,false);
  }
  public V1IngressTLSBuilder(V1IngressTLS instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withHosts(instance.getHosts());

    this.withSecretName(instance.getSecretName());

    this.validationEnabled = validationEnabled; 
  }
  V1IngressTLSFluent<?> fluent;
  Boolean validationEnabled;
  public V1IngressTLS build() {
    V1IngressTLS buildable = new V1IngressTLS();
    buildable.setHosts(fluent.getHosts());
    buildable.setSecretName(fluent.getSecretName());
    return buildable;
  }
  
}