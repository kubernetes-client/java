package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3NonResourcePolicyRuleBuilder extends V1beta3NonResourcePolicyRuleFluentImpl<V1beta3NonResourcePolicyRuleBuilder> implements VisitableBuilder<V1beta3NonResourcePolicyRule,V1beta3NonResourcePolicyRuleBuilder>{
  public V1beta3NonResourcePolicyRuleBuilder() {
    this(false);
  }
  public V1beta3NonResourcePolicyRuleBuilder(Boolean validationEnabled) {
    this(new V1beta3NonResourcePolicyRule(), validationEnabled);
  }
  public V1beta3NonResourcePolicyRuleBuilder(V1beta3NonResourcePolicyRuleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3NonResourcePolicyRuleBuilder(V1beta3NonResourcePolicyRuleFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3NonResourcePolicyRule(), validationEnabled);
  }
  public V1beta3NonResourcePolicyRuleBuilder(V1beta3NonResourcePolicyRuleFluent<?> fluent,V1beta3NonResourcePolicyRule instance) {
    this(fluent, instance, false);
  }
  public V1beta3NonResourcePolicyRuleBuilder(V1beta3NonResourcePolicyRuleFluent<?> fluent,V1beta3NonResourcePolicyRule instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withNonResourceURLs(instance.getNonResourceURLs());
      fluent.withVerbs(instance.getVerbs());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta3NonResourcePolicyRuleBuilder(V1beta3NonResourcePolicyRule instance) {
    this(instance,false);
  }
  public V1beta3NonResourcePolicyRuleBuilder(V1beta3NonResourcePolicyRule instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withNonResourceURLs(instance.getNonResourceURLs());
      this.withVerbs(instance.getVerbs());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta3NonResourcePolicyRuleFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta3NonResourcePolicyRule build() {
    V1beta3NonResourcePolicyRule buildable = new V1beta3NonResourcePolicyRule();
    buildable.setNonResourceURLs(fluent.getNonResourceURLs());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  
}