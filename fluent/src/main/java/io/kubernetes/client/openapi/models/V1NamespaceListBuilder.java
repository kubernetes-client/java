package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NamespaceListBuilder extends V1NamespaceListFluentImpl<V1NamespaceListBuilder> implements VisitableBuilder<V1NamespaceList,V1NamespaceListBuilder>{
  public V1NamespaceListBuilder() {
    this(false);
  }
  public V1NamespaceListBuilder(Boolean validationEnabled) {
    this(new V1NamespaceList(), validationEnabled);
  }
  public V1NamespaceListBuilder(V1NamespaceListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NamespaceListBuilder(V1NamespaceListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NamespaceList(), validationEnabled);
  }
  public V1NamespaceListBuilder(V1NamespaceListFluent<?> fluent,V1NamespaceList instance) {
    this(fluent, instance, false);
  }
  public V1NamespaceListBuilder(V1NamespaceListFluent<?> fluent,V1NamespaceList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1NamespaceListBuilder(V1NamespaceList instance) {
    this(instance,false);
  }
  public V1NamespaceListBuilder(V1NamespaceList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1NamespaceListFluent<?> fluent;
  Boolean validationEnabled;
  public V1NamespaceList build() {
    V1NamespaceList buildable = new V1NamespaceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}