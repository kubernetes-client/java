package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CustomResourceDefinitionStatusBuilder extends V1CustomResourceDefinitionStatusFluentImpl<V1CustomResourceDefinitionStatusBuilder> implements VisitableBuilder<V1CustomResourceDefinitionStatus,V1CustomResourceDefinitionStatusBuilder>{
  public V1CustomResourceDefinitionStatusBuilder() {
    this(false);
  }
  public V1CustomResourceDefinitionStatusBuilder(Boolean validationEnabled) {
    this(new V1CustomResourceDefinitionStatus(), validationEnabled);
  }
  public V1CustomResourceDefinitionStatusBuilder(V1CustomResourceDefinitionStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CustomResourceDefinitionStatusBuilder(V1CustomResourceDefinitionStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CustomResourceDefinitionStatus(), validationEnabled);
  }
  public V1CustomResourceDefinitionStatusBuilder(V1CustomResourceDefinitionStatusFluent<?> fluent,V1CustomResourceDefinitionStatus instance) {
    this(fluent, instance, false);
  }
  public V1CustomResourceDefinitionStatusBuilder(V1CustomResourceDefinitionStatusFluent<?> fluent,V1CustomResourceDefinitionStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAcceptedNames(instance.getAcceptedNames());

    fluent.withConditions(instance.getConditions());

    fluent.withStoredVersions(instance.getStoredVersions());

    this.validationEnabled = validationEnabled; 
  }
  public V1CustomResourceDefinitionStatusBuilder(V1CustomResourceDefinitionStatus instance) {
    this(instance,false);
  }
  public V1CustomResourceDefinitionStatusBuilder(V1CustomResourceDefinitionStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAcceptedNames(instance.getAcceptedNames());

    this.withConditions(instance.getConditions());

    this.withStoredVersions(instance.getStoredVersions());

    this.validationEnabled = validationEnabled; 
  }
  V1CustomResourceDefinitionStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1CustomResourceDefinitionStatus build() {
    V1CustomResourceDefinitionStatus buildable = new V1CustomResourceDefinitionStatus();
    buildable.setAcceptedNames(fluent.getAcceptedNames());
    buildable.setConditions(fluent.getConditions());
    buildable.setStoredVersions(fluent.getStoredVersions());
    return buildable;
  }
  
}