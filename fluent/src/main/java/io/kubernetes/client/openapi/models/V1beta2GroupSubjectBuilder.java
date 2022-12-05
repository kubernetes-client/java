package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta2GroupSubjectBuilder extends V1beta2GroupSubjectFluentImpl<V1beta2GroupSubjectBuilder> implements VisitableBuilder<V1beta2GroupSubject,V1beta2GroupSubjectBuilder>{
  public V1beta2GroupSubjectBuilder() {
    this(false);
  }
  public V1beta2GroupSubjectBuilder(Boolean validationEnabled) {
    this(new V1beta2GroupSubject(), validationEnabled);
  }
  public V1beta2GroupSubjectBuilder(V1beta2GroupSubjectFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2GroupSubjectBuilder(V1beta2GroupSubjectFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta2GroupSubject(), validationEnabled);
  }
  public V1beta2GroupSubjectBuilder(V1beta2GroupSubjectFluent<?> fluent,V1beta2GroupSubject instance) {
    this(fluent, instance, false);
  }
  public V1beta2GroupSubjectBuilder(V1beta2GroupSubjectFluent<?> fluent,V1beta2GroupSubject instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2GroupSubjectBuilder(V1beta2GroupSubject instance) {
    this(instance,false);
  }
  public V1beta2GroupSubjectBuilder(V1beta2GroupSubject instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  V1beta2GroupSubjectFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta2GroupSubject build() {
    V1beta2GroupSubject buildable = new V1beta2GroupSubject();
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}