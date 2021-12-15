package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta2UserSubjectBuilder extends io.kubernetes.client.openapi.models.V1beta2UserSubjectFluentImpl<io.kubernetes.client.openapi.models.V1beta2UserSubjectBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta2UserSubject,io.kubernetes.client.openapi.models.V1beta2UserSubjectBuilder>{
  public V1beta2UserSubjectBuilder() {
    this(false);
  }
  public V1beta2UserSubjectBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta2UserSubject(), validationEnabled);
  }
  public V1beta2UserSubjectBuilder(io.kubernetes.client.openapi.models.V1beta2UserSubjectFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2UserSubjectBuilder(io.kubernetes.client.openapi.models.V1beta2UserSubjectFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2UserSubject(), validationEnabled);
  }
  public V1beta2UserSubjectBuilder(io.kubernetes.client.openapi.models.V1beta2UserSubjectFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2UserSubject instance) {
    this(fluent, instance, false);
  }
  public V1beta2UserSubjectBuilder(io.kubernetes.client.openapi.models.V1beta2UserSubjectFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2UserSubject instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2UserSubjectBuilder(io.kubernetes.client.openapi.models.V1beta2UserSubject instance) {
    this(instance,false);
  }
  public V1beta2UserSubjectBuilder(io.kubernetes.client.openapi.models.V1beta2UserSubject instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta2UserSubjectFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta2UserSubject build() {
    V1beta2UserSubject buildable = new V1beta2UserSubject();
    buildable.setName(fluent.getName());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2UserSubjectBuilder that = (V1beta2UserSubjectBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}