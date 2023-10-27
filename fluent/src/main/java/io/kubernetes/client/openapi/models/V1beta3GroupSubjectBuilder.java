package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3GroupSubjectBuilder extends V1beta3GroupSubjectFluent<V1beta3GroupSubjectBuilder> implements VisitableBuilder<V1beta3GroupSubject,V1beta3GroupSubjectBuilder>{
  public V1beta3GroupSubjectBuilder() {
    this(new V1beta3GroupSubject());
  }
  
  public V1beta3GroupSubjectBuilder(V1beta3GroupSubjectFluent<?> fluent) {
    this(fluent, new V1beta3GroupSubject());
  }
  
  public V1beta3GroupSubjectBuilder(V1beta3GroupSubjectFluent<?> fluent,V1beta3GroupSubject instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3GroupSubjectBuilder(V1beta3GroupSubject instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3GroupSubjectFluent<?> fluent;
  
  public V1beta3GroupSubject build() {
    V1beta3GroupSubject buildable = new V1beta3GroupSubject();
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}