package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NodeListBuilder extends V1NodeListFluent<V1NodeListBuilder> implements VisitableBuilder<V1NodeList,V1NodeListBuilder>{
  public V1NodeListBuilder() {
    this(new V1NodeList());
  }
  
  public V1NodeListBuilder(V1NodeListFluent<?> fluent) {
    this(fluent, new V1NodeList());
  }
  
  public V1NodeListBuilder(V1NodeListFluent<?> fluent,V1NodeList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NodeListBuilder(V1NodeList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NodeListFluent<?> fluent;
  
  public V1NodeList build() {
    V1NodeList buildable = new V1NodeList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}