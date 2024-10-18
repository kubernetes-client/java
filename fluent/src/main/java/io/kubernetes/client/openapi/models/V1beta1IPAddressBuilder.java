package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1IPAddressBuilder extends V1beta1IPAddressFluent<V1beta1IPAddressBuilder> implements VisitableBuilder<V1beta1IPAddress,V1beta1IPAddressBuilder>{
  public V1beta1IPAddressBuilder() {
    this(new V1beta1IPAddress());
  }
  
  public V1beta1IPAddressBuilder(V1beta1IPAddressFluent<?> fluent) {
    this(fluent, new V1beta1IPAddress());
  }
  
  public V1beta1IPAddressBuilder(V1beta1IPAddressFluent<?> fluent,V1beta1IPAddress instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1IPAddressBuilder(V1beta1IPAddress instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1IPAddressFluent<?> fluent;
  
  public V1beta1IPAddress build() {
    V1beta1IPAddress buildable = new V1beta1IPAddress();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}