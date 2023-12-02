package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NonResourceRuleBuilder extends V1NonResourceRuleFluent<V1NonResourceRuleBuilder> implements VisitableBuilder<V1NonResourceRule,V1NonResourceRuleBuilder>{
  public V1NonResourceRuleBuilder() {
    this(new V1NonResourceRule());
  }
  
  public V1NonResourceRuleBuilder(V1NonResourceRuleFluent<?> fluent) {
    this(fluent, new V1NonResourceRule());
  }
  
  public V1NonResourceRuleBuilder(V1NonResourceRuleFluent<?> fluent,V1NonResourceRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NonResourceRuleBuilder(V1NonResourceRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NonResourceRuleFluent<?> fluent;
  
  public V1NonResourceRule build() {
    V1NonResourceRule buildable = new V1NonResourceRule();
    buildable.setNonResourceURLs(fluent.getNonResourceURLs());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  

}