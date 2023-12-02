package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1NamedRuleWithOperationsBuilder extends V1alpha1NamedRuleWithOperationsFluent<V1alpha1NamedRuleWithOperationsBuilder> implements VisitableBuilder<V1alpha1NamedRuleWithOperations,V1alpha1NamedRuleWithOperationsBuilder>{
  public V1alpha1NamedRuleWithOperationsBuilder() {
    this(new V1alpha1NamedRuleWithOperations());
  }
  
  public V1alpha1NamedRuleWithOperationsBuilder(V1alpha1NamedRuleWithOperationsFluent<?> fluent) {
    this(fluent, new V1alpha1NamedRuleWithOperations());
  }
  
  public V1alpha1NamedRuleWithOperationsBuilder(V1alpha1NamedRuleWithOperationsFluent<?> fluent,V1alpha1NamedRuleWithOperations instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1NamedRuleWithOperationsBuilder(V1alpha1NamedRuleWithOperations instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1NamedRuleWithOperationsFluent<?> fluent;
  
  public V1alpha1NamedRuleWithOperations build() {
    V1alpha1NamedRuleWithOperations buildable = new V1alpha1NamedRuleWithOperations();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setApiVersions(fluent.getApiVersions());
    buildable.setOperations(fluent.getOperations());
    buildable.setResourceNames(fluent.getResourceNames());
    buildable.setResources(fluent.getResources());
    buildable.setScope(fluent.getScope());
    return buildable;
  }
  

}