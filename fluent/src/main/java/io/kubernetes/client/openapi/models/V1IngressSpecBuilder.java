package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1IngressSpecBuilder extends V1IngressSpecFluentImpl<V1IngressSpecBuilder> implements VisitableBuilder<V1IngressSpec,V1IngressSpecBuilder>{
  public V1IngressSpecBuilder() {
    this(false);
  }
  public V1IngressSpecBuilder(Boolean validationEnabled) {
    this(new V1IngressSpec(), validationEnabled);
  }
  public V1IngressSpecBuilder(V1IngressSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1IngressSpecBuilder(V1IngressSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1IngressSpec(), validationEnabled);
  }
  public V1IngressSpecBuilder(V1IngressSpecFluent<?> fluent,V1IngressSpec instance) {
    this(fluent, instance, false);
  }
  public V1IngressSpecBuilder(V1IngressSpecFluent<?> fluent,V1IngressSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDefaultBackend(instance.getDefaultBackend());

    fluent.withIngressClassName(instance.getIngressClassName());

    fluent.withRules(instance.getRules());

    fluent.withTls(instance.getTls());

    this.validationEnabled = validationEnabled; 
  }
  public V1IngressSpecBuilder(V1IngressSpec instance) {
    this(instance,false);
  }
  public V1IngressSpecBuilder(V1IngressSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withDefaultBackend(instance.getDefaultBackend());

    this.withIngressClassName(instance.getIngressClassName());

    this.withRules(instance.getRules());

    this.withTls(instance.getTls());

    this.validationEnabled = validationEnabled; 
  }
  V1IngressSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1IngressSpec build() {
    V1IngressSpec buildable = new V1IngressSpec();
    buildable.setDefaultBackend(fluent.getDefaultBackend());
    buildable.setIngressClassName(fluent.getIngressClassName());
    buildable.setRules(fluent.getRules());
    buildable.setTls(fluent.getTls());
    return buildable;
  }
  
}