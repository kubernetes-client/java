package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1MatchConditionBuilder extends V1MatchConditionFluent<V1MatchConditionBuilder> implements VisitableBuilder<V1MatchCondition,V1MatchConditionBuilder>{
  public V1MatchConditionBuilder() {
    this(new V1MatchCondition());
  }
  
  public V1MatchConditionBuilder(V1MatchConditionFluent<?> fluent) {
    this(fluent, new V1MatchCondition());
  }
  
  public V1MatchConditionBuilder(V1MatchConditionFluent<?> fluent,V1MatchCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1MatchConditionBuilder(V1MatchCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1MatchConditionFluent<?> fluent;
  
  public V1MatchCondition build() {
    V1MatchCondition buildable = new V1MatchCondition();
    buildable.setExpression(fluent.getExpression());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}