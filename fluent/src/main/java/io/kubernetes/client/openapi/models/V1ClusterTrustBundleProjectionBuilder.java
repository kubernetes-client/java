package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ClusterTrustBundleProjectionBuilder extends V1ClusterTrustBundleProjectionFluent<V1ClusterTrustBundleProjectionBuilder> implements VisitableBuilder<V1ClusterTrustBundleProjection,V1ClusterTrustBundleProjectionBuilder>{
  public V1ClusterTrustBundleProjectionBuilder() {
    this(new V1ClusterTrustBundleProjection());
  }
  
  public V1ClusterTrustBundleProjectionBuilder(V1ClusterTrustBundleProjectionFluent<?> fluent) {
    this(fluent, new V1ClusterTrustBundleProjection());
  }
  
  public V1ClusterTrustBundleProjectionBuilder(V1ClusterTrustBundleProjectionFluent<?> fluent,V1ClusterTrustBundleProjection instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ClusterTrustBundleProjectionBuilder(V1ClusterTrustBundleProjection instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ClusterTrustBundleProjectionFluent<?> fluent;
  
  public V1ClusterTrustBundleProjection build() {
    V1ClusterTrustBundleProjection buildable = new V1ClusterTrustBundleProjection();
    buildable.setLabelSelector(fluent.buildLabelSelector());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    buildable.setPath(fluent.getPath());
    buildable.setSignerName(fluent.getSignerName());
    return buildable;
  }
  

}