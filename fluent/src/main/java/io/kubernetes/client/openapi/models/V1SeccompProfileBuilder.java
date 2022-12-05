package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1SeccompProfileBuilder extends V1SeccompProfileFluentImpl<V1SeccompProfileBuilder> implements VisitableBuilder<V1SeccompProfile,V1SeccompProfileBuilder>{
  public V1SeccompProfileBuilder() {
    this(false);
  }
  public V1SeccompProfileBuilder(Boolean validationEnabled) {
    this(new V1SeccompProfile(), validationEnabled);
  }
  public V1SeccompProfileBuilder(V1SeccompProfileFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SeccompProfileBuilder(V1SeccompProfileFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1SeccompProfile(), validationEnabled);
  }
  public V1SeccompProfileBuilder(V1SeccompProfileFluent<?> fluent,V1SeccompProfile instance) {
    this(fluent, instance, false);
  }
  public V1SeccompProfileBuilder(V1SeccompProfileFluent<?> fluent,V1SeccompProfile instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLocalhostProfile(instance.getLocalhostProfile());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1SeccompProfileBuilder(V1SeccompProfile instance) {
    this(instance,false);
  }
  public V1SeccompProfileBuilder(V1SeccompProfile instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLocalhostProfile(instance.getLocalhostProfile());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1SeccompProfileFluent<?> fluent;
  Boolean validationEnabled;
  public V1SeccompProfile build() {
    V1SeccompProfile buildable = new V1SeccompProfile();
    buildable.setLocalhostProfile(fluent.getLocalhostProfile());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}