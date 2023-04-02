package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1GroupSubjectBuilder extends V1beta1GroupSubjectFluentImpl<V1beta1GroupSubjectBuilder> implements VisitableBuilder<V1beta1GroupSubject,V1beta1GroupSubjectBuilder>{
  public V1beta1GroupSubjectBuilder() {
    this(false);
  }
  public V1beta1GroupSubjectBuilder(Boolean validationEnabled) {
    this(new V1beta1GroupSubject(), validationEnabled);
  }
  public V1beta1GroupSubjectBuilder(V1beta1GroupSubjectFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1GroupSubjectBuilder(V1beta1GroupSubjectFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1GroupSubject(), validationEnabled);
  }
  public V1beta1GroupSubjectBuilder(V1beta1GroupSubjectFluent<?> fluent,V1beta1GroupSubject instance) {
    this(fluent, instance, false);
  }
  public V1beta1GroupSubjectBuilder(V1beta1GroupSubjectFluent<?> fluent,V1beta1GroupSubject instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1GroupSubjectBuilder(V1beta1GroupSubject instance) {
    this(instance,false);
  }
  public V1beta1GroupSubjectBuilder(V1beta1GroupSubject instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  V1beta1GroupSubjectFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1GroupSubject build() {
    V1beta1GroupSubject buildable = new V1beta1GroupSubject();
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}