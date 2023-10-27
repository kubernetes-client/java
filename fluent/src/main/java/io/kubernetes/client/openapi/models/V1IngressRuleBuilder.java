package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1IngressRuleBuilder extends V1IngressRuleFluent<V1IngressRuleBuilder> implements VisitableBuilder<V1IngressRule,V1IngressRuleBuilder>{
  public V1IngressRuleBuilder() {
    this(new V1IngressRule());
  }
  
  public V1IngressRuleBuilder(V1IngressRuleFluent<?> fluent) {
    this(fluent, new V1IngressRule());
  }
  
  public V1IngressRuleBuilder(V1IngressRuleFluent<?> fluent,V1IngressRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1IngressRuleBuilder(V1IngressRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1IngressRuleFluent<?> fluent;
  
  public V1IngressRule build() {
    V1IngressRule buildable = new V1IngressRule();
    buildable.setHost(fluent.getHost());
    buildable.setHttp(fluent.buildHttp());
    return buildable;
  }
  

}