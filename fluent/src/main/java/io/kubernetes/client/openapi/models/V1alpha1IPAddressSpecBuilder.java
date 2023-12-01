package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1IPAddressSpecBuilder extends V1alpha1IPAddressSpecFluent<V1alpha1IPAddressSpecBuilder> implements VisitableBuilder<V1alpha1IPAddressSpec,V1alpha1IPAddressSpecBuilder>{
  public V1alpha1IPAddressSpecBuilder() {
    this(new V1alpha1IPAddressSpec());
  }
  
  public V1alpha1IPAddressSpecBuilder(V1alpha1IPAddressSpecFluent<?> fluent) {
    this(fluent, new V1alpha1IPAddressSpec());
  }
  
  public V1alpha1IPAddressSpecBuilder(V1alpha1IPAddressSpecFluent<?> fluent,V1alpha1IPAddressSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1IPAddressSpecBuilder(V1alpha1IPAddressSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1IPAddressSpecFluent<?> fluent;
  
  public V1alpha1IPAddressSpec build() {
    V1alpha1IPAddressSpec buildable = new V1alpha1IPAddressSpec();
    buildable.setParentRef(fluent.buildParentRef());
    return buildable;
  }
  

}