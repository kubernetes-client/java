package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1NonResourcePolicyRuleBuilder extends V1NonResourcePolicyRuleFluent<V1NonResourcePolicyRuleBuilder> implements VisitableBuilder<V1NonResourcePolicyRule,V1NonResourcePolicyRuleBuilder>{

  V1NonResourcePolicyRuleFluent<?> fluent;

  public V1NonResourcePolicyRuleBuilder() {
    this(new V1NonResourcePolicyRule());
  }
  
  public V1NonResourcePolicyRuleBuilder(V1NonResourcePolicyRuleFluent<?> fluent) {
    this(fluent, new V1NonResourcePolicyRule());
  }
  
  public V1NonResourcePolicyRuleBuilder(V1NonResourcePolicyRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NonResourcePolicyRuleBuilder(V1NonResourcePolicyRuleFluent<?> fluent,V1NonResourcePolicyRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NonResourcePolicyRule build() {
    V1NonResourcePolicyRule buildable = new V1NonResourcePolicyRule();
    buildable.setNonResourceURLs(fluent.getNonResourceURLs());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  
}