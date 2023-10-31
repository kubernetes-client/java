package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1MatchConditionBuilder extends V1beta1MatchConditionFluent<V1beta1MatchConditionBuilder> implements VisitableBuilder<V1beta1MatchCondition,V1beta1MatchConditionBuilder>{
  public V1beta1MatchConditionBuilder() {
    this(new V1beta1MatchCondition());
  }
  
  public V1beta1MatchConditionBuilder(V1beta1MatchConditionFluent<?> fluent) {
    this(fluent, new V1beta1MatchCondition());
  }
  
  public V1beta1MatchConditionBuilder(V1beta1MatchConditionFluent<?> fluent,V1beta1MatchCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1MatchConditionBuilder(V1beta1MatchCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1MatchConditionFluent<?> fluent;
  
  public V1beta1MatchCondition build() {
    V1beta1MatchCondition buildable = new V1beta1MatchCondition();
    buildable.setExpression(fluent.getExpression());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}