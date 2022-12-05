package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ServerAddressByClientCIDRBuilder extends V1ServerAddressByClientCIDRFluentImpl<V1ServerAddressByClientCIDRBuilder> implements VisitableBuilder<V1ServerAddressByClientCIDR,V1ServerAddressByClientCIDRBuilder>{
  public V1ServerAddressByClientCIDRBuilder() {
    this(false);
  }
  public V1ServerAddressByClientCIDRBuilder(Boolean validationEnabled) {
    this(new V1ServerAddressByClientCIDR(), validationEnabled);
  }
  public V1ServerAddressByClientCIDRBuilder(V1ServerAddressByClientCIDRFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ServerAddressByClientCIDRBuilder(V1ServerAddressByClientCIDRFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ServerAddressByClientCIDR(), validationEnabled);
  }
  public V1ServerAddressByClientCIDRBuilder(V1ServerAddressByClientCIDRFluent<?> fluent,V1ServerAddressByClientCIDR instance) {
    this(fluent, instance, false);
  }
  public V1ServerAddressByClientCIDRBuilder(V1ServerAddressByClientCIDRFluent<?> fluent,V1ServerAddressByClientCIDR instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withClientCIDR(instance.getClientCIDR());

    fluent.withServerAddress(instance.getServerAddress());

    this.validationEnabled = validationEnabled; 
  }
  public V1ServerAddressByClientCIDRBuilder(V1ServerAddressByClientCIDR instance) {
    this(instance,false);
  }
  public V1ServerAddressByClientCIDRBuilder(V1ServerAddressByClientCIDR instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withClientCIDR(instance.getClientCIDR());

    this.withServerAddress(instance.getServerAddress());

    this.validationEnabled = validationEnabled; 
  }
  V1ServerAddressByClientCIDRFluent<?> fluent;
  Boolean validationEnabled;
  public V1ServerAddressByClientCIDR build() {
    V1ServerAddressByClientCIDR buildable = new V1ServerAddressByClientCIDR();
    buildable.setClientCIDR(fluent.getClientCIDR());
    buildable.setServerAddress(fluent.getServerAddress());
    return buildable;
  }
  
}