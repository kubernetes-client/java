package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3SubjectBuilder extends V1beta3SubjectFluent<V1beta3SubjectBuilder> implements VisitableBuilder<V1beta3Subject,V1beta3SubjectBuilder>{
  public V1beta3SubjectBuilder() {
    this(new V1beta3Subject());
  }
  
  public V1beta3SubjectBuilder(V1beta3SubjectFluent<?> fluent) {
    this(fluent, new V1beta3Subject());
  }
  
  public V1beta3SubjectBuilder(V1beta3SubjectFluent<?> fluent,V1beta3Subject instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3SubjectBuilder(V1beta3Subject instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3SubjectFluent<?> fluent;
  
  public V1beta3Subject build() {
    V1beta3Subject buildable = new V1beta3Subject();
    buildable.setGroup(fluent.buildGroup());
    buildable.setKind(fluent.getKind());
    buildable.setServiceAccount(fluent.buildServiceAccount());
    buildable.setUser(fluent.buildUser());
    return buildable;
  }
  

}