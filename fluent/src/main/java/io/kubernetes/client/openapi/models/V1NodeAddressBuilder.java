package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NodeAddressBuilder extends V1NodeAddressFluentImpl<V1NodeAddressBuilder> implements VisitableBuilder<V1NodeAddress,V1NodeAddressBuilder>{
  public V1NodeAddressBuilder() {
    this(false);
  }
  public V1NodeAddressBuilder(Boolean validationEnabled) {
    this(new V1NodeAddress(), validationEnabled);
  }
  public V1NodeAddressBuilder(V1NodeAddressFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NodeAddressBuilder(V1NodeAddressFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NodeAddress(), validationEnabled);
  }
  public V1NodeAddressBuilder(V1NodeAddressFluent<?> fluent,V1NodeAddress instance) {
    this(fluent, instance, false);
  }
  public V1NodeAddressBuilder(V1NodeAddressFluent<?> fluent,V1NodeAddress instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAddress(instance.getAddress());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1NodeAddressBuilder(V1NodeAddress instance) {
    this(instance,false);
  }
  public V1NodeAddressBuilder(V1NodeAddress instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAddress(instance.getAddress());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1NodeAddressFluent<?> fluent;
  Boolean validationEnabled;
  public V1NodeAddress build() {
    V1NodeAddress buildable = new V1NodeAddress();
    buildable.setAddress(fluent.getAddress());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}