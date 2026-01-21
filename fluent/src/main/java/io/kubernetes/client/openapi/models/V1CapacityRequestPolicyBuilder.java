package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1CapacityRequestPolicyBuilder extends V1CapacityRequestPolicyFluent<V1CapacityRequestPolicyBuilder> implements VisitableBuilder<V1CapacityRequestPolicy,V1CapacityRequestPolicyBuilder>{

  V1CapacityRequestPolicyFluent<?> fluent;

  public V1CapacityRequestPolicyBuilder() {
    this(new V1CapacityRequestPolicy());
  }
  
  public V1CapacityRequestPolicyBuilder(V1CapacityRequestPolicyFluent<?> fluent) {
    this(fluent, new V1CapacityRequestPolicy());
  }
  
  public V1CapacityRequestPolicyBuilder(V1CapacityRequestPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CapacityRequestPolicyBuilder(V1CapacityRequestPolicyFluent<?> fluent,V1CapacityRequestPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CapacityRequestPolicy build() {
    V1CapacityRequestPolicy buildable = new V1CapacityRequestPolicy();
    buildable.setDefault(fluent.getDefault());
    buildable.setValidRange(fluent.buildValidRange());
    buildable.setValidValues(fluent.getValidValues());
    return buildable;
  }
  
}