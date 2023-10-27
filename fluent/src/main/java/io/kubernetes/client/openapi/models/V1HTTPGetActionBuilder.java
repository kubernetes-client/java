package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1HTTPGetActionBuilder extends V1HTTPGetActionFluent<V1HTTPGetActionBuilder> implements VisitableBuilder<V1HTTPGetAction,V1HTTPGetActionBuilder>{
  public V1HTTPGetActionBuilder() {
    this(new V1HTTPGetAction());
  }
  
  public V1HTTPGetActionBuilder(V1HTTPGetActionFluent<?> fluent) {
    this(fluent, new V1HTTPGetAction());
  }
  
  public V1HTTPGetActionBuilder(V1HTTPGetActionFluent<?> fluent,V1HTTPGetAction instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1HTTPGetActionBuilder(V1HTTPGetAction instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1HTTPGetActionFluent<?> fluent;
  
  public V1HTTPGetAction build() {
    V1HTTPGetAction buildable = new V1HTTPGetAction();
    buildable.setHost(fluent.getHost());
    buildable.setHttpHeaders(fluent.buildHttpHeaders());
    buildable.setPath(fluent.getPath());
    buildable.setPort(fluent.getPort());
    buildable.setScheme(fluent.getScheme());
    return buildable;
  }
  

}