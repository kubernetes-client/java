package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1SecretReferenceBuilder extends V1SecretReferenceFluentImpl<V1SecretReferenceBuilder> implements VisitableBuilder<V1SecretReference,V1SecretReferenceBuilder>{
  public V1SecretReferenceBuilder() {
    this(false);
  }
  public V1SecretReferenceBuilder(Boolean validationEnabled) {
    this(new V1SecretReference(), validationEnabled);
  }
  public V1SecretReferenceBuilder(V1SecretReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SecretReferenceBuilder(V1SecretReferenceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1SecretReference(), validationEnabled);
  }
  public V1SecretReferenceBuilder(V1SecretReferenceFluent<?> fluent,V1SecretReference instance) {
    this(fluent, instance, false);
  }
  public V1SecretReferenceBuilder(V1SecretReferenceFluent<?> fluent,V1SecretReference instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    fluent.withNamespace(instance.getNamespace());

    this.validationEnabled = validationEnabled; 
  }
  public V1SecretReferenceBuilder(V1SecretReference instance) {
    this(instance,false);
  }
  public V1SecretReferenceBuilder(V1SecretReference instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.validationEnabled = validationEnabled; 
  }
  V1SecretReferenceFluent<?> fluent;
  Boolean validationEnabled;
  public V1SecretReference build() {
    V1SecretReference buildable = new V1SecretReference();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  
}