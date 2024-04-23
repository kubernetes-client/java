package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CustomResourceDefinitionVersionBuilder extends V1CustomResourceDefinitionVersionFluent<V1CustomResourceDefinitionVersionBuilder> implements VisitableBuilder<V1CustomResourceDefinitionVersion,V1CustomResourceDefinitionVersionBuilder>{
  public V1CustomResourceDefinitionVersionBuilder() {
    this(new V1CustomResourceDefinitionVersion());
  }
  
  public V1CustomResourceDefinitionVersionBuilder(V1CustomResourceDefinitionVersionFluent<?> fluent) {
    this(fluent, new V1CustomResourceDefinitionVersion());
  }
  
  public V1CustomResourceDefinitionVersionBuilder(V1CustomResourceDefinitionVersionFluent<?> fluent,V1CustomResourceDefinitionVersion instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CustomResourceDefinitionVersionBuilder(V1CustomResourceDefinitionVersion instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CustomResourceDefinitionVersionFluent<?> fluent;
  
  public V1CustomResourceDefinitionVersion build() {
    V1CustomResourceDefinitionVersion buildable = new V1CustomResourceDefinitionVersion();
    buildable.setAdditionalPrinterColumns(fluent.buildAdditionalPrinterColumns());
    buildable.setDeprecated(fluent.getDeprecated());
    buildable.setDeprecationWarning(fluent.getDeprecationWarning());
    buildable.setName(fluent.getName());
    buildable.setSchema(fluent.buildSchema());
    buildable.setSelectableFields(fluent.buildSelectableFields());
    buildable.setServed(fluent.getServed());
    buildable.setStorage(fluent.getStorage());
    buildable.setSubresources(fluent.buildSubresources());
    return buildable;
  }
  

}