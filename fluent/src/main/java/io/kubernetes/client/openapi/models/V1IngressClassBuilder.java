package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1IngressClassBuilder extends V1IngressClassFluentImpl<V1IngressClassBuilder> implements VisitableBuilder<V1IngressClass,V1IngressClassBuilder>{
  public V1IngressClassBuilder() {
    this(false);
  }
  public V1IngressClassBuilder(Boolean validationEnabled) {
    this(new V1IngressClass(), validationEnabled);
  }
  public V1IngressClassBuilder(V1IngressClassFluent<?> fluent) {
    this(fluent, false);
  }
  public V1IngressClassBuilder(V1IngressClassFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1IngressClass(), validationEnabled);
  }
  public V1IngressClassBuilder(V1IngressClassFluent<?> fluent,V1IngressClass instance) {
    this(fluent, instance, false);
  }
  public V1IngressClassBuilder(V1IngressClassFluent<?> fluent,V1IngressClass instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled; 
  }
  public V1IngressClassBuilder(V1IngressClass instance) {
    this(instance,false);
  }
  public V1IngressClassBuilder(V1IngressClass instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled; 
  }
  V1IngressClassFluent<?> fluent;
  Boolean validationEnabled;
  public V1IngressClass build() {
    V1IngressClass buildable = new V1IngressClass();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }
  
}