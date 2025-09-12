package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1ServiceCIDRListBuilder extends V1ServiceCIDRListFluent<V1ServiceCIDRListBuilder> implements VisitableBuilder<V1ServiceCIDRList,V1ServiceCIDRListBuilder>{
  public V1ServiceCIDRListBuilder() {
    this(new V1ServiceCIDRList());
  }
  
  public V1ServiceCIDRListBuilder(V1ServiceCIDRListFluent<?> fluent) {
    this(fluent, new V1ServiceCIDRList());
  }
  
  public V1ServiceCIDRListBuilder(V1ServiceCIDRListFluent<?> fluent,V1ServiceCIDRList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ServiceCIDRListBuilder(V1ServiceCIDRList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ServiceCIDRListFluent<?> fluent;
  
  public V1ServiceCIDRList build() {
    V1ServiceCIDRList buildable = new V1ServiceCIDRList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}