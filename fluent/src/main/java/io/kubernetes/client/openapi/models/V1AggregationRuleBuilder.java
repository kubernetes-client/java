package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1AggregationRuleBuilder extends V1AggregationRuleFluent<V1AggregationRuleBuilder> implements VisitableBuilder<V1AggregationRule,V1AggregationRuleBuilder>{

  V1AggregationRuleFluent<?> fluent;

  public V1AggregationRuleBuilder() {
    this(new V1AggregationRule());
  }
  
  public V1AggregationRuleBuilder(V1AggregationRuleFluent<?> fluent) {
    this(fluent, new V1AggregationRule());
  }
  
  public V1AggregationRuleBuilder(V1AggregationRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1AggregationRuleBuilder(V1AggregationRuleFluent<?> fluent,V1AggregationRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1AggregationRule build() {
    V1AggregationRule buildable = new V1AggregationRule();
    buildable.setClusterRoleSelectors(fluent.buildClusterRoleSelectors());
    return buildable;
  }
  
}