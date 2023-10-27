package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1IngressClassListBuilder extends V1IngressClassListFluent<V1IngressClassListBuilder> implements VisitableBuilder<V1IngressClassList,V1IngressClassListBuilder>{
  public V1IngressClassListBuilder() {
    this(new V1IngressClassList());
  }
  
  public V1IngressClassListBuilder(V1IngressClassListFluent<?> fluent) {
    this(fluent, new V1IngressClassList());
  }
  
  public V1IngressClassListBuilder(V1IngressClassListFluent<?> fluent,V1IngressClassList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1IngressClassListBuilder(V1IngressClassList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1IngressClassListFluent<?> fluent;
  
  public V1IngressClassList build() {
    V1IngressClassList buildable = new V1IngressClassList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}