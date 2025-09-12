package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2CapacityRequestPolicyBuilder extends V1beta2CapacityRequestPolicyFluent<V1beta2CapacityRequestPolicyBuilder> implements VisitableBuilder<V1beta2CapacityRequestPolicy,V1beta2CapacityRequestPolicyBuilder>{
  public V1beta2CapacityRequestPolicyBuilder() {
    this(new V1beta2CapacityRequestPolicy());
  }
  
  public V1beta2CapacityRequestPolicyBuilder(V1beta2CapacityRequestPolicyFluent<?> fluent) {
    this(fluent, new V1beta2CapacityRequestPolicy());
  }
  
  public V1beta2CapacityRequestPolicyBuilder(V1beta2CapacityRequestPolicyFluent<?> fluent,V1beta2CapacityRequestPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2CapacityRequestPolicyBuilder(V1beta2CapacityRequestPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2CapacityRequestPolicyFluent<?> fluent;
  
  public V1beta2CapacityRequestPolicy build() {
    V1beta2CapacityRequestPolicy buildable = new V1beta2CapacityRequestPolicy();
    buildable.setDefault(fluent.getDefault());
    buildable.setValidRange(fluent.buildValidRange());
    buildable.setValidValues(fluent.getValidValues());
    return buildable;
  }
  

}