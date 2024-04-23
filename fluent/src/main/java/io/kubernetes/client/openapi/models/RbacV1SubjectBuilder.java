package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class RbacV1SubjectBuilder extends RbacV1SubjectFluent<RbacV1SubjectBuilder> implements VisitableBuilder<RbacV1Subject,RbacV1SubjectBuilder>{
  public RbacV1SubjectBuilder() {
    this(new RbacV1Subject());
  }
  
  public RbacV1SubjectBuilder(RbacV1SubjectFluent<?> fluent) {
    this(fluent, new RbacV1Subject());
  }
  
  public RbacV1SubjectBuilder(RbacV1SubjectFluent<?> fluent,RbacV1Subject instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public RbacV1SubjectBuilder(RbacV1Subject instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  RbacV1SubjectFluent<?> fluent;
  
  public RbacV1Subject build() {
    RbacV1Subject buildable = new RbacV1Subject();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  

}