package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1MigrationConditionBuilder extends V1alpha1MigrationConditionFluent<V1alpha1MigrationConditionBuilder> implements VisitableBuilder<V1alpha1MigrationCondition,V1alpha1MigrationConditionBuilder>{
  public V1alpha1MigrationConditionBuilder() {
    this(new V1alpha1MigrationCondition());
  }
  
  public V1alpha1MigrationConditionBuilder(V1alpha1MigrationConditionFluent<?> fluent) {
    this(fluent, new V1alpha1MigrationCondition());
  }
  
  public V1alpha1MigrationConditionBuilder(V1alpha1MigrationConditionFluent<?> fluent,V1alpha1MigrationCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1MigrationConditionBuilder(V1alpha1MigrationCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1MigrationConditionFluent<?> fluent;
  
  public V1alpha1MigrationCondition build() {
    V1alpha1MigrationCondition buildable = new V1alpha1MigrationCondition();
    buildable.setLastUpdateTime(fluent.getLastUpdateTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}