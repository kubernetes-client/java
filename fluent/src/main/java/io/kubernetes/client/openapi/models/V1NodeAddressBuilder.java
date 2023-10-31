package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NodeAddressBuilder extends V1NodeAddressFluent<V1NodeAddressBuilder> implements VisitableBuilder<V1NodeAddress,V1NodeAddressBuilder>{
  public V1NodeAddressBuilder() {
    this(new V1NodeAddress());
  }
  
  public V1NodeAddressBuilder(V1NodeAddressFluent<?> fluent) {
    this(fluent, new V1NodeAddress());
  }
  
  public V1NodeAddressBuilder(V1NodeAddressFluent<?> fluent,V1NodeAddress instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NodeAddressBuilder(V1NodeAddress instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NodeAddressFluent<?> fluent;
  
  public V1NodeAddress build() {
    V1NodeAddress buildable = new V1NodeAddress();
    buildable.setAddress(fluent.getAddress());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}