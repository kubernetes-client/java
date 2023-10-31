package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1MatchConditionBuilder extends V1alpha1MatchConditionFluent<V1alpha1MatchConditionBuilder> implements VisitableBuilder<V1alpha1MatchCondition,V1alpha1MatchConditionBuilder>{
  public V1alpha1MatchConditionBuilder() {
    this(new V1alpha1MatchCondition());
  }
  
  public V1alpha1MatchConditionBuilder(V1alpha1MatchConditionFluent<?> fluent) {
    this(fluent, new V1alpha1MatchCondition());
  }
  
  public V1alpha1MatchConditionBuilder(V1alpha1MatchConditionFluent<?> fluent,V1alpha1MatchCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1MatchConditionBuilder(V1alpha1MatchCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1MatchConditionFluent<?> fluent;
  
  public V1alpha1MatchCondition build() {
    V1alpha1MatchCondition buildable = new V1alpha1MatchCondition();
    buildable.setExpression(fluent.getExpression());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}