package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NetworkPolicySpecBuilder extends V1NetworkPolicySpecFluent<V1NetworkPolicySpecBuilder> implements VisitableBuilder<V1NetworkPolicySpec,V1NetworkPolicySpecBuilder>{
  public V1NetworkPolicySpecBuilder() {
    this(new V1NetworkPolicySpec());
  }
  
  public V1NetworkPolicySpecBuilder(V1NetworkPolicySpecFluent<?> fluent) {
    this(fluent, new V1NetworkPolicySpec());
  }
  
  public V1NetworkPolicySpecBuilder(V1NetworkPolicySpecFluent<?> fluent,V1NetworkPolicySpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NetworkPolicySpecBuilder(V1NetworkPolicySpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NetworkPolicySpecFluent<?> fluent;
  
  public V1NetworkPolicySpec build() {
    V1NetworkPolicySpec buildable = new V1NetworkPolicySpec();
    buildable.setEgress(fluent.buildEgress());
    buildable.setIngress(fluent.buildIngress());
    buildable.setPodSelector(fluent.buildPodSelector());
    buildable.setPolicyTypes(fluent.getPolicyTypes());
    return buildable;
  }
  

}