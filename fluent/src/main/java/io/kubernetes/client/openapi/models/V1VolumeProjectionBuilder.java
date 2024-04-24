package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1VolumeProjectionBuilder extends V1VolumeProjectionFluent<V1VolumeProjectionBuilder> implements VisitableBuilder<V1VolumeProjection,V1VolumeProjectionBuilder>{
  public V1VolumeProjectionBuilder() {
    this(new V1VolumeProjection());
  }
  
  public V1VolumeProjectionBuilder(V1VolumeProjectionFluent<?> fluent) {
    this(fluent, new V1VolumeProjection());
  }
  
  public V1VolumeProjectionBuilder(V1VolumeProjectionFluent<?> fluent,V1VolumeProjection instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1VolumeProjectionBuilder(V1VolumeProjection instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1VolumeProjectionFluent<?> fluent;
  
  public V1VolumeProjection build() {
    V1VolumeProjection buildable = new V1VolumeProjection();
    buildable.setClusterTrustBundle(fluent.buildClusterTrustBundle());
    buildable.setConfigMap(fluent.buildConfigMap());
    buildable.setDownwardAPI(fluent.buildDownwardAPI());
    buildable.setSecret(fluent.buildSecret());
    buildable.setServiceAccountToken(fluent.buildServiceAccountToken());
    return buildable;
  }
  

}