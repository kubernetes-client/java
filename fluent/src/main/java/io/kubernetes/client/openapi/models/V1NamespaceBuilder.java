package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NamespaceBuilder extends V1NamespaceFluentImpl<V1NamespaceBuilder> implements VisitableBuilder<V1Namespace,V1NamespaceBuilder>{
  public V1NamespaceBuilder() {
    this(false);
  }
  public V1NamespaceBuilder(Boolean validationEnabled) {
    this(new V1Namespace(), validationEnabled);
  }
  public V1NamespaceBuilder(V1NamespaceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NamespaceBuilder(V1NamespaceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Namespace(), validationEnabled);
  }
  public V1NamespaceBuilder(V1NamespaceFluent<?> fluent,V1Namespace instance) {
    this(fluent, instance, false);
  }
  public V1NamespaceBuilder(V1NamespaceFluent<?> fluent,V1Namespace instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1NamespaceBuilder(V1Namespace instance) {
    this(instance,false);
  }
  public V1NamespaceBuilder(V1Namespace instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1NamespaceFluent<?> fluent;
  Boolean validationEnabled;
  public V1Namespace build() {
    V1Namespace buildable = new V1Namespace();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}