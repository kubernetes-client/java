package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3UserSubjectBuilder extends V1beta3UserSubjectFluentImpl<V1beta3UserSubjectBuilder> implements VisitableBuilder<V1beta3UserSubject,V1beta3UserSubjectBuilder>{
  public V1beta3UserSubjectBuilder() {
    this(false);
  }
  public V1beta3UserSubjectBuilder(Boolean validationEnabled) {
    this(new V1beta3UserSubject(), validationEnabled);
  }
  public V1beta3UserSubjectBuilder(V1beta3UserSubjectFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3UserSubjectBuilder(V1beta3UserSubjectFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3UserSubject(), validationEnabled);
  }
  public V1beta3UserSubjectBuilder(V1beta3UserSubjectFluent<?> fluent,V1beta3UserSubject instance) {
    this(fluent, instance, false);
  }
  public V1beta3UserSubjectBuilder(V1beta3UserSubjectFluent<?> fluent,V1beta3UserSubject instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withName(instance.getName());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta3UserSubjectBuilder(V1beta3UserSubject instance) {
    this(instance,false);
  }
  public V1beta3UserSubjectBuilder(V1beta3UserSubject instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withName(instance.getName());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta3UserSubjectFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta3UserSubject build() {
    V1beta3UserSubject buildable = new V1beta3UserSubject();
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}