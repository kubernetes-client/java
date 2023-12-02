package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SecretReferenceBuilder extends V1SecretReferenceFluent<V1SecretReferenceBuilder> implements VisitableBuilder<V1SecretReference,V1SecretReferenceBuilder>{
  public V1SecretReferenceBuilder() {
    this(new V1SecretReference());
  }
  
  public V1SecretReferenceBuilder(V1SecretReferenceFluent<?> fluent) {
    this(fluent, new V1SecretReference());
  }
  
  public V1SecretReferenceBuilder(V1SecretReferenceFluent<?> fluent,V1SecretReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SecretReferenceBuilder(V1SecretReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SecretReferenceFluent<?> fluent;
  
  public V1SecretReference build() {
    V1SecretReference buildable = new V1SecretReference();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  

}