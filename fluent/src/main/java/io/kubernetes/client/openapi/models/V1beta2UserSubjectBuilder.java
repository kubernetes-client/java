package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2UserSubjectBuilder extends V1beta2UserSubjectFluent<V1beta2UserSubjectBuilder> implements VisitableBuilder<V1beta2UserSubject,V1beta2UserSubjectBuilder>{
  public V1beta2UserSubjectBuilder() {
    this(new V1beta2UserSubject());
  }
  
  public V1beta2UserSubjectBuilder(V1beta2UserSubjectFluent<?> fluent) {
    this(fluent, new V1beta2UserSubject());
  }
  
  public V1beta2UserSubjectBuilder(V1beta2UserSubjectFluent<?> fluent,V1beta2UserSubject instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2UserSubjectBuilder(V1beta2UserSubject instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2UserSubjectFluent<?> fluent;
  
  public V1beta2UserSubject build() {
    V1beta2UserSubject buildable = new V1beta2UserSubject();
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}