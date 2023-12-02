package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PolicyRuleBuilder extends V1PolicyRuleFluent<V1PolicyRuleBuilder> implements VisitableBuilder<V1PolicyRule,V1PolicyRuleBuilder>{
  public V1PolicyRuleBuilder() {
    this(new V1PolicyRule());
  }
  
  public V1PolicyRuleBuilder(V1PolicyRuleFluent<?> fluent) {
    this(fluent, new V1PolicyRule());
  }
  
  public V1PolicyRuleBuilder(V1PolicyRuleFluent<?> fluent,V1PolicyRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PolicyRuleBuilder(V1PolicyRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PolicyRuleFluent<?> fluent;
  
  public V1PolicyRule build() {
    V1PolicyRule buildable = new V1PolicyRule();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setNonResourceURLs(fluent.getNonResourceURLs());
    buildable.setResourceNames(fluent.getResourceNames());
    buildable.setResources(fluent.getResources());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  

}