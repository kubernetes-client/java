package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1RuleWithOperationsBuilder extends V1RuleWithOperationsFluentImpl<V1RuleWithOperationsBuilder> implements VisitableBuilder<V1RuleWithOperations,V1RuleWithOperationsBuilder>{
  public V1RuleWithOperationsBuilder() {
    this(false);
  }
  public V1RuleWithOperationsBuilder(Boolean validationEnabled) {
    this(new V1RuleWithOperations(), validationEnabled);
  }
  public V1RuleWithOperationsBuilder(V1RuleWithOperationsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1RuleWithOperationsBuilder(V1RuleWithOperationsFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1RuleWithOperations(), validationEnabled);
  }
  public V1RuleWithOperationsBuilder(V1RuleWithOperationsFluent<?> fluent,V1RuleWithOperations instance) {
    this(fluent, instance, false);
  }
  public V1RuleWithOperationsBuilder(V1RuleWithOperationsFluent<?> fluent,V1RuleWithOperations instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiGroups(instance.getApiGroups());

    fluent.withApiVersions(instance.getApiVersions());

    fluent.withOperations(instance.getOperations());

    fluent.withResources(instance.getResources());

    fluent.withScope(instance.getScope());

    this.validationEnabled = validationEnabled; 
  }
  public V1RuleWithOperationsBuilder(V1RuleWithOperations instance) {
    this(instance,false);
  }
  public V1RuleWithOperationsBuilder(V1RuleWithOperations instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiGroups(instance.getApiGroups());

    this.withApiVersions(instance.getApiVersions());

    this.withOperations(instance.getOperations());

    this.withResources(instance.getResources());

    this.withScope(instance.getScope());

    this.validationEnabled = validationEnabled; 
  }
  V1RuleWithOperationsFluent<?> fluent;
  Boolean validationEnabled;
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