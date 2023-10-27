package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ServerAddressByClientCIDRBuilder extends V1ServerAddressByClientCIDRFluent<V1ServerAddressByClientCIDRBuilder> implements VisitableBuilder<V1ServerAddressByClientCIDR,V1ServerAddressByClientCIDRBuilder>{
  public V1ServerAddressByClientCIDRBuilder() {
    this(new V1ServerAddressByClientCIDR());
  }
  
  public V1ServerAddressByClientCIDRBuilder(V1ServerAddressByClientCIDRFluent<?> fluent) {
    this(fluent, new V1ServerAddressByClientCIDR());
  }
  
  public V1ServerAddressByClientCIDRBuilder(V1ServerAddressByClientCIDRFluent<?> fluent,V1ServerAddressByClientCIDR instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ServerAddressByClientCIDRBuilder(V1ServerAddressByClientCIDR instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ServerAddressByClientCIDRFluent<?> fluent;
  
  public V1ServerAddressByClientCIDR build() {
    V1ServerAddressByClientCIDR buildable = new V1ServerAddressByClientCIDR();
    buildable.setClientCIDR(fluent.getClientCIDR());
    buildable.setServerAddress(fluent.getServerAddress());
    return buildable;
  }
  

}