package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1IPAddressBuilder extends V1alpha1IPAddressFluent<V1alpha1IPAddressBuilder> implements VisitableBuilder<V1alpha1IPAddress,V1alpha1IPAddressBuilder>{
  public V1alpha1IPAddressBuilder() {
    this(new V1alpha1IPAddress());
  }
  
  public V1alpha1IPAddressBuilder(V1alpha1IPAddressFluent<?> fluent) {
    this(fluent, new V1alpha1IPAddress());
  }
  
  public V1alpha1IPAddressBuilder(V1alpha1IPAddressFluent<?> fluent,V1alpha1IPAddress instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1IPAddressBuilder(V1alpha1IPAddress instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1IPAddressFluent<?> fluent;
  
  public V1alpha1IPAddress build() {
    V1alpha1IPAddress buildable = new V1alpha1IPAddress();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}