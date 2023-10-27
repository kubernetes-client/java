package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CustomResourceDefinitionNamesBuilder extends V1CustomResourceDefinitionNamesFluent<V1CustomResourceDefinitionNamesBuilder> implements VisitableBuilder<V1CustomResourceDefinitionNames,V1CustomResourceDefinitionNamesBuilder>{
  public V1CustomResourceDefinitionNamesBuilder() {
    this(new V1CustomResourceDefinitionNames());
  }
  
  public V1CustomResourceDefinitionNamesBuilder(V1CustomResourceDefinitionNamesFluent<?> fluent) {
    this(fluent, new V1CustomResourceDefinitionNames());
  }
  
  public V1CustomResourceDefinitionNamesBuilder(V1CustomResourceDefinitionNamesFluent<?> fluent,V1CustomResourceDefinitionNames instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CustomResourceDefinitionNamesBuilder(V1CustomResourceDefinitionNames instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CustomResourceDefinitionNamesFluent<?> fluent;
  
  public V1CustomResourceDefinitionNames build() {
    V1CustomResourceDefinitionNames buildable = new V1CustomResourceDefinitionNames();
    buildable.setCategories(fluent.getCategories());
    buildable.setKind(fluent.getKind());
    buildable.setListKind(fluent.getListKind());
    buildable.setPlural(fluent.getPlural());
    buildable.setShortNames(fluent.getShortNames());
    buildable.setSingular(fluent.getSingular());
    return buildable;
  }
  

}