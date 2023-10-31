package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ServiceAccountTokenProjectionBuilder extends V1ServiceAccountTokenProjectionFluent<V1ServiceAccountTokenProjectionBuilder> implements VisitableBuilder<V1ServiceAccountTokenProjection,V1ServiceAccountTokenProjectionBuilder>{
  public V1ServiceAccountTokenProjectionBuilder() {
    this(new V1ServiceAccountTokenProjection());
  }
  
  public V1ServiceAccountTokenProjectionBuilder(V1ServiceAccountTokenProjectionFluent<?> fluent) {
    this(fluent, new V1ServiceAccountTokenProjection());
  }
  
  public V1ServiceAccountTokenProjectionBuilder(V1ServiceAccountTokenProjectionFluent<?> fluent,V1ServiceAccountTokenProjection instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ServiceAccountTokenProjectionBuilder(V1ServiceAccountTokenProjection instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ServiceAccountTokenProjectionFluent<?> fluent;
  
  public V1ServiceAccountTokenProjection build() {
    V1ServiceAccountTokenProjection buildable = new V1ServiceAccountTokenProjection();
    buildable.setAudience(fluent.getAudience());
    buildable.setExpirationSeconds(fluent.getExpirationSeconds());
    buildable.setPath(fluent.getPath());
    return buildable;
  }
  

}