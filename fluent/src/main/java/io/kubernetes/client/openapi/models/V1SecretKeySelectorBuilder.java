package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1SecretKeySelectorBuilder extends V1SecretKeySelectorFluentImpl<V1SecretKeySelectorBuilder> implements VisitableBuilder<V1SecretKeySelector,V1SecretKeySelectorBuilder>{
  public V1SecretKeySelectorBuilder() {
    this(false);
  }
  public V1SecretKeySelectorBuilder(Boolean validationEnabled) {
    this(new V1SecretKeySelector(), validationEnabled);
  }
  public V1SecretKeySelectorBuilder(V1SecretKeySelectorFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SecretKeySelectorBuilder(V1SecretKeySelectorFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1SecretKeySelector(), validationEnabled);
  }
  public V1SecretKeySelectorBuilder(V1SecretKeySelectorFluent<?> fluent,V1SecretKeySelector instance) {
    this(fluent, instance, false);
  }
  public V1SecretKeySelectorBuilder(V1SecretKeySelectorFluent<?> fluent,V1SecretKeySelector instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withKey(instance.getKey());

    fluent.withName(instance.getName());

    fluent.withOptional(instance.getOptional());

    this.validationEnabled = validationEnabled; 
  }
  public V1SecretKeySelectorBuilder(V1SecretKeySelector instance) {
    this(instance,false);
  }
  public V1SecretKeySelectorBuilder(V1SecretKeySelector instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withKey(instance.getKey());

    this.withName(instance.getName());

    this.withOptional(instance.getOptional());

    this.validationEnabled = validationEnabled; 
  }
  V1SecretKeySelectorFluent<?> fluent;
  Boolean validationEnabled;
  public V1SecretKeySelector build() {
    V1SecretKeySelector buildable = new V1SecretKeySelector();
    buildable.setKey(fluent.getKey());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  
}