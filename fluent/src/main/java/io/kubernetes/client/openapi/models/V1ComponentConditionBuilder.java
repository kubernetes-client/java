package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ComponentConditionBuilder extends V1ComponentConditionFluent<V1ComponentConditionBuilder> implements VisitableBuilder<V1ComponentCondition,V1ComponentConditionBuilder>{
  public V1ComponentConditionBuilder() {
    this(new V1ComponentCondition());
  }
  
  public V1ComponentConditionBuilder(V1ComponentConditionFluent<?> fluent) {
    this(fluent, new V1ComponentCondition());
  }
  
  public V1ComponentConditionBuilder(V1ComponentConditionFluent<?> fluent,V1ComponentCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ComponentConditionBuilder(V1ComponentCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ComponentConditionFluent<?> fluent;
  
  public V1ComponentCondition build() {
    V1ComponentCondition buildable = new V1ComponentCondition();
    buildable.setError(fluent.getError());
    buildable.setMessage(fluent.getMessage());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}