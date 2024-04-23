package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NamedRuleWithOperationsBuilder extends V1NamedRuleWithOperationsFluent<V1NamedRuleWithOperationsBuilder> implements VisitableBuilder<V1NamedRuleWithOperations,V1NamedRuleWithOperationsBuilder>{
  public V1NamedRuleWithOperationsBuilder() {
    this(new V1NamedRuleWithOperations());
  }
  
  public V1NamedRuleWithOperationsBuilder(V1NamedRuleWithOperationsFluent<?> fluent) {
    this(fluent, new V1NamedRuleWithOperations());
  }
  
  public V1NamedRuleWithOperationsBuilder(V1NamedRuleWithOperationsFluent<?> fluent,V1NamedRuleWithOperations instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NamedRuleWithOperationsBuilder(V1NamedRuleWithOperations instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NamedRuleWithOperationsFluent<?> fluent;
  
  public V1NamedRuleWithOperations build() {
    V1NamedRuleWithOperations buildable = new V1NamedRuleWithOperations();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setApiVersions(fluent.getApiVersions());
    buildable.setOperations(fluent.getOperations());
    buildable.setResourceNames(fluent.getResourceNames());
    buildable.setResources(fluent.getResources());
    buildable.setScope(fluent.getScope());
    return buildable;
  }
  

}