package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1HTTPIngressRuleValueBuilder extends V1HTTPIngressRuleValueFluent<V1HTTPIngressRuleValueBuilder> implements VisitableBuilder<V1HTTPIngressRuleValue,V1HTTPIngressRuleValueBuilder>{
  public V1HTTPIngressRuleValueBuilder() {
    this(new V1HTTPIngressRuleValue());
  }
  
  public V1HTTPIngressRuleValueBuilder(V1HTTPIngressRuleValueFluent<?> fluent) {
    this(fluent, new V1HTTPIngressRuleValue());
  }
  
  public V1HTTPIngressRuleValueBuilder(V1HTTPIngressRuleValueFluent<?> fluent,V1HTTPIngressRuleValue instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1HTTPIngressRuleValueBuilder(V1HTTPIngressRuleValue instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1HTTPIngressRuleValueFluent<?> fluent;
  
  public V1HTTPIngressRuleValue build() {
    V1HTTPIngressRuleValue buildable = new V1HTTPIngressRuleValue();
    buildable.setPaths(fluent.buildPaths());
    return buildable;
  }
  

}