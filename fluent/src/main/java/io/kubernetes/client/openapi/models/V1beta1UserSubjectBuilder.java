package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1UserSubjectBuilder extends V1beta1UserSubjectFluentImpl<V1beta1UserSubjectBuilder> implements VisitableBuilder<V1beta1UserSubject,V1beta1UserSubjectBuilder>{
  public V1beta1UserSubjectBuilder() {
    this(false);
  }
  public V1beta1UserSubjectBuilder(Boolean validationEnabled) {
    this(new V1beta1UserSubject(), validationEnabled);
  }
  public V1beta1UserSubjectBuilder(V1beta1UserSubjectFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1UserSubjectBuilder(V1beta1UserSubjectFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1UserSubject(), validationEnabled);
  }
  public V1beta1UserSubjectBuilder(V1beta1UserSubjectFluent<?> fluent,V1beta1UserSubject instance) {
    this(fluent, instance, false);
  }
  public V1beta1UserSubjectBuilder(V1beta1UserSubjectFluent<?> fluent,V1beta1UserSubject instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1UserSubjectBuilder(V1beta1UserSubject instance) {
    this(instance,false);
  }
  public V1beta1UserSubjectBuilder(V1beta1UserSubject instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  V1beta1UserSubjectFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1UserSubject build() {
    V1beta1UserSubject buildable = new V1beta1UserSubject();
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}