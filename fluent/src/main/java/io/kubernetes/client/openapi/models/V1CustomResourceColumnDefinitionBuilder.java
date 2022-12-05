package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CustomResourceColumnDefinitionBuilder extends V1CustomResourceColumnDefinitionFluentImpl<V1CustomResourceColumnDefinitionBuilder> implements VisitableBuilder<V1CustomResourceColumnDefinition,V1CustomResourceColumnDefinitionBuilder>{
  public V1CustomResourceColumnDefinitionBuilder() {
    this(false);
  }
  public V1CustomResourceColumnDefinitionBuilder(Boolean validationEnabled) {
    this(new V1CustomResourceColumnDefinition(), validationEnabled);
  }
  public V1CustomResourceColumnDefinitionBuilder(V1CustomResourceColumnDefinitionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CustomResourceColumnDefinitionBuilder(V1CustomResourceColumnDefinitionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CustomResourceColumnDefinition(), validationEnabled);
  }
  public V1CustomResourceColumnDefinitionBuilder(V1CustomResourceColumnDefinitionFluent<?> fluent,V1CustomResourceColumnDefinition instance) {
    this(fluent, instance, false);
  }
  public V1CustomResourceColumnDefinitionBuilder(V1CustomResourceColumnDefinitionFluent<?> fluent,V1CustomResourceColumnDefinition instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDescription(instance.getDescription());

    fluent.withFormat(instance.getFormat());

    fluent.withJsonPath(instance.getJsonPath());

    fluent.withName(instance.getName());

    fluent.withPriority(instance.getPriority());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1CustomResourceColumnDefinitionBuilder(V1CustomResourceColumnDefinition instance) {
    this(instance,false);
  }
  public V1CustomResourceColumnDefinitionBuilder(V1CustomResourceColumnDefinition instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withDescription(instance.getDescription());

    this.withFormat(instance.getFormat());

    this.withJsonPath(instance.getJsonPath());

    this.withName(instance.getName());

    this.withPriority(instance.getPriority());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1CustomResourceColumnDefinitionFluent<?> fluent;
  Boolean validationEnabled;
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