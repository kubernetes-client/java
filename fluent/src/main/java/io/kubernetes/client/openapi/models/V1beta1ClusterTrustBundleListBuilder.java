package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1ClusterTrustBundleListBuilder extends V1beta1ClusterTrustBundleListFluent<V1beta1ClusterTrustBundleListBuilder> implements VisitableBuilder<V1beta1ClusterTrustBundleList,V1beta1ClusterTrustBundleListBuilder>{
  public V1beta1ClusterTrustBundleListBuilder() {
    this(new V1beta1ClusterTrustBundleList());
  }
  
  public V1beta1ClusterTrustBundleListBuilder(V1beta1ClusterTrustBundleListFluent<?> fluent) {
    this(fluent, new V1beta1ClusterTrustBundleList());
  }
  
  public V1beta1ClusterTrustBundleListBuilder(V1beta1ClusterTrustBundleListFluent<?> fluent,V1beta1ClusterTrustBundleList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ClusterTrustBundleListBuilder(V1beta1ClusterTrustBundleList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ClusterTrustBundleListFluent<?> fluent;
  
  public V1beta1ClusterTrustBundleList build() {
    V1beta1ClusterTrustBundleList buildable = new V1beta1ClusterTrustBundleList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}