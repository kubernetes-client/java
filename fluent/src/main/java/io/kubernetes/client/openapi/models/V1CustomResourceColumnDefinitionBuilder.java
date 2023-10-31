package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CustomResourceColumnDefinitionBuilder extends V1CustomResourceColumnDefinitionFluent<V1CustomResourceColumnDefinitionBuilder> implements VisitableBuilder<V1CustomResourceColumnDefinition,V1CustomResourceColumnDefinitionBuilder>{
  public V1CustomResourceColumnDefinitionBuilder() {
    this(new V1CustomResourceColumnDefinition());
  }
  
  public V1CustomResourceColumnDefinitionBuilder(V1CustomResourceColumnDefinitionFluent<?> fluent) {
    this(fluent, new V1CustomResourceColumnDefinition());
  }
  
  public V1CustomResourceColumnDefinitionBuilder(V1CustomResourceColumnDefinitionFluent<?> fluent,V1CustomResourceColumnDefinition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CustomResourceColumnDefinitionBuilder(V1CustomResourceColumnDefinition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CustomResourceColumnDefinitionFluent<?> fluent;
  
  public V1CustomResourceColumnDefinition build() {
    V1CustomResourceColumnDefinition buildable = new V1CustomResourceColumnDefinition();
    buildable.setDescription(fluent.getDescription());
    buildable.setFormat(fluent.getFormat());
    buildable.setJsonPath(fluent.getJsonPath());
    buildable.setName(fluent.getName());
    buildable.setPriority(fluent.getPriority());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}