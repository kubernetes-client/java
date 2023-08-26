package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1MatchConditionBuilder extends V1alpha1MatchConditionFluentImpl<V1alpha1MatchConditionBuilder> implements VisitableBuilder<V1alpha1MatchCondition,V1alpha1MatchConditionBuilder>{
  public V1alpha1MatchConditionBuilder() {
    this(false);
  }
  public V1alpha1MatchConditionBuilder(Boolean validationEnabled) {
    this(new V1alpha1MatchCondition(), validationEnabled);
  }
  public V1alpha1MatchConditionBuilder(V1alpha1MatchConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1MatchConditionBuilder(V1alpha1MatchConditionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1MatchCondition(), validationEnabled);
  }
  public V1alpha1MatchConditionBuilder(V1alpha1MatchConditionFluent<?> fluent,V1alpha1MatchCondition instance) {
    this(fluent, instance, false);
  }
  public V1alpha1MatchConditionBuilder(V1alpha1MatchConditionFluent<?> fluent,V1alpha1MatchCondition instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withExpression(instance.getExpression());
      fluent.withName(instance.getName());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1MatchConditionBuilder(V1alpha1MatchCondition instance) {
    this(instance,false);
  }
  public V1alpha1MatchConditionBuilder(V1alpha1MatchCondition instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withExpression(instance.getExpression());
      this.withName(instance.getName());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1MatchConditionFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1MatchCondition build() {
    V1alpha1MatchCondition buildable = new V1alpha1MatchCondition();
    buildable.setExpression(fluent.getExpression());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}