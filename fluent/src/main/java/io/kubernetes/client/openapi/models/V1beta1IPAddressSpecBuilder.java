package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1IPAddressSpecBuilder extends V1beta1IPAddressSpecFluent<V1beta1IPAddressSpecBuilder> implements VisitableBuilder<V1beta1IPAddressSpec,V1beta1IPAddressSpecBuilder>{
  public V1beta1IPAddressSpecBuilder() {
    this(new V1beta1IPAddressSpec());
  }
  
  public V1beta1IPAddressSpecBuilder(V1beta1IPAddressSpecFluent<?> fluent) {
    this(fluent, new V1beta1IPAddressSpec());
  }
  
  public V1beta1IPAddressSpecBuilder(V1beta1IPAddressSpecFluent<?> fluent,V1beta1IPAddressSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1IPAddressSpecBuilder(V1beta1IPAddressSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1IPAddressSpecFluent<?> fluent;
  
  public V1beta1IPAddressSpec build() {
    V1beta1IPAddressSpec buildable = new V1beta1IPAddressSpec();
    buildable.setParentRef(fluent.buildParentRef());
    return buildable;
  }
  

}