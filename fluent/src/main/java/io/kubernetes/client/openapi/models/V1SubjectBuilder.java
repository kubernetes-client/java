package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SubjectBuilder extends V1SubjectFluent<V1SubjectBuilder> implements VisitableBuilder<V1Subject,V1SubjectBuilder>{
  public V1SubjectBuilder() {
    this(new V1Subject());
  }
  
  public V1SubjectBuilder(V1SubjectFluent<?> fluent) {
    this(fluent, new V1Subject());
  }
  
  public V1SubjectBuilder(V1SubjectFluent<?> fluent,V1Subject instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SubjectBuilder(V1Subject instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SubjectFluent<?> fluent;
  
  public V1Subject build() {
    V1Subject buildable = new V1Subject();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  

}