package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1IngressRuleBuilder extends V1IngressRuleFluentImpl<V1IngressRuleBuilder> implements VisitableBuilder<V1IngressRule,V1IngressRuleBuilder>{
  public V1IngressRuleBuilder() {
    this(false);
  }
  public V1IngressRuleBuilder(Boolean validationEnabled) {
    this(new V1IngressRule(), validationEnabled);
  }
  public V1IngressRuleBuilder(V1IngressRuleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1IngressRuleBuilder(V1IngressRuleFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1IngressRule(), validationEnabled);
  }
  public V1IngressRuleBuilder(V1IngressRuleFluent<?> fluent,V1IngressRule instance) {
    this(fluent, instance, false);
  }
  public V1IngressRuleBuilder(V1IngressRuleFluent<?> fluent,V1IngressRule instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withHost(instance.getHost());

    fluent.withHttp(instance.getHttp());

    this.validationEnabled = validationEnabled; 
  }
  public V1IngressRuleBuilder(V1IngressRule instance) {
    this(instance,false);
  }
  public V1IngressRuleBuilder(V1IngressRule instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withHost(instance.getHost());

    this.withHttp(instance.getHttp());

    this.validationEnabled = validationEnabled; 
  }
  V1IngressRuleFluent<?> fluent;
  Boolean validationEnabled;
  public V1IngressRule build() {
    V1IngressRule buildable = new V1IngressRule();
    buildable.setHost(fluent.getHost());
    buildable.setHttp(fluent.getHttp());
    return buildable;
  }
  
}