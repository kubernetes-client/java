package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ClusterTrustBundleListBuilder extends V1alpha1ClusterTrustBundleListFluent<V1alpha1ClusterTrustBundleListBuilder> implements VisitableBuilder<V1alpha1ClusterTrustBundleList,V1alpha1ClusterTrustBundleListBuilder>{
  public V1alpha1ClusterTrustBundleListBuilder() {
    this(new V1alpha1ClusterTrustBundleList());
  }
  
  public V1alpha1ClusterTrustBundleListBuilder(V1alpha1ClusterTrustBundleListFluent<?> fluent) {
    this(fluent, new V1alpha1ClusterTrustBundleList());
  }
  
  public V1alpha1ClusterTrustBundleListBuilder(V1alpha1ClusterTrustBundleListFluent<?> fluent,V1alpha1ClusterTrustBundleList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ClusterTrustBundleListBuilder(V1alpha1ClusterTrustBundleList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ClusterTrustBundleListFluent<?> fluent;
  
  public V1alpha1ClusterTrustBundleList build() {
    V1alpha1ClusterTrustBundleList buildable = new V1alpha1ClusterTrustBundleList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}