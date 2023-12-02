package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ClusterCIDRListBuilder extends V1alpha1ClusterCIDRListFluent<V1alpha1ClusterCIDRListBuilder> implements VisitableBuilder<V1alpha1ClusterCIDRList,V1alpha1ClusterCIDRListBuilder>{
  public V1alpha1ClusterCIDRListBuilder() {
    this(new V1alpha1ClusterCIDRList());
  }
  
  public V1alpha1ClusterCIDRListBuilder(V1alpha1ClusterCIDRListFluent<?> fluent) {
    this(fluent, new V1alpha1ClusterCIDRList());
  }
  
  public V1alpha1ClusterCIDRListBuilder(V1alpha1ClusterCIDRListFluent<?> fluent,V1alpha1ClusterCIDRList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ClusterCIDRListBuilder(V1alpha1ClusterCIDRList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ClusterCIDRListFluent<?> fluent;
  
  public V1alpha1ClusterCIDRList build() {
    V1alpha1ClusterCIDRList buildable = new V1alpha1ClusterCIDRList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}