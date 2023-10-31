package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1StatefulSetListBuilder extends V1StatefulSetListFluent<V1StatefulSetListBuilder> implements VisitableBuilder<V1StatefulSetList,V1StatefulSetListBuilder>{
  public V1StatefulSetListBuilder() {
    this(new V1StatefulSetList());
  }
  
  public V1StatefulSetListBuilder(V1StatefulSetListFluent<?> fluent) {
    this(fluent, new V1StatefulSetList());
  }
  
  public V1StatefulSetListBuilder(V1StatefulSetListFluent<?> fluent,V1StatefulSetList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1StatefulSetListBuilder(V1StatefulSetList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1StatefulSetListFluent<?> fluent;
  
  public V1StatefulSetList build() {
    V1StatefulSetList buildable = new V1StatefulSetList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}