package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3ResourcePolicyRuleBuilder extends V1beta3ResourcePolicyRuleFluentImpl<V1beta3ResourcePolicyRuleBuilder> implements VisitableBuilder<V1beta3ResourcePolicyRule,V1beta3ResourcePolicyRuleBuilder>{
  public V1beta3ResourcePolicyRuleBuilder() {
    this(false);
  }
  public V1beta3ResourcePolicyRuleBuilder(Boolean validationEnabled) {
    this(new V1beta3ResourcePolicyRule(), validationEnabled);
  }
  public V1beta3ResourcePolicyRuleBuilder(V1beta3ResourcePolicyRuleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3ResourcePolicyRuleBuilder(V1beta3ResourcePolicyRuleFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3ResourcePolicyRule(), validationEnabled);
  }
  public V1beta3ResourcePolicyRuleBuilder(V1beta3ResourcePolicyRuleFluent<?> fluent,V1beta3ResourcePolicyRule instance) {
    this(fluent, instance, false);
  }
  public V1beta3ResourcePolicyRuleBuilder(V1beta3ResourcePolicyRuleFluent<?> fluent,V1beta3ResourcePolicyRule instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiGroups(instance.getApiGroups());
      fluent.withClusterScope(instance.getClusterScope());
      fluent.withNamespaces(instance.getNamespaces());
      fluent.withResources(instance.getResources());
      fluent.withVerbs(instance.getVerbs());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta3ResourcePolicyRuleBuilder(V1beta3ResourcePolicyRule instance) {
    this(instance,false);
  }
  public V1beta3ResourcePolicyRuleBuilder(V1beta3ResourcePolicyRule instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiGroups(instance.getApiGroups());
      this.withClusterScope(instance.getClusterScope());
      this.withNamespaces(instance.getNamespaces());
      this.withResources(instance.getResources());
      this.withVerbs(instance.getVerbs());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta3ResourcePolicyRuleFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta3ResourcePolicyRule build() {
    V1beta3ResourcePolicyRule buildable = new V1beta3ResourcePolicyRule();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setClusterScope(fluent.getClusterScope());
    buildable.setNamespaces(fluent.getNamespaces());
    buildable.setResources(fluent.getResources());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  
}