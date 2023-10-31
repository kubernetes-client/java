package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2ServiceAccountSubjectBuilder extends V1beta2ServiceAccountSubjectFluent<V1beta2ServiceAccountSubjectBuilder> implements VisitableBuilder<V1beta2ServiceAccountSubject,V1beta2ServiceAccountSubjectBuilder>{
  public V1beta2ServiceAccountSubjectBuilder() {
    this(new V1beta2ServiceAccountSubject());
  }
  
  public V1beta2ServiceAccountSubjectBuilder(V1beta2ServiceAccountSubjectFluent<?> fluent) {
    this(fluent, new V1beta2ServiceAccountSubject());
  }
  
  public V1beta2ServiceAccountSubjectBuilder(V1beta2ServiceAccountSubjectFluent<?> fluent,V1beta2ServiceAccountSubject instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2ServiceAccountSubjectBuilder(V1beta2ServiceAccountSubject instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2ServiceAccountSubjectFluent<?> fluent;
  
  public V1beta2ServiceAccountSubject build() {
    V1beta2ServiceAccountSubject buildable = new V1beta2ServiceAccountSubject();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  

}