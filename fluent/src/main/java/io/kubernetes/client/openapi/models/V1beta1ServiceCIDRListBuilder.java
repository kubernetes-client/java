package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ServiceCIDRListBuilder extends V1beta1ServiceCIDRListFluent<V1beta1ServiceCIDRListBuilder> implements VisitableBuilder<V1beta1ServiceCIDRList,V1beta1ServiceCIDRListBuilder>{
  public V1beta1ServiceCIDRListBuilder() {
    this(new V1beta1ServiceCIDRList());
  }
  
  public V1beta1ServiceCIDRListBuilder(V1beta1ServiceCIDRListFluent<?> fluent) {
    this(fluent, new V1beta1ServiceCIDRList());
  }
  
  public V1beta1ServiceCIDRListBuilder(V1beta1ServiceCIDRListFluent<?> fluent,V1beta1ServiceCIDRList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ServiceCIDRListBuilder(V1beta1ServiceCIDRList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ServiceCIDRListFluent<?> fluent;
  
  public V1beta1ServiceCIDRList build() {
    V1beta1ServiceCIDRList buildable = new V1beta1ServiceCIDRList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}