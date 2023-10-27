package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ListMetaBuilder extends V1ListMetaFluent<V1ListMetaBuilder> implements VisitableBuilder<V1ListMeta,V1ListMetaBuilder>{
  public V1ListMetaBuilder() {
    this(new V1ListMeta());
  }
  
  public V1ListMetaBuilder(V1ListMetaFluent<?> fluent) {
    this(fluent, new V1ListMeta());
  }
  
  public V1ListMetaBuilder(V1ListMetaFluent<?> fluent,V1ListMeta instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ListMetaBuilder(V1ListMeta instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ListMetaFluent<?> fluent;
  
  public V1ListMeta build() {
    V1ListMeta buildable = new V1ListMeta();
    buildable.setContinue(fluent.getContinue());
    buildable.setRemainingItemCount(fluent.getRemainingItemCount());
    buildable.setResourceVersion(fluent.getResourceVersion());
    buildable.setSelfLink(fluent.getSelfLink());
    return buildable;
  }
  

}