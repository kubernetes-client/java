package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta2UserSubjectBuilder extends V1beta2UserSubjectFluentImpl<V1beta2UserSubjectBuilder> implements VisitableBuilder<V1beta2UserSubject,V1beta2UserSubjectBuilder>{
  public V1beta2UserSubjectBuilder() {
    this(false);
  }
  public V1beta2UserSubjectBuilder(Boolean validationEnabled) {
    this(new V1beta2UserSubject(), validationEnabled);
  }
  public V1beta2UserSubjectBuilder(V1beta2UserSubjectFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2UserSubjectBuilder(V1beta2UserSubjectFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta2UserSubject(), validationEnabled);
  }
  public V1beta2UserSubjectBuilder(V1beta2UserSubjectFluent<?> fluent,V1beta2UserSubject instance) {
    this(fluent, instance, false);
  }
  public V1beta2UserSubjectBuilder(V1beta2UserSubjectFluent<?> fluent,V1beta2UserSubject instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2UserSubjectBuilder(V1beta2UserSubject instance) {
    this(instance,false);
  }
  public V1beta2UserSubjectBuilder(V1beta2UserSubject instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  V1beta2UserSubjectFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta2UserSubject build() {
    V1beta2UserSubject buildable = new V1beta2UserSubject();
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}