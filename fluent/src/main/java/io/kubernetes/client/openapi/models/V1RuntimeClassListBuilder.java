package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1RuntimeClassListBuilder extends V1RuntimeClassListFluent<V1RuntimeClassListBuilder> implements VisitableBuilder<V1RuntimeClassList,V1RuntimeClassListBuilder>{
  public V1RuntimeClassListBuilder() {
    this(new V1RuntimeClassList());
  }
  
  public V1RuntimeClassListBuilder(V1RuntimeClassListFluent<?> fluent) {
    this(fluent, new V1RuntimeClassList());
  }
  
  public V1RuntimeClassListBuilder(V1RuntimeClassListFluent<?> fluent,V1RuntimeClassList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1RuntimeClassListBuilder(V1RuntimeClassList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1RuntimeClassListFluent<?> fluent;
  
  public V1RuntimeClassList build() {
    V1RuntimeClassList buildable = new V1RuntimeClassList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}