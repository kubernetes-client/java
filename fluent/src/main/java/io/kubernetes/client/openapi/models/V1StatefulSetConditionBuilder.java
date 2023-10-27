package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1StatefulSetConditionBuilder extends V1StatefulSetConditionFluent<V1StatefulSetConditionBuilder> implements VisitableBuilder<V1StatefulSetCondition,V1StatefulSetConditionBuilder>{
  public V1StatefulSetConditionBuilder() {
    this(new V1StatefulSetCondition());
  }
  
  public V1StatefulSetConditionBuilder(V1StatefulSetConditionFluent<?> fluent) {
    this(fluent, new V1StatefulSetCondition());
  }
  
  public V1StatefulSetConditionBuilder(V1StatefulSetConditionFluent<?> fluent,V1StatefulSetCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1StatefulSetConditionBuilder(V1StatefulSetCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1StatefulSetConditionFluent<?> fluent;
  
  public V1StatefulSetCondition build() {
    V1StatefulSetCondition buildable = new V1StatefulSetCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}