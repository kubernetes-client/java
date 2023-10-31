package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1IngressListBuilder extends V1IngressListFluent<V1IngressListBuilder> implements VisitableBuilder<V1IngressList,V1IngressListBuilder>{
  public V1IngressListBuilder() {
    this(new V1IngressList());
  }
  
  public V1IngressListBuilder(V1IngressListFluent<?> fluent) {
    this(fluent, new V1IngressList());
  }
  
  public V1IngressListBuilder(V1IngressListFluent<?> fluent,V1IngressList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1IngressListBuilder(V1IngressList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1IngressListFluent<?> fluent;
  
  public V1IngressList build() {
    V1IngressList buildable = new V1IngressList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}