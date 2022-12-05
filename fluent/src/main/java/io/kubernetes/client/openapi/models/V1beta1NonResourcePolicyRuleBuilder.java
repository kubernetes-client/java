package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1NonResourcePolicyRuleBuilder extends V1beta1NonResourcePolicyRuleFluentImpl<V1beta1NonResourcePolicyRuleBuilder> implements VisitableBuilder<V1beta1NonResourcePolicyRule,V1beta1NonResourcePolicyRuleBuilder>{
  public V1beta1NonResourcePolicyRuleBuilder() {
    this(false);
  }
  public V1beta1NonResourcePolicyRuleBuilder(Boolean validationEnabled) {
    this(new V1beta1NonResourcePolicyRule(), validationEnabled);
  }
  public V1beta1NonResourcePolicyRuleBuilder(V1beta1NonResourcePolicyRuleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1NonResourcePolicyRuleBuilder(V1beta1NonResourcePolicyRuleFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1NonResourcePolicyRule(), validationEnabled);
  }
  public V1beta1NonResourcePolicyRuleBuilder(V1beta1NonResourcePolicyRuleFluent<?> fluent,V1beta1NonResourcePolicyRule instance) {
    this(fluent, instance, false);
  }
  public V1beta1NonResourcePolicyRuleBuilder(V1beta1NonResourcePolicyRuleFluent<?> fluent,V1beta1NonResourcePolicyRule instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withNonResourceURLs(instance.getNonResourceURLs());

    fluent.withVerbs(instance.getVerbs());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1NonResourcePolicyRuleBuilder(V1beta1NonResourcePolicyRule instance) {
    this(instance,false);
  }
  public V1beta1NonResourcePolicyRuleBuilder(V1beta1NonResourcePolicyRule instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withNonResourceURLs(instance.getNonResourceURLs());

    this.withVerbs(instance.getVerbs());

    this.validationEnabled = validationEnabled; 
  }
  V1beta1NonResourcePolicyRuleFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1NonResourcePolicyRule build() {
    V1beta1NonResourcePolicyRule buildable = new V1beta1NonResourcePolicyRule();
    buildable.setNonResourceURLs(fluent.getNonResourceURLs());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  
}