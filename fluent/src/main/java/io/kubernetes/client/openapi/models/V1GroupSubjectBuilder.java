package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1GroupSubjectBuilder extends V1GroupSubjectFluent<V1GroupSubjectBuilder> implements VisitableBuilder<V1GroupSubject,V1GroupSubjectBuilder>{
  public V1GroupSubjectBuilder() {
    this(new V1GroupSubject());
  }
  
  public V1GroupSubjectBuilder(V1GroupSubjectFluent<?> fluent) {
    this(fluent, new V1GroupSubject());
  }
  
  public V1GroupSubjectBuilder(V1GroupSubjectFluent<?> fluent,V1GroupSubject instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1GroupSubjectBuilder(V1GroupSubject instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1GroupSubjectFluent<?> fluent;
  
  public V1GroupSubject build() {
    V1GroupSubject buildable = new V1GroupSubject();
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}