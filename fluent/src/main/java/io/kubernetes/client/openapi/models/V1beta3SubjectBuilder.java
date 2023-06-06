package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3SubjectBuilder extends V1beta3SubjectFluentImpl<V1beta3SubjectBuilder> implements VisitableBuilder<V1beta3Subject,V1beta3SubjectBuilder>{
  public V1beta3SubjectBuilder() {
    this(false);
  }
  public V1beta3SubjectBuilder(Boolean validationEnabled) {
    this(new V1beta3Subject(), validationEnabled);
  }
  public V1beta3SubjectBuilder(V1beta3SubjectFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3SubjectBuilder(V1beta3SubjectFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3Subject(), validationEnabled);
  }
  public V1beta3SubjectBuilder(V1beta3SubjectFluent<?> fluent,V1beta3Subject instance) {
    this(fluent, instance, false);
  }
  public V1beta3SubjectBuilder(V1beta3SubjectFluent<?> fluent,V1beta3Subject instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withGroup(instance.getGroup());
      fluent.withKind(instance.getKind());
      fluent.withServiceAccount(instance.getServiceAccount());
      fluent.withUser(instance.getUser());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta3SubjectBuilder(V1beta3Subject instance) {
    this(instance,false);
  }
  public V1beta3SubjectBuilder(V1beta3Subject instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withGroup(instance.getGroup());
      this.withKind(instance.getKind());
      this.withServiceAccount(instance.getServiceAccount());
      this.withUser(instance.getUser());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta3SubjectFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta3Subject build() {
    V1beta3Subject buildable = new V1beta3Subject();
    buildable.setGroup(fluent.getGroup());
    buildable.setKind(fluent.getKind());
    buildable.setServiceAccount(fluent.getServiceAccount());
    buildable.setUser(fluent.getUser());
    return buildable;
  }
  
}