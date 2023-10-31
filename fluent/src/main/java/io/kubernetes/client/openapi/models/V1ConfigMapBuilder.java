package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ConfigMapBuilder extends V1ConfigMapFluent<V1ConfigMapBuilder> implements VisitableBuilder<V1ConfigMap,V1ConfigMapBuilder>{
  public V1ConfigMapBuilder() {
    this(new V1ConfigMap());
  }
  
  public V1ConfigMapBuilder(V1ConfigMapFluent<?> fluent) {
    this(fluent, new V1ConfigMap());
  }
  
  public V1ConfigMapBuilder(V1ConfigMapFluent<?> fluent,V1ConfigMap instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ConfigMapBuilder(V1ConfigMap instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ConfigMapFluent<?> fluent;
  
  public V1ConfigMap build() {
    V1ConfigMap buildable = new V1ConfigMap();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setBinaryData(fluent.getBinaryData());
    buildable.setData(fluent.getData());
    buildable.setImmutable(fluent.getImmutable());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}