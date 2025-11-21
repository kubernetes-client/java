package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1CapacityRequestPolicyBuilder extends V1beta1CapacityRequestPolicyFluent<V1beta1CapacityRequestPolicyBuilder> implements VisitableBuilder<V1beta1CapacityRequestPolicy,V1beta1CapacityRequestPolicyBuilder>{

  V1beta1CapacityRequestPolicyFluent<?> fluent;

  public V1beta1CapacityRequestPolicyBuilder() {
    this(new V1beta1CapacityRequestPolicy());
  }
  
  public V1beta1CapacityRequestPolicyBuilder(V1beta1CapacityRequestPolicyFluent<?> fluent) {
    this(fluent, new V1beta1CapacityRequestPolicy());
  }
  
  public V1beta1CapacityRequestPolicyBuilder(V1beta1CapacityRequestPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1CapacityRequestPolicyBuilder(V1beta1CapacityRequestPolicyFluent<?> fluent,V1beta1CapacityRequestPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1CapacityRequestPolicy build() {
    V1beta1CapacityRequestPolicy buildable = new V1beta1CapacityRequestPolicy();
    buildable.setDefault(fluent.getDefault());
    buildable.setValidRange(fluent.buildValidRange());
    buildable.setValidValues(fluent.getValidValues());
    return buildable;
  }
  
}