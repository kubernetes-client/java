package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ServiceCIDRBuilder extends V1beta1ServiceCIDRFluent<V1beta1ServiceCIDRBuilder> implements VisitableBuilder<V1beta1ServiceCIDR,V1beta1ServiceCIDRBuilder>{
  public V1beta1ServiceCIDRBuilder() {
    this(new V1beta1ServiceCIDR());
  }
  
  public V1beta1ServiceCIDRBuilder(V1beta1ServiceCIDRFluent<?> fluent) {
    this(fluent, new V1beta1ServiceCIDR());
  }
  
  public V1beta1ServiceCIDRBuilder(V1beta1ServiceCIDRFluent<?> fluent,V1beta1ServiceCIDR instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ServiceCIDRBuilder(V1beta1ServiceCIDR instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ServiceCIDRFluent<?> fluent;
  
  public V1beta1ServiceCIDR build() {
    V1beta1ServiceCIDR buildable = new V1beta1ServiceCIDR();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}