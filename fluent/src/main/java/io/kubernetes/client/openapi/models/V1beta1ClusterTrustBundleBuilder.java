package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ClusterTrustBundleBuilder extends V1beta1ClusterTrustBundleFluent<V1beta1ClusterTrustBundleBuilder> implements VisitableBuilder<V1beta1ClusterTrustBundle,V1beta1ClusterTrustBundleBuilder>{
  public V1beta1ClusterTrustBundleBuilder() {
    this(new V1beta1ClusterTrustBundle());
  }
  
  public V1beta1ClusterTrustBundleBuilder(V1beta1ClusterTrustBundleFluent<?> fluent) {
    this(fluent, new V1beta1ClusterTrustBundle());
  }
  
  public V1beta1ClusterTrustBundleBuilder(V1beta1ClusterTrustBundleFluent<?> fluent,V1beta1ClusterTrustBundle instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ClusterTrustBundleBuilder(V1beta1ClusterTrustBundle instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ClusterTrustBundleFluent<?> fluent;
  
  public V1beta1ClusterTrustBundle build() {
    V1beta1ClusterTrustBundle buildable = new V1beta1ClusterTrustBundle();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}