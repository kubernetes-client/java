package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1NamedRuleWithOperationsBuilder extends V1beta1NamedRuleWithOperationsFluent<V1beta1NamedRuleWithOperationsBuilder> implements VisitableBuilder<V1beta1NamedRuleWithOperations,V1beta1NamedRuleWithOperationsBuilder>{
  public V1beta1NamedRuleWithOperationsBuilder() {
    this(new V1beta1NamedRuleWithOperations());
  }
  
  public V1beta1NamedRuleWithOperationsBuilder(V1beta1NamedRuleWithOperationsFluent<?> fluent) {
    this(fluent, new V1beta1NamedRuleWithOperations());
  }
  
  public V1beta1NamedRuleWithOperationsBuilder(V1beta1NamedRuleWithOperationsFluent<?> fluent,V1beta1NamedRuleWithOperations instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1NamedRuleWithOperationsBuilder(V1beta1NamedRuleWithOperations instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1NamedRuleWithOperationsFluent<?> fluent;
  
  public V1beta1NamedRuleWithOperations build() {
    V1beta1NamedRuleWithOperations buildable = new V1beta1NamedRuleWithOperations();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setApiVersions(fluent.getApiVersions());
    buildable.setOperations(fluent.getOperations());
    buildable.setResourceNames(fluent.getResourceNames());
    buildable.setResources(fluent.getResources());
    buildable.setScope(fluent.getScope());
    return buildable;
  }
  

}