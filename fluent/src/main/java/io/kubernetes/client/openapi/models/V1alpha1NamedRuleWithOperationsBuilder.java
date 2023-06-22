package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1NamedRuleWithOperationsBuilder extends V1alpha1NamedRuleWithOperationsFluentImpl<V1alpha1NamedRuleWithOperationsBuilder> implements VisitableBuilder<V1alpha1NamedRuleWithOperations,V1alpha1NamedRuleWithOperationsBuilder>{
  public V1alpha1NamedRuleWithOperationsBuilder() {
    this(false);
  }
  public V1alpha1NamedRuleWithOperationsBuilder(Boolean validationEnabled) {
    this(new V1alpha1NamedRuleWithOperations(), validationEnabled);
  }
  public V1alpha1NamedRuleWithOperationsBuilder(V1alpha1NamedRuleWithOperationsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1NamedRuleWithOperationsBuilder(V1alpha1NamedRuleWithOperationsFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1NamedRuleWithOperations(), validationEnabled);
  }
  public V1alpha1NamedRuleWithOperationsBuilder(V1alpha1NamedRuleWithOperationsFluent<?> fluent,V1alpha1NamedRuleWithOperations instance) {
    this(fluent, instance, false);
  }
  public V1alpha1NamedRuleWithOperationsBuilder(V1alpha1NamedRuleWithOperationsFluent<?> fluent,V1alpha1NamedRuleWithOperations instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiGroups(instance.getApiGroups());
      fluent.withApiVersions(instance.getApiVersions());
      fluent.withOperations(instance.getOperations());
      fluent.withResourceNames(instance.getResourceNames());
      fluent.withResources(instance.getResources());
      fluent.withScope(instance.getScope());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1NamedRuleWithOperationsBuilder(V1alpha1NamedRuleWithOperations instance) {
    this(instance,false);
  }
  public V1alpha1NamedRuleWithOperationsBuilder(V1alpha1NamedRuleWithOperations instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiGroups(instance.getApiGroups());
      this.withApiVersions(instance.getApiVersions());
      this.withOperations(instance.getOperations());
      this.withResourceNames(instance.getResourceNames());
      this.withResources(instance.getResources());
      this.withScope(instance.getScope());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1NamedRuleWithOperationsFluent<?> fluent;
  Boolean validationEnabled;
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