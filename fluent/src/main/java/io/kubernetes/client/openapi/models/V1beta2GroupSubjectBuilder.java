package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2GroupSubjectBuilder extends V1beta2GroupSubjectFluent<V1beta2GroupSubjectBuilder> implements VisitableBuilder<V1beta2GroupSubject,V1beta2GroupSubjectBuilder>{
  public V1beta2GroupSubjectBuilder() {
    this(new V1beta2GroupSubject());
  }
  
  public V1beta2GroupSubjectBuilder(V1beta2GroupSubjectFluent<?> fluent) {
    this(fluent, new V1beta2GroupSubject());
  }
  
  public V1beta2GroupSubjectBuilder(V1beta2GroupSubjectFluent<?> fluent,V1beta2GroupSubject instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2GroupSubjectBuilder(V1beta2GroupSubject instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2GroupSubjectFluent<?> fluent;
  
  public V1beta2GroupSubject build() {
    V1beta2GroupSubject buildable = new V1beta2GroupSubject();
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}