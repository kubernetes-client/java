package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1DownwardAPIProjectionBuilder extends V1DownwardAPIProjectionFluent<V1DownwardAPIProjectionBuilder> implements VisitableBuilder<V1DownwardAPIProjection,V1DownwardAPIProjectionBuilder>{
  public V1DownwardAPIProjectionBuilder() {
    this(new V1DownwardAPIProjection());
  }
  
  public V1DownwardAPIProjectionBuilder(V1DownwardAPIProjectionFluent<?> fluent) {
    this(fluent, new V1DownwardAPIProjection());
  }
  
  public V1DownwardAPIProjectionBuilder(V1DownwardAPIProjectionFluent<?> fluent,V1DownwardAPIProjection instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DownwardAPIProjectionBuilder(V1DownwardAPIProjection instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DownwardAPIProjectionFluent<?> fluent;
  
  public V1DownwardAPIProjection build() {
    V1DownwardAPIProjection buildable = new V1DownwardAPIProjection();
    buildable.setItems(fluent.buildItems());
    return buildable;
  }
  

}