package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CustomResourceDefinitionConditionBuilder extends V1CustomResourceDefinitionConditionFluent<V1CustomResourceDefinitionConditionBuilder> implements VisitableBuilder<V1CustomResourceDefinitionCondition,V1CustomResourceDefinitionConditionBuilder>{
  public V1CustomResourceDefinitionConditionBuilder() {
    this(new V1CustomResourceDefinitionCondition());
  }
  
  public V1CustomResourceDefinitionConditionBuilder(V1CustomResourceDefinitionConditionFluent<?> fluent) {
    this(fluent, new V1CustomResourceDefinitionCondition());
  }
  
  public V1CustomResourceDefinitionConditionBuilder(V1CustomResourceDefinitionConditionFluent<?> fluent,V1CustomResourceDefinitionCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CustomResourceDefinitionConditionBuilder(V1CustomResourceDefinitionCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CustomResourceDefinitionConditionFluent<?> fluent;
  
  public V1CustomResourceDefinitionCondition build() {
    V1CustomResourceDefinitionCondition buildable = new V1CustomResourceDefinitionCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}