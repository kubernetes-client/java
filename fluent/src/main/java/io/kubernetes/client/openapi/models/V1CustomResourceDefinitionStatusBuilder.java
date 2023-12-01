package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CustomResourceDefinitionStatusBuilder extends V1CustomResourceDefinitionStatusFluent<V1CustomResourceDefinitionStatusBuilder> implements VisitableBuilder<V1CustomResourceDefinitionStatus,V1CustomResourceDefinitionStatusBuilder>{
  public V1CustomResourceDefinitionStatusBuilder() {
    this(new V1CustomResourceDefinitionStatus());
  }
  
  public V1CustomResourceDefinitionStatusBuilder(V1CustomResourceDefinitionStatusFluent<?> fluent) {
    this(fluent, new V1CustomResourceDefinitionStatus());
  }
  
  public V1CustomResourceDefinitionStatusBuilder(V1CustomResourceDefinitionStatusFluent<?> fluent,V1CustomResourceDefinitionStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CustomResourceDefinitionStatusBuilder(V1CustomResourceDefinitionStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CustomResourceDefinitionStatusFluent<?> fluent;
  
  public V1CustomResourceDefinitionStatus build() {
    V1CustomResourceDefinitionStatus buildable = new V1CustomResourceDefinitionStatus();
    buildable.setAcceptedNames(fluent.buildAcceptedNames());
    buildable.setConditions(fluent.buildConditions());
    buildable.setStoredVersions(fluent.getStoredVersions());
    return buildable;
  }
  

}