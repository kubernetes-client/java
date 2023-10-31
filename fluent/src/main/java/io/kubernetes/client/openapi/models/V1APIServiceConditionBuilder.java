package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1APIServiceConditionBuilder extends V1APIServiceConditionFluent<V1APIServiceConditionBuilder> implements VisitableBuilder<V1APIServiceCondition,V1APIServiceConditionBuilder>{
  public V1APIServiceConditionBuilder() {
    this(new V1APIServiceCondition());
  }
  
  public V1APIServiceConditionBuilder(V1APIServiceConditionFluent<?> fluent) {
    this(fluent, new V1APIServiceCondition());
  }
  
  public V1APIServiceConditionBuilder(V1APIServiceConditionFluent<?> fluent,V1APIServiceCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1APIServiceConditionBuilder(V1APIServiceCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1APIServiceConditionFluent<?> fluent;
  
  public V1APIServiceCondition build() {
    V1APIServiceCondition buildable = new V1APIServiceCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}