package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1ServiceAccountSubjectBuilder extends V1beta1ServiceAccountSubjectFluentImpl<V1beta1ServiceAccountSubjectBuilder> implements VisitableBuilder<V1beta1ServiceAccountSubject,V1beta1ServiceAccountSubjectBuilder>{
  public V1beta1ServiceAccountSubjectBuilder() {
    this(false);
  }
  public V1beta1ServiceAccountSubjectBuilder(Boolean validationEnabled) {
    this(new V1beta1ServiceAccountSubject(), validationEnabled);
  }
  public V1beta1ServiceAccountSubjectBuilder(V1beta1ServiceAccountSubjectFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1ServiceAccountSubjectBuilder(V1beta1ServiceAccountSubjectFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1ServiceAccountSubject(), validationEnabled);
  }
  public V1beta1ServiceAccountSubjectBuilder(V1beta1ServiceAccountSubjectFluent<?> fluent,V1beta1ServiceAccountSubject instance) {
    this(fluent, instance, false);
  }
  public V1beta1ServiceAccountSubjectBuilder(V1beta1ServiceAccountSubjectFluent<?> fluent,V1beta1ServiceAccountSubject instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    fluent.withNamespace(instance.getNamespace());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1ServiceAccountSubjectBuilder(V1beta1ServiceAccountSubject instance) {
    this(instance,false);
  }
  public V1beta1ServiceAccountSubjectBuilder(V1beta1ServiceAccountSubject instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.validationEnabled = validationEnabled; 
  }
  V1beta1ServiceAccountSubjectFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1ServiceAccountSubject build() {
    V1beta1ServiceAccountSubject buildable = new V1beta1ServiceAccountSubject();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  
}