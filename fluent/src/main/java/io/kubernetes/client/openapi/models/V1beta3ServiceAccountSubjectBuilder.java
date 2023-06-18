package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3ServiceAccountSubjectBuilder extends V1beta3ServiceAccountSubjectFluentImpl<V1beta3ServiceAccountSubjectBuilder> implements VisitableBuilder<V1beta3ServiceAccountSubject,V1beta3ServiceAccountSubjectBuilder>{
  public V1beta3ServiceAccountSubjectBuilder() {
    this(false);
  }
  public V1beta3ServiceAccountSubjectBuilder(Boolean validationEnabled) {
    this(new V1beta3ServiceAccountSubject(), validationEnabled);
  }
  public V1beta3ServiceAccountSubjectBuilder(V1beta3ServiceAccountSubjectFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3ServiceAccountSubjectBuilder(V1beta3ServiceAccountSubjectFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3ServiceAccountSubject(), validationEnabled);
  }
  public V1beta3ServiceAccountSubjectBuilder(V1beta3ServiceAccountSubjectFluent<?> fluent,V1beta3ServiceAccountSubject instance) {
    this(fluent, instance, false);
  }
  public V1beta3ServiceAccountSubjectBuilder(V1beta3ServiceAccountSubjectFluent<?> fluent,V1beta3ServiceAccountSubject instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withName(instance.getName());
      fluent.withNamespace(instance.getNamespace());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta3ServiceAccountSubjectBuilder(V1beta3ServiceAccountSubject instance) {
    this(instance,false);
  }
  public V1beta3ServiceAccountSubjectBuilder(V1beta3ServiceAccountSubject instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withName(instance.getName());
      this.withNamespace(instance.getNamespace());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta3ServiceAccountSubjectFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta3ServiceAccountSubject build() {
    V1beta3ServiceAccountSubject buildable = new V1beta3ServiceAccountSubject();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  
}