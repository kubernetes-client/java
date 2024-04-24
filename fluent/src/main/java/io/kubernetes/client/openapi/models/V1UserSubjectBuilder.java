package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1UserSubjectBuilder extends V1UserSubjectFluent<V1UserSubjectBuilder> implements VisitableBuilder<V1UserSubject,V1UserSubjectBuilder>{
  public V1UserSubjectBuilder() {
    this(new V1UserSubject());
  }
  
  public V1UserSubjectBuilder(V1UserSubjectFluent<?> fluent) {
    this(fluent, new V1UserSubject());
  }
  
  public V1UserSubjectBuilder(V1UserSubjectFluent<?> fluent,V1UserSubject instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1UserSubjectBuilder(V1UserSubject instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1UserSubjectFluent<?> fluent;
  
  public V1UserSubject build() {
    V1UserSubject buildable = new V1UserSubject();
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}