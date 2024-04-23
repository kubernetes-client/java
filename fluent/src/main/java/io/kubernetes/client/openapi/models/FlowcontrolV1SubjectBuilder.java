package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class FlowcontrolV1SubjectBuilder extends FlowcontrolV1SubjectFluent<FlowcontrolV1SubjectBuilder> implements VisitableBuilder<FlowcontrolV1Subject,FlowcontrolV1SubjectBuilder>{
  public FlowcontrolV1SubjectBuilder() {
    this(new FlowcontrolV1Subject());
  }
  
  public FlowcontrolV1SubjectBuilder(FlowcontrolV1SubjectFluent<?> fluent) {
    this(fluent, new FlowcontrolV1Subject());
  }
  
  public FlowcontrolV1SubjectBuilder(FlowcontrolV1SubjectFluent<?> fluent,FlowcontrolV1Subject instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public FlowcontrolV1SubjectBuilder(FlowcontrolV1Subject instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  FlowcontrolV1SubjectFluent<?> fluent;
  
  public FlowcontrolV1Subject build() {
    FlowcontrolV1Subject buildable = new FlowcontrolV1Subject();
    buildable.setGroup(fluent.buildGroup());
    buildable.setKind(fluent.getKind());
    buildable.setServiceAccount(fluent.buildServiceAccount());
    buildable.setUser(fluent.buildUser());
    return buildable;
  }
  

}