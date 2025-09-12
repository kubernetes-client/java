package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1ServiceCIDRBuilder extends V1ServiceCIDRFluent<V1ServiceCIDRBuilder> implements VisitableBuilder<V1ServiceCIDR,V1ServiceCIDRBuilder>{
  public V1ServiceCIDRBuilder() {
    this(new V1ServiceCIDR());
  }
  
  public V1ServiceCIDRBuilder(V1ServiceCIDRFluent<?> fluent) {
    this(fluent, new V1ServiceCIDR());
  }
  
  public V1ServiceCIDRBuilder(V1ServiceCIDRFluent<?> fluent,V1ServiceCIDR instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ServiceCIDRBuilder(V1ServiceCIDR instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ServiceCIDRFluent<?> fluent;
  
  public V1ServiceCIDR build() {
    V1ServiceCIDR buildable = new V1ServiceCIDR();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}