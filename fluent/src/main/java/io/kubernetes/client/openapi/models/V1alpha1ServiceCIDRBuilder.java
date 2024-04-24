package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ServiceCIDRBuilder extends V1alpha1ServiceCIDRFluent<V1alpha1ServiceCIDRBuilder> implements VisitableBuilder<V1alpha1ServiceCIDR,V1alpha1ServiceCIDRBuilder>{
  public V1alpha1ServiceCIDRBuilder() {
    this(new V1alpha1ServiceCIDR());
  }
  
  public V1alpha1ServiceCIDRBuilder(V1alpha1ServiceCIDRFluent<?> fluent) {
    this(fluent, new V1alpha1ServiceCIDR());
  }
  
  public V1alpha1ServiceCIDRBuilder(V1alpha1ServiceCIDRFluent<?> fluent,V1alpha1ServiceCIDR instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ServiceCIDRBuilder(V1alpha1ServiceCIDR instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ServiceCIDRFluent<?> fluent;
  
  public V1alpha1ServiceCIDR build() {
    V1alpha1ServiceCIDR buildable = new V1alpha1ServiceCIDR();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}