package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ConfigMapKeySelectorBuilder extends V1ConfigMapKeySelectorFluentImpl<V1ConfigMapKeySelectorBuilder> implements VisitableBuilder<V1ConfigMapKeySelector,V1ConfigMapKeySelectorBuilder>{
  public V1ConfigMapKeySelectorBuilder() {
    this(false);
  }
  public V1ConfigMapKeySelectorBuilder(Boolean validationEnabled) {
    this(new V1ConfigMapKeySelector(), validationEnabled);
  }
  public V1ConfigMapKeySelectorBuilder(V1ConfigMapKeySelectorFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ConfigMapKeySelectorBuilder(V1ConfigMapKeySelectorFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ConfigMapKeySelector(), validationEnabled);
  }
  public V1ConfigMapKeySelectorBuilder(V1ConfigMapKeySelectorFluent<?> fluent,V1ConfigMapKeySelector instance) {
    this(fluent, instance, false);
  }
  public V1ConfigMapKeySelectorBuilder(V1ConfigMapKeySelectorFluent<?> fluent,V1ConfigMapKeySelector instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withKey(instance.getKey());

    fluent.withName(instance.getName());

    fluent.withOptional(instance.getOptional());

    this.validationEnabled = validationEnabled; 
  }
  public V1ConfigMapKeySelectorBuilder(V1ConfigMapKeySelector instance) {
    this(instance,false);
  }
  public V1ConfigMapKeySelectorBuilder(V1ConfigMapKeySelector instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withKey(instance.getKey());

    this.withName(instance.getName());

    this.withOptional(instance.getOptional());

    this.validationEnabled = validationEnabled; 
  }
  V1ConfigMapKeySelectorFluent<?> fluent;
  Boolean validationEnabled;
  public V1ConfigMapKeySelector build() {
    V1ConfigMapKeySelector buildable = new V1ConfigMapKeySelector();
    buildable.setKey(fluent.getKey());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  
}