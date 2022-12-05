package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1HTTPGetActionBuilder extends V1HTTPGetActionFluentImpl<V1HTTPGetActionBuilder> implements VisitableBuilder<V1HTTPGetAction,V1HTTPGetActionBuilder>{
  public V1HTTPGetActionBuilder() {
    this(false);
  }
  public V1HTTPGetActionBuilder(Boolean validationEnabled) {
    this(new V1HTTPGetAction(), validationEnabled);
  }
  public V1HTTPGetActionBuilder(V1HTTPGetActionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1HTTPGetActionBuilder(V1HTTPGetActionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1HTTPGetAction(), validationEnabled);
  }
  public V1HTTPGetActionBuilder(V1HTTPGetActionFluent<?> fluent,V1HTTPGetAction instance) {
    this(fluent, instance, false);
  }
  public V1HTTPGetActionBuilder(V1HTTPGetActionFluent<?> fluent,V1HTTPGetAction instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withHost(instance.getHost());

    fluent.withHttpHeaders(instance.getHttpHeaders());

    fluent.withPath(instance.getPath());

    fluent.withPort(instance.getPort());

    fluent.withScheme(instance.getScheme());

    this.validationEnabled = validationEnabled; 
  }
  public V1HTTPGetActionBuilder(V1HTTPGetAction instance) {
    this(instance,false);
  }
  public V1HTTPGetActionBuilder(V1HTTPGetAction instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withHost(instance.getHost());

    this.withHttpHeaders(instance.getHttpHeaders());

    this.withPath(instance.getPath());

    this.withPort(instance.getPort());

    this.withScheme(instance.getScheme());

    this.validationEnabled = validationEnabled; 
  }
  V1HTTPGetActionFluent<?> fluent;
  Boolean validationEnabled;
  public V1HTTPGetAction build() {
    V1HTTPGetAction buildable = new V1HTTPGetAction();
    buildable.setHost(fluent.getHost());
    buildable.setHttpHeaders(fluent.getHttpHeaders());
    buildable.setPath(fluent.getPath());
    buildable.setPort(fluent.getPort());
    buildable.setScheme(fluent.getScheme());
    return buildable;
  }
  
}