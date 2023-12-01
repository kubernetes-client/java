package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ClusterTrustBundleSpecBuilder extends V1alpha1ClusterTrustBundleSpecFluent<V1alpha1ClusterTrustBundleSpecBuilder> implements VisitableBuilder<V1alpha1ClusterTrustBundleSpec,V1alpha1ClusterTrustBundleSpecBuilder>{
  public V1alpha1ClusterTrustBundleSpecBuilder() {
    this(new V1alpha1ClusterTrustBundleSpec());
  }
  
  public V1alpha1ClusterTrustBundleSpecBuilder(V1alpha1ClusterTrustBundleSpecFluent<?> fluent) {
    this(fluent, new V1alpha1ClusterTrustBundleSpec());
  }
  
  public V1alpha1ClusterTrustBundleSpecBuilder(V1alpha1ClusterTrustBundleSpecFluent<?> fluent,V1alpha1ClusterTrustBundleSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ClusterTrustBundleSpecBuilder(V1alpha1ClusterTrustBundleSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ClusterTrustBundleSpecFluent<?> fluent;
  
  public V1alpha1ClusterTrustBundleSpec build() {
    V1alpha1ClusterTrustBundleSpec buildable = new V1alpha1ClusterTrustBundleSpec();
    buildable.setSignerName(fluent.getSignerName());
    buildable.setTrustBundle(fluent.getTrustBundle());
    return buildable;
  }
  

}