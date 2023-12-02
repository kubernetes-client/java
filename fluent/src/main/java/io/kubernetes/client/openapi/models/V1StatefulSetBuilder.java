package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1StatefulSetBuilder extends V1StatefulSetFluent<V1StatefulSetBuilder> implements VisitableBuilder<V1StatefulSet,V1StatefulSetBuilder>{
  public V1StatefulSetBuilder() {
    this(new V1StatefulSet());
  }
  
  public V1StatefulSetBuilder(V1StatefulSetFluent<?> fluent) {
    this(fluent, new V1StatefulSet());
  }
  
  public V1StatefulSetBuilder(V1StatefulSetFluent<?> fluent,V1StatefulSet instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1StatefulSetBuilder(V1StatefulSet instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1StatefulSetFluent<?> fluent;
  
  public V1StatefulSet build() {
    V1StatefulSet buildable = new V1StatefulSet();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}