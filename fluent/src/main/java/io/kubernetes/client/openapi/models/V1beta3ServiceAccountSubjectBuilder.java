package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3ServiceAccountSubjectBuilder extends V1beta3ServiceAccountSubjectFluent<V1beta3ServiceAccountSubjectBuilder> implements VisitableBuilder<V1beta3ServiceAccountSubject,V1beta3ServiceAccountSubjectBuilder>{
  public V1beta3ServiceAccountSubjectBuilder() {
    this(new V1beta3ServiceAccountSubject());
  }
  
  public V1beta3ServiceAccountSubjectBuilder(V1beta3ServiceAccountSubjectFluent<?> fluent) {
    this(fluent, new V1beta3ServiceAccountSubject());
  }
  
  public V1beta3ServiceAccountSubjectBuilder(V1beta3ServiceAccountSubjectFluent<?> fluent,V1beta3ServiceAccountSubject instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3ServiceAccountSubjectBuilder(V1beta3ServiceAccountSubject instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3ServiceAccountSubjectFluent<?> fluent;
  
  public V1beta3ServiceAccountSubject build() {
    V1beta3ServiceAccountSubject buildable = new V1beta3ServiceAccountSubject();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  

}