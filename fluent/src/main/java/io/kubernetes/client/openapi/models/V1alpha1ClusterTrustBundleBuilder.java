package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ClusterTrustBundleBuilder extends V1alpha1ClusterTrustBundleFluent<V1alpha1ClusterTrustBundleBuilder> implements VisitableBuilder<V1alpha1ClusterTrustBundle,V1alpha1ClusterTrustBundleBuilder>{
  public V1alpha1ClusterTrustBundleBuilder() {
    this(new V1alpha1ClusterTrustBundle());
  }
  
  public V1alpha1ClusterTrustBundleBuilder(V1alpha1ClusterTrustBundleFluent<?> fluent) {
    this(fluent, new V1alpha1ClusterTrustBundle());
  }
  
  public V1alpha1ClusterTrustBundleBuilder(V1alpha1ClusterTrustBundleFluent<?> fluent,V1alpha1ClusterTrustBundle instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ClusterTrustBundleBuilder(V1alpha1ClusterTrustBundle instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ClusterTrustBundleFluent<?> fluent;
  
  public V1alpha1ClusterTrustBundle build() {
    V1alpha1ClusterTrustBundle buildable = new V1alpha1ClusterTrustBundle();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}