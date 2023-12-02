package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceClassListBuilder extends V1alpha2ResourceClassListFluent<V1alpha2ResourceClassListBuilder> implements VisitableBuilder<V1alpha2ResourceClassList,V1alpha2ResourceClassListBuilder>{
  public V1alpha2ResourceClassListBuilder() {
    this(new V1alpha2ResourceClassList());
  }
  
  public V1alpha2ResourceClassListBuilder(V1alpha2ResourceClassListFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceClassList());
  }
  
  public V1alpha2ResourceClassListBuilder(V1alpha2ResourceClassListFluent<?> fluent,V1alpha2ResourceClassList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceClassListBuilder(V1alpha2ResourceClassList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceClassListFluent<?> fluent;
  
  public V1alpha2ResourceClassList build() {
    V1alpha2ResourceClassList buildable = new V1alpha2ResourceClassList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}