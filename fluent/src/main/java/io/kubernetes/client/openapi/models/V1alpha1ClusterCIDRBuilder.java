package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ClusterCIDRBuilder extends V1alpha1ClusterCIDRFluent<V1alpha1ClusterCIDRBuilder> implements VisitableBuilder<V1alpha1ClusterCIDR,V1alpha1ClusterCIDRBuilder>{
  public V1alpha1ClusterCIDRBuilder() {
    this(new V1alpha1ClusterCIDR());
  }
  
  public V1alpha1ClusterCIDRBuilder(V1alpha1ClusterCIDRFluent<?> fluent) {
    this(fluent, new V1alpha1ClusterCIDR());
  }
  
  public V1alpha1ClusterCIDRBuilder(V1alpha1ClusterCIDRFluent<?> fluent,V1alpha1ClusterCIDR instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ClusterCIDRBuilder(V1alpha1ClusterCIDR instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ClusterCIDRFluent<?> fluent;
  
  public V1alpha1ClusterCIDR build() {
    V1alpha1ClusterCIDR buildable = new V1alpha1ClusterCIDR();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}