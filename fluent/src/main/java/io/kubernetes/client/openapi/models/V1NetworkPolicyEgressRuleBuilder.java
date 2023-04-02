package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NetworkPolicyEgressRuleBuilder extends V1NetworkPolicyEgressRuleFluentImpl<V1NetworkPolicyEgressRuleBuilder> implements VisitableBuilder<V1NetworkPolicyEgressRule,V1NetworkPolicyEgressRuleBuilder>{
  public V1NetworkPolicyEgressRuleBuilder() {
    this(false);
  }
  public V1NetworkPolicyEgressRuleBuilder(Boolean validationEnabled) {
    this(new V1NetworkPolicyEgressRule(), validationEnabled);
  }
  public V1NetworkPolicyEgressRuleBuilder(V1NetworkPolicyEgressRuleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NetworkPolicyEgressRuleBuilder(V1NetworkPolicyEgressRuleFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NetworkPolicyEgressRule(), validationEnabled);
  }
  public V1NetworkPolicyEgressRuleBuilder(V1NetworkPolicyEgressRuleFluent<?> fluent,V1NetworkPolicyEgressRule instance) {
    this(fluent, instance, false);
  }
  public V1NetworkPolicyEgressRuleBuilder(V1NetworkPolicyEgressRuleFluent<?> fluent,V1NetworkPolicyEgressRule instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withPorts(instance.getPorts());

    fluent.withTo(instance.getTo());

    this.validationEnabled = validationEnabled; 
  }
  public V1NetworkPolicyEgressRuleBuilder(V1NetworkPolicyEgressRule instance) {
    this(instance,false);
  }
  public V1NetworkPolicyEgressRuleBuilder(V1NetworkPolicyEgressRule instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withPorts(instance.getPorts());

    this.withTo(instance.getTo());

    this.validationEnabled = validationEnabled; 
  }
  V1NetworkPolicyEgressRuleFluent<?> fluent;
  Boolean validationEnabled;
  public V1NetworkPolicyEgressRule build() {
    V1NetworkPolicyEgressRule buildable = new V1NetworkPolicyEgressRule();
    buildable.setPorts(fluent.getPorts());
    buildable.setTo(fluent.getTo());
    return buildable;
  }
  
}