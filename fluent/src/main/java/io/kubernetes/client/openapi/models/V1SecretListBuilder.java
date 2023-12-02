package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SecretListBuilder extends V1SecretListFluent<V1SecretListBuilder> implements VisitableBuilder<V1SecretList,V1SecretListBuilder>{
  public V1SecretListBuilder() {
    this(new V1SecretList());
  }
  
  public V1SecretListBuilder(V1SecretListFluent<?> fluent) {
    this(fluent, new V1SecretList());
  }
  
  public V1SecretListBuilder(V1SecretListFluent<?> fluent,V1SecretList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SecretListBuilder(V1SecretList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SecretListFluent<?> fluent;
  
  public V1SecretList build() {
    V1SecretList buildable = new V1SecretList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}