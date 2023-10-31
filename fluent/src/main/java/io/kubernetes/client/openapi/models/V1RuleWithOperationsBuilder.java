package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1RuleWithOperationsBuilder extends V1RuleWithOperationsFluent<V1RuleWithOperationsBuilder> implements VisitableBuilder<V1RuleWithOperations,V1RuleWithOperationsBuilder>{
  public V1RuleWithOperationsBuilder() {
    this(new V1RuleWithOperations());
  }
  
  public V1RuleWithOperationsBuilder(V1RuleWithOperationsFluent<?> fluent) {
    this(fluent, new V1RuleWithOperations());
  }
  
  public V1RuleWithOperationsBuilder(V1RuleWithOperationsFluent<?> fluent,V1RuleWithOperations instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1RuleWithOperationsBuilder(V1RuleWithOperations instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1RuleWithOperationsFluent<?> fluent;
  
  public V1RuleWithOperations build() {
    V1RuleWithOperations buildable = new V1RuleWithOperations();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setApiVersions(fluent.getApiVersions());
    buildable.setOperations(fluent.getOperations());
    buildable.setResources(fluent.getResources());
    buildable.setScope(fluent.getScope());
    return buildable;
  }
  

}