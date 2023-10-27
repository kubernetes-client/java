package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ResourceRuleBuilder extends V1ResourceRuleFluent<V1ResourceRuleBuilder> implements VisitableBuilder<V1ResourceRule,V1ResourceRuleBuilder>{
  public V1ResourceRuleBuilder() {
    this(new V1ResourceRule());
  }
  
  public V1ResourceRuleBuilder(V1ResourceRuleFluent<?> fluent) {
    this(fluent, new V1ResourceRule());
  }
  
  public V1ResourceRuleBuilder(V1ResourceRuleFluent<?> fluent,V1ResourceRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ResourceRuleBuilder(V1ResourceRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ResourceRuleFluent<?> fluent;
  
  public V1ResourceRule build() {
    V1ResourceRule buildable = new V1ResourceRule();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setResourceNames(fluent.getResourceNames());
    buildable.setResources(fluent.getResources());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  

}