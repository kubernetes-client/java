package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1AggregationRuleBuilder extends V1AggregationRuleFluentImpl<V1AggregationRuleBuilder> implements VisitableBuilder<V1AggregationRule,V1AggregationRuleBuilder>{
  public V1AggregationRuleBuilder() {
    this(false);
  }
  public V1AggregationRuleBuilder(Boolean validationEnabled) {
    this(new V1AggregationRule(), validationEnabled);
  }
  public V1AggregationRuleBuilder(V1AggregationRuleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1AggregationRuleBuilder(V1AggregationRuleFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1AggregationRule(), validationEnabled);
  }
  public V1AggregationRuleBuilder(V1AggregationRuleFluent<?> fluent,V1AggregationRule instance) {
    this(fluent, instance, false);
  }
  public V1AggregationRuleBuilder(V1AggregationRuleFluent<?> fluent,V1AggregationRule instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withClusterRoleSelectors(instance.getClusterRoleSelectors());

    this.validationEnabled = validationEnabled; 
  }
  public V1AggregationRuleBuilder(V1AggregationRule instance) {
    this(instance,false);
  }
  public V1AggregationRuleBuilder(V1AggregationRule instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withClusterRoleSelectors(instance.getClusterRoleSelectors());

    this.validationEnabled = validationEnabled; 
  }
  V1AggregationRuleFluent<?> fluent;
  Boolean validationEnabled;
  public V1AggregationRule build() {
    V1AggregationRule buildable = new V1AggregationRule();
    buildable.setClusterRoleSelectors(fluent.getClusterRoleSelectors());
    return buildable;
  }
  
}