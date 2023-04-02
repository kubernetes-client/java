package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1IngressClassSpecBuilder extends V1IngressClassSpecFluentImpl<V1IngressClassSpecBuilder> implements VisitableBuilder<V1IngressClassSpec,V1IngressClassSpecBuilder>{
  public V1IngressClassSpecBuilder() {
    this(false);
  }
  public V1IngressClassSpecBuilder(Boolean validationEnabled) {
    this(new V1IngressClassSpec(), validationEnabled);
  }
  public V1IngressClassSpecBuilder(V1IngressClassSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1IngressClassSpecBuilder(V1IngressClassSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1IngressClassSpec(), validationEnabled);
  }
  public V1IngressClassSpecBuilder(V1IngressClassSpecFluent<?> fluent,V1IngressClassSpec instance) {
    this(fluent, instance, false);
  }
  public V1IngressClassSpecBuilder(V1IngressClassSpecFluent<?> fluent,V1IngressClassSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withController(instance.getController());

    fluent.withParameters(instance.getParameters());

    this.validationEnabled = validationEnabled; 
  }
  public V1IngressClassSpecBuilder(V1IngressClassSpec instance) {
    this(instance,false);
  }
  public V1IngressClassSpecBuilder(V1IngressClassSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withController(instance.getController());

    this.withParameters(instance.getParameters());

    this.validationEnabled = validationEnabled; 
  }
  V1IngressClassSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1IngressClassSpec build() {
    V1IngressClassSpec buildable = new V1IngressClassSpec();
    buildable.setController(fluent.getController());
    buildable.setParameters(fluent.getParameters());
    return buildable;
  }
  
}