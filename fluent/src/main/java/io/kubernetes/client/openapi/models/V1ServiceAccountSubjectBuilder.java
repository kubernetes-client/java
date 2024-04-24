package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ServiceAccountSubjectBuilder extends V1ServiceAccountSubjectFluent<V1ServiceAccountSubjectBuilder> implements VisitableBuilder<V1ServiceAccountSubject,V1ServiceAccountSubjectBuilder>{
  public V1ServiceAccountSubjectBuilder() {
    this(new V1ServiceAccountSubject());
  }
  
  public V1ServiceAccountSubjectBuilder(V1ServiceAccountSubjectFluent<?> fluent) {
    this(fluent, new V1ServiceAccountSubject());
  }
  
  public V1ServiceAccountSubjectBuilder(V1ServiceAccountSubjectFluent<?> fluent,V1ServiceAccountSubject instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ServiceAccountSubjectBuilder(V1ServiceAccountSubject instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ServiceAccountSubjectFluent<?> fluent;
  
  public V1ServiceAccountSubject build() {
    V1ServiceAccountSubject buildable = new V1ServiceAccountSubject();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  

}