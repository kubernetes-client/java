package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3GroupSubjectBuilder extends V1beta3GroupSubjectFluentImpl<V1beta3GroupSubjectBuilder> implements VisitableBuilder<V1beta3GroupSubject,V1beta3GroupSubjectBuilder>{
  public V1beta3GroupSubjectBuilder() {
    this(false);
  }
  public V1beta3GroupSubjectBuilder(Boolean validationEnabled) {
    this(new V1beta3GroupSubject(), validationEnabled);
  }
  public V1beta3GroupSubjectBuilder(V1beta3GroupSubjectFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3GroupSubjectBuilder(V1beta3GroupSubjectFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3GroupSubject(), validationEnabled);
  }
  public V1beta3GroupSubjectBuilder(V1beta3GroupSubjectFluent<?> fluent,V1beta3GroupSubject instance) {
    this(fluent, instance, false);
  }
  public V1beta3GroupSubjectBuilder(V1beta3GroupSubjectFluent<?> fluent,V1beta3GroupSubject instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withName(instance.getName());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta3GroupSubjectBuilder(V1beta3GroupSubject instance) {
    this(instance,false);
  }
  public V1beta3GroupSubjectBuilder(V1beta3GroupSubject instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withName(instance.getName());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta3GroupSubjectFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta3GroupSubject build() {
    V1beta3GroupSubject buildable = new V1beta3GroupSubject();
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}