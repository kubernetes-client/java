package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta2SubjectBuilder extends V1beta2SubjectFluentImpl<V1beta2SubjectBuilder> implements VisitableBuilder<V1beta2Subject,V1beta2SubjectBuilder>{
  public V1beta2SubjectBuilder() {
    this(false);
  }
  public V1beta2SubjectBuilder(Boolean validationEnabled) {
    this(new V1beta2Subject(), validationEnabled);
  }
  public V1beta2SubjectBuilder(V1beta2SubjectFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2SubjectBuilder(V1beta2SubjectFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta2Subject(), validationEnabled);
  }
  public V1beta2SubjectBuilder(V1beta2SubjectFluent<?> fluent,V1beta2Subject instance) {
    this(fluent, instance, false);
  }
  public V1beta2SubjectBuilder(V1beta2SubjectFluent<?> fluent,V1beta2Subject instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withGroup(instance.getGroup());

    fluent.withKind(instance.getKind());

    fluent.withServiceAccount(instance.getServiceAccount());

    fluent.withUser(instance.getUser());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2SubjectBuilder(V1beta2Subject instance) {
    this(instance,false);
  }
  public V1beta2SubjectBuilder(V1beta2Subject instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withGroup(instance.getGroup());

    this.withKind(instance.getKind());

    this.withServiceAccount(instance.getServiceAccount());

    this.withUser(instance.getUser());

    this.validationEnabled = validationEnabled; 
  }
  V1beta2SubjectFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta2Subject build() {
    V1beta2Subject buildable = new V1beta2Subject();
    buildable.setGroup(fluent.getGroup());
    buildable.setKind(fluent.getKind());
    buildable.setServiceAccount(fluent.getServiceAccount());
    buildable.setUser(fluent.getUser());
    return buildable;
  }
  
}