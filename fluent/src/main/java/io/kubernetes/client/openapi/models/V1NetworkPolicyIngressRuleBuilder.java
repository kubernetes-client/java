package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NetworkPolicyIngressRuleBuilder extends V1NetworkPolicyIngressRuleFluentImpl<V1NetworkPolicyIngressRuleBuilder> implements VisitableBuilder<V1NetworkPolicyIngressRule,V1NetworkPolicyIngressRuleBuilder>{
  public V1NetworkPolicyIngressRuleBuilder() {
    this(false);
  }
  public V1NetworkPolicyIngressRuleBuilder(Boolean validationEnabled) {
    this(new V1NetworkPolicyIngressRule(), validationEnabled);
  }
  public V1NetworkPolicyIngressRuleBuilder(V1NetworkPolicyIngressRuleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NetworkPolicyIngressRuleBuilder(V1NetworkPolicyIngressRuleFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NetworkPolicyIngressRule(), validationEnabled);
  }
  public V1NetworkPolicyIngressRuleBuilder(V1NetworkPolicyIngressRuleFluent<?> fluent,V1NetworkPolicyIngressRule instance) {
    this(fluent, instance, false);
  }
  public V1NetworkPolicyIngressRuleBuilder(V1NetworkPolicyIngressRuleFluent<?> fluent,V1NetworkPolicyIngressRule instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withFrom(instance.getFrom());

    fluent.withPorts(instance.getPorts());

    this.validationEnabled = validationEnabled; 
  }
  public V1NetworkPolicyIngressRuleBuilder(V1NetworkPolicyIngressRule instance) {
    this(instance,false);
  }
  public V1NetworkPolicyIngressRuleBuilder(V1NetworkPolicyIngressRule instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withFrom(instance.getFrom());

    this.withPorts(instance.getPorts());

    this.validationEnabled = validationEnabled; 
  }
  V1NetworkPolicyIngressRuleFluent<?> fluent;
  Boolean validationEnabled;
  public V1NetworkPolicyIngressRule build() {
    V1NetworkPolicyIngressRule buildable = new V1NetworkPolicyIngressRule();
    buildable.setFrom(fluent.getFrom());
    buildable.setPorts(fluent.getPorts());
    return buildable;
  }
  
}