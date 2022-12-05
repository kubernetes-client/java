package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta2ResourcePolicyRuleBuilder extends V1beta2ResourcePolicyRuleFluentImpl<V1beta2ResourcePolicyRuleBuilder> implements VisitableBuilder<V1beta2ResourcePolicyRule,V1beta2ResourcePolicyRuleBuilder>{
  public V1beta2ResourcePolicyRuleBuilder() {
    this(false);
  }
  public V1beta2ResourcePolicyRuleBuilder(Boolean validationEnabled) {
    this(new V1beta2ResourcePolicyRule(), validationEnabled);
  }
  public V1beta2ResourcePolicyRuleBuilder(V1beta2ResourcePolicyRuleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2ResourcePolicyRuleBuilder(V1beta2ResourcePolicyRuleFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta2ResourcePolicyRule(), validationEnabled);
  }
  public V1beta2ResourcePolicyRuleBuilder(V1beta2ResourcePolicyRuleFluent<?> fluent,V1beta2ResourcePolicyRule instance) {
    this(fluent, instance, false);
  }
  public V1beta2ResourcePolicyRuleBuilder(V1beta2ResourcePolicyRuleFluent<?> fluent,V1beta2ResourcePolicyRule instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiGroups(instance.getApiGroups());

    fluent.withClusterScope(instance.getClusterScope());

    fluent.withNamespaces(instance.getNamespaces());

    fluent.withResources(instance.getResources());

    fluent.withVerbs(instance.getVerbs());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2ResourcePolicyRuleBuilder(V1beta2ResourcePolicyRule instance) {
    this(instance,false);
  }
  public V1beta2ResourcePolicyRuleBuilder(V1beta2ResourcePolicyRule instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiGroups(instance.getApiGroups());

    this.withClusterScope(instance.getClusterScope());

    this.withNamespaces(instance.getNamespaces());

    this.withResources(instance.getResources());

    this.withVerbs(instance.getVerbs());

    this.validationEnabled = validationEnabled; 
  }
  V1beta2ResourcePolicyRuleFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta2ResourcePolicyRule build() {
    V1beta2ResourcePolicyRule buildable = new V1beta2ResourcePolicyRule();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setClusterScope(fluent.getClusterScope());
    buildable.setNamespaces(fluent.getNamespaces());
    buildable.setResources(fluent.getResources());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  
}