package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1IPAddressSpecBuilder extends V1IPAddressSpecFluent<V1IPAddressSpecBuilder> implements VisitableBuilder<V1IPAddressSpec,V1IPAddressSpecBuilder>{

  V1IPAddressSpecFluent<?> fluent;

  public V1IPAddressSpecBuilder() {
    this(new V1IPAddressSpec());
  }
  
  public V1IPAddressSpecBuilder(V1IPAddressSpecFluent<?> fluent) {
    this(fluent, new V1IPAddressSpec());
  }
  
  public V1IPAddressSpecBuilder(V1IPAddressSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1IPAddressSpecBuilder(V1IPAddressSpecFluent<?> fluent,V1IPAddressSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1IPAddressSpec build() {
    V1IPAddressSpec buildable = new V1IPAddressSpec();
    buildable.setParentRef(fluent.buildParentRef());
    return buildable;
  }
  
}