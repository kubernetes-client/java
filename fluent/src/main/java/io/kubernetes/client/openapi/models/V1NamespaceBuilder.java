package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NamespaceBuilder extends V1NamespaceFluent<V1NamespaceBuilder> implements VisitableBuilder<V1Namespace,V1NamespaceBuilder>{
  public V1NamespaceBuilder() {
    this(new V1Namespace());
  }
  
  public V1NamespaceBuilder(V1NamespaceFluent<?> fluent) {
    this(fluent, new V1Namespace());
  }
  
  public V1NamespaceBuilder(V1NamespaceFluent<?> fluent,V1Namespace instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NamespaceBuilder(V1Namespace instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NamespaceFluent<?> fluent;
  
  public V1Namespace build() {
    V1Namespace buildable = new V1Namespace();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}