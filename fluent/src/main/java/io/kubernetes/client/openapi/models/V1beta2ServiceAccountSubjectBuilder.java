package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta2ServiceAccountSubjectBuilder extends V1beta2ServiceAccountSubjectFluentImpl<V1beta2ServiceAccountSubjectBuilder> implements VisitableBuilder<V1beta2ServiceAccountSubject,V1beta2ServiceAccountSubjectBuilder>{
  public V1beta2ServiceAccountSubjectBuilder() {
    this(false);
  }
  public V1beta2ServiceAccountSubjectBuilder(Boolean validationEnabled) {
    this(new V1beta2ServiceAccountSubject(), validationEnabled);
  }
  public V1beta2ServiceAccountSubjectBuilder(V1beta2ServiceAccountSubjectFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2ServiceAccountSubjectBuilder(V1beta2ServiceAccountSubjectFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta2ServiceAccountSubject(), validationEnabled);
  }
  public V1beta2ServiceAccountSubjectBuilder(V1beta2ServiceAccountSubjectFluent<?> fluent,V1beta2ServiceAccountSubject instance) {
    this(fluent, instance, false);
  }
  public V1beta2ServiceAccountSubjectBuilder(V1beta2ServiceAccountSubjectFluent<?> fluent,V1beta2ServiceAccountSubject instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    fluent.withNamespace(instance.getNamespace());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2ServiceAccountSubjectBuilder(V1beta2ServiceAccountSubject instance) {
    this(instance,false);
  }
  public V1beta2ServiceAccountSubjectBuilder(V1beta2ServiceAccountSubject instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.validationEnabled = validationEnabled; 
  }
  V1beta2ServiceAccountSubjectFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta2ServiceAccountSubject build() {
    V1beta2ServiceAccountSubject buildable = new V1beta2ServiceAccountSubject();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  
}