package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1MatchConditionBuilder extends V1MatchConditionFluentImpl<V1MatchConditionBuilder> implements VisitableBuilder<V1MatchCondition,V1MatchConditionBuilder>{
  public V1MatchConditionBuilder() {
    this(false);
  }
  public V1MatchConditionBuilder(Boolean validationEnabled) {
    this(new V1MatchCondition(), validationEnabled);
  }
  public V1MatchConditionBuilder(V1MatchConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1MatchConditionBuilder(V1MatchConditionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1MatchCondition(), validationEnabled);
  }
  public V1MatchConditionBuilder(V1MatchConditionFluent<?> fluent,V1MatchCondition instance) {
    this(fluent, instance, false);
  }
  public V1MatchConditionBuilder(V1MatchConditionFluent<?> fluent,V1MatchCondition instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withExpression(instance.getExpression());
      fluent.withName(instance.getName());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1MatchConditionBuilder(V1MatchCondition instance) {
    this(instance,false);
  }
  public V1MatchConditionBuilder(V1MatchCondition instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withExpression(instance.getExpression());
      this.withName(instance.getName());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1MatchConditionFluent<?> fluent;
  Boolean validationEnabled;
  public V1MatchCondition build() {
    V1MatchCondition buildable = new V1MatchCondition();
    buildable.setExpression(fluent.getExpression());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}