package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3UserSubjectBuilder extends V1beta3UserSubjectFluent<V1beta3UserSubjectBuilder> implements VisitableBuilder<V1beta3UserSubject,V1beta3UserSubjectBuilder>{
  public V1beta3UserSubjectBuilder() {
    this(new V1beta3UserSubject());
  }
  
  public V1beta3UserSubjectBuilder(V1beta3UserSubjectFluent<?> fluent) {
    this(fluent, new V1beta3UserSubject());
  }
  
  public V1beta3UserSubjectBuilder(V1beta3UserSubjectFluent<?> fluent,V1beta3UserSubject instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3UserSubjectBuilder(V1beta3UserSubject instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3UserSubjectFluent<?> fluent;
  
  public V1beta3UserSubject build() {
    V1beta3UserSubject buildable = new V1beta3UserSubject();
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}