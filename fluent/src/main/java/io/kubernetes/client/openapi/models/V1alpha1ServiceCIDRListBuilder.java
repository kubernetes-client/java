package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ServiceCIDRListBuilder extends V1alpha1ServiceCIDRListFluent<V1alpha1ServiceCIDRListBuilder> implements VisitableBuilder<V1alpha1ServiceCIDRList,V1alpha1ServiceCIDRListBuilder>{
  public V1alpha1ServiceCIDRListBuilder() {
    this(new V1alpha1ServiceCIDRList());
  }
  
  public V1alpha1ServiceCIDRListBuilder(V1alpha1ServiceCIDRListFluent<?> fluent) {
    this(fluent, new V1alpha1ServiceCIDRList());
  }
  
  public V1alpha1ServiceCIDRListBuilder(V1alpha1ServiceCIDRListFluent<?> fluent,V1alpha1ServiceCIDRList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ServiceCIDRListBuilder(V1alpha1ServiceCIDRList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ServiceCIDRListFluent<?> fluent;
  
  public V1alpha1ServiceCIDRList build() {
    V1alpha1ServiceCIDRList buildable = new V1alpha1ServiceCIDRList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}