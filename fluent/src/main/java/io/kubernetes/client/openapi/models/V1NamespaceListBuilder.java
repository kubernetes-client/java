package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NamespaceListBuilder extends V1NamespaceListFluent<V1NamespaceListBuilder> implements VisitableBuilder<V1NamespaceList,V1NamespaceListBuilder>{
  public V1NamespaceListBuilder() {
    this(new V1NamespaceList());
  }
  
  public V1NamespaceListBuilder(V1NamespaceListFluent<?> fluent) {
    this(fluent, new V1NamespaceList());
  }
  
  public V1NamespaceListBuilder(V1NamespaceListFluent<?> fluent,V1NamespaceList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NamespaceListBuilder(V1NamespaceList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NamespaceListFluent<?> fluent;
  
  public V1NamespaceList build() {
    V1NamespaceList buildable = new V1NamespaceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}