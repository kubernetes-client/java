package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2SubjectBuilder extends V1beta2SubjectFluent<V1beta2SubjectBuilder> implements VisitableBuilder<V1beta2Subject,V1beta2SubjectBuilder>{
  public V1beta2SubjectBuilder() {
    this(new V1beta2Subject());
  }
  
  public V1beta2SubjectBuilder(V1beta2SubjectFluent<?> fluent) {
    this(fluent, new V1beta2Subject());
  }
  
  public V1beta2SubjectBuilder(V1beta2SubjectFluent<?> fluent,V1beta2Subject instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2SubjectBuilder(V1beta2Subject instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2SubjectFluent<?> fluent;
  
  public V1beta2Subject build() {
    V1beta2Subject buildable = new V1beta2Subject();
    buildable.setGroup(fluent.buildGroup());
    buildable.setKind(fluent.getKind());
    buildable.setServiceAccount(fluent.buildServiceAccount());
    buildable.setUser(fluent.buildUser());
    return buildable;
  }
  

}