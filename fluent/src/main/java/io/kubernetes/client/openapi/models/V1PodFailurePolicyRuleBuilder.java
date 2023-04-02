package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodFailurePolicyRuleBuilder extends V1PodFailurePolicyRuleFluentImpl<V1PodFailurePolicyRuleBuilder> implements VisitableBuilder<V1PodFailurePolicyRule,V1PodFailurePolicyRuleBuilder>{
  public V1PodFailurePolicyRuleBuilder() {
    this(false);
  }
  public V1PodFailurePolicyRuleBuilder(Boolean validationEnabled) {
    this(new V1PodFailurePolicyRule(), validationEnabled);
  }
  public V1PodFailurePolicyRuleBuilder(V1PodFailurePolicyRuleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodFailurePolicyRuleBuilder(V1PodFailurePolicyRuleFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodFailurePolicyRule(), validationEnabled);
  }
  public V1PodFailurePolicyRuleBuilder(V1PodFailurePolicyRuleFluent<?> fluent,V1PodFailurePolicyRule instance) {
    this(fluent, instance, false);
  }
  public V1PodFailurePolicyRuleBuilder(V1PodFailurePolicyRuleFluent<?> fluent,V1PodFailurePolicyRule instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAction(instance.getAction());

    fluent.withOnExitCodes(instance.getOnExitCodes());

    fluent.withOnPodConditions(instance.getOnPodConditions());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodFailurePolicyRuleBuilder(V1PodFailurePolicyRule instance) {
    this(instance,false);
  }
  public V1PodFailurePolicyRuleBuilder(V1PodFailurePolicyRule instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAction(instance.getAction());

    this.withOnExitCodes(instance.getOnExitCodes());

    this.withOnPodConditions(instance.getOnPodConditions());

    this.validationEnabled = validationEnabled; 
  }
  V1PodFailurePolicyRuleFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodFailurePolicyRule build() {
    V1PodFailurePolicyRule buildable = new V1PodFailurePolicyRule();
    buildable.setAction(fluent.getAction());
    buildable.setOnExitCodes(fluent.getOnExitCodes());
    buildable.setOnPodConditions(fluent.getOnPodConditions());
    return buildable;
  }
  
}